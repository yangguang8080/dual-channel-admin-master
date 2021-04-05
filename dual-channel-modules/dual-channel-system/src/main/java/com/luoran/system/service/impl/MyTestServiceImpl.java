package com.luoran.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.luoran.system.mapper.MyTestMapper;
import com.luoran.system.domain.MyTest;
import com.luoran.system.service.IMyTestService;

/**
 * 测试Service业务层处理
 *
 * @author luoran
 * @date 2021-04-04
 */
@Service
public class MyTestServiceImpl implements IMyTestService {

    @Autowired
    private MyTestMapper myTestMapper;

    /**
     * 查询测试
     *
     * @param testId 测试ID
     * @return 测试
     */
    @Override
    public MyTest selectMyTestById(Long testId) {
        return myTestMapper.selectMyTestById(testId);
    }

    /**
     * 查询测试列表
     *
     * @param myTest 测试
     * @return 测试
     */
    @Override
    public List<MyTest> selectMyTestList(MyTest myTest) {
        return myTestMapper.selectMyTestList(myTest);
    }

    /**
     * 新增测试
     *
     * @param myTest 测试
     * @return 结果
     */
    @Override
    public int insertMyTest(MyTest myTest) {
        return myTestMapper.insertMyTest(myTest);
    }

    /**
     * 修改测试
     *
     * @param myTest 测试
     * @return 结果
     */
    @Override
    public int updateMyTest(MyTest myTest) {
        return myTestMapper.updateMyTest(myTest);
    }

    /**
     * 批量删除测试
     *
     * @param testIds 需要删除的测试ID
     * @return 结果
     */
    @Override
    public int deleteMyTestByIds(Long[] testIds) {
        return myTestMapper.deleteMyTestByIds(testIds);
    }

    /**
     * 删除测试信息
     *
     * @param testId 测试ID
     * @return 结果
     */
    @Override
    public int deleteMyTestById(Long testId) {
        return myTestMapper.deleteMyTestById(testId);
    }
}
