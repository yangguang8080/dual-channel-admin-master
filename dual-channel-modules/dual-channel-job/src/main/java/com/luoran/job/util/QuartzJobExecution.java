package com.luoran.job.util;

import org.quartz.JobExecutionContext;

import com.luoran.job.domain.SysJob;

/**
 * 定时任务处理（允许并发执行）
 *
 * @author guohailong
 */
public class QuartzJobExecution extends AbstractQuartzJob {
    @Override
    protected void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
