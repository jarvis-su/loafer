package com.jarvis.services.job.scheduler;

import com.jarvis.services.job.Bean02;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class ScheduledJob extends QuartzJobBean {

    private Bean02 bean02;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        bean02.outMessage();
    }

    public void setBean02(Bean02 bean02) {
        this.bean02 = bean02;
    }
}
