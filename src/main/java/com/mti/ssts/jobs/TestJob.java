package com.mti.ssts.jobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.mti.ssts.tasks.TestTask;

public class TestJob extends QuartzJobBean {
	private TestTask testTask;

	public void setTestTask(TestTask testTask) {
		this.testTask = testTask;
	}

	protected void executeInternal(JobExecutionContext context)
		throws JobExecutionException {

		testTask.printMe();

	}
}