package com.luoran.job.task;

import com.luoran.common.core.utils.DateUtils;
import com.luoran.common.core.utils.StringUtils;
import org.springframework.stereotype.Component;

/**
 * @Package: com.luoran.job.task
 * @ClassName: TaskDemo
 * @Author: guohailong
 * @Description: 定时任务调度测试
 * @Date: 2021/4/3 20:56
 * @Version: 1.0
 */
@Component("taskDemo")
public class TaskDemo {

    public void withOutParams() {
        System.out.println(DateUtils.getMillisecondTime() + "  -----> 执行无参方法");
    }

    public void withParams(String params) {
        System.out.println(DateUtils.getMillisecondTime() + "  -----> 执行有参方法：" + params);
    }

    public void multipleParams(String s, Boolean b, Long l, Double d, Integer i) {
        System.out.println(DateUtils.getMillisecondTime() + StringUtils.format("  -----> 执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", s, b, l, d, i));
    }

}
