package com.ruoyi.common.core.utils;

import com.ruoyi.common.core.text.IdWorker;

/**
 * @ClassName: PrimaryKeyIdUtils
 * @Author: guohailong
 * @Description: 分布式主键id生成工具
 * @Date: 2021/4/1 14:39
 * @Version: 1.0
 */
public class PrimaryKeyIdUtils {

    /**
     * 业务数据id生成器
     */
    private static IdWorker bizIdWorker;

    /**
     * 系统数据id生成器
     */
    private static IdWorker sysIdWorker;


    /**
     * 工厂模式实现,如有其他业务可再按需构造不同实例
     */
    static {
        bizIdWorker = new IdWorker(1);
        sysIdWorker = new IdWorker(2);
    }

    public static synchronized IdWorker getBizIdWorker() {
        if (bizIdWorker == null) {
            bizIdWorker = new IdWorker(1);
        }
        return bizIdWorker;
    }

    public static synchronized IdWorker getSysIdWorker() {
        if (sysIdWorker == null) {
            sysIdWorker = new IdWorker(2);
        }
        return sysIdWorker;
    }

    /**
     * test
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            System.out.println(bizIdWorker.nextId());
            System.out.println(sysIdWorker.nextId());
            System.out.println("---------------------");
        }
    }

}
