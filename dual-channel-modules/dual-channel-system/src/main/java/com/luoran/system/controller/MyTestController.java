package com.luoran.system.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.luoran.common.core.utils.PrimaryKeyIdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.luoran.common.log.annotation.Log;
import com.luoran.common.log.enums.BusinessType;
import com.luoran.common.security.annotation.PreAuthorize;
import com.luoran.system.domain.MyTest;
import com.luoran.system.service.IMyTestService;
import com.luoran.common.core.web.controller.BaseController;
import com.luoran.common.core.web.domain.AjaxResult;
import com.luoran.common.core.utils.poi.ExcelUtil;
import com.luoran.common.core.web.page.TableDataInfo;

/**
 * 测试Controller
 *
 * @author luoran
 * @date 2021-04-04
 */
@RestController
@RequestMapping("/test")
public class MyTestController extends BaseController{

    @Autowired
    private IMyTestService myTestService;

    /**
     * 查询测试列表
     */
    @PreAuthorize(hasPermi = "system:test:list")
    @GetMapping("/list")
    public TableDataInfo list(MyTest myTest) {
        startPage();
        List<MyTest> list = myTestService.selectMyTestList(myTest);
        return getDataTable(list);

    }

    /**
     * 导出测试列表
     */
    @PreAuthorize(hasPermi = "system:test:export")
    @Log(title = "测试", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MyTest myTest) throws IOException {
        List<MyTest> list = myTestService.selectMyTestList(myTest);
        ExcelUtil<MyTest> util = new ExcelUtil<MyTest>(MyTest.class);
        util.exportExcel(response, list, "test");
    }

    /**
     * 获取测试详细信息
     */
    @PreAuthorize(hasPermi = "system:test:query")
    @GetMapping(value = "/{testId}")
    public AjaxResult getInfo(@PathVariable("testId") Long testId) {
        return AjaxResult.success(myTestService.selectMyTestById(testId));
    }

    /**
     * 新增测试
     */
    @PreAuthorize(hasPermi = "system:test:add")
    @Log(title = "测试", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MyTest myTest) {
        myTest.setTestId(PrimaryKeyIdUtils.getSysIdWorker().nextId());
        return toAjax(myTestService.insertMyTest(myTest));
    }

    /**
     * 修改测试
     */
    @PreAuthorize(hasPermi = "system:test:edit")
    @Log(title = "测试", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MyTest myTest) {
        return toAjax(myTestService.updateMyTest(myTest));
    }

    /**
     * 删除测试
     */
    @PreAuthorize(hasPermi = "system:test:remove")
    @Log(title = "测试", businessType = BusinessType.DELETE)
	@DeleteMapping("/{testIds}")
    public AjaxResult remove(@PathVariable Long[] testIds) {
        return toAjax(myTestService.deleteMyTestByIds(testIds));
    }
}
