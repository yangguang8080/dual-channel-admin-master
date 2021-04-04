package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.MyTest;

/**
 * 测试Service接口
 *
 * @author ruoyi
 * @date 2021-04-04
 */
public interface IMyTestService {

    /**
     * 查询测试
     *
     * @param testId 测试ID
     * @return 测试
     */
    MyTest selectMyTestById(Long testId);

    /**
     * 查询测试列表
     *
     * @param myTest 测试
     * @return 测试集合
     */
    List<MyTest> selectMyTestList(MyTest myTest);

    /**
     * 新增测试
     *
     * @param myTest 测试
     * @return 结果
     */
    int insertMyTest(MyTest myTest);

    /**
     * 修改测试
     *
     * @param myTest 测试
     * @return 结果
     */
    int updateMyTest(MyTest myTest);

    /**
     * 批量删除测试
     *
     * @param testIds 需要删除的测试ID
     * @return 结果
     */
    int deleteMyTestByIds(Long[] testIds);

    /**
     * 删除测试信息
     *
     * @param testId 测试ID
     * @return 结果
     */
    int deleteMyTestById(Long testId);
}
