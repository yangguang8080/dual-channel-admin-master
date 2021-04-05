package com.luoran.system.mapper;

import java.util.List;
import com.luoran.system.domain.MyTest;

/**
 * 测试Mapper接口
 *
 * @author luoran
 * @date 2021-04-04
 */
public interface MyTestMapper {

    /**
     * 查询测试
     *
     * @param testId 测试ID
     * @return 测试
     */
    public MyTest selectMyTestById(Long testId);

    /**
     * 查询测试列表
     *
     * @param myTest 测试
     * @return 测试集合
     */
    public List<MyTest> selectMyTestList(MyTest myTest);

    /**
     * 新增测试
     *
     * @param myTest 测试
     * @return 结果
     */
    public int insertMyTest(MyTest myTest);

    /**
     * 修改测试
     *
     * @param myTest 测试
     * @return 结果
     */
    public int updateMyTest(MyTest myTest);

    /**
     * 删除测试
     *
     * @param testId 测试ID
     * @return 结果
     */
    public int deleteMyTestById(Long testId);

    /**
     * 批量删除测试
     *
     * @param testIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteMyTestByIds(Long[] testIds);
}
