package com.mti.ssts.tasks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestTask {
    private static final Logger logger = LogManager.getLogger(TestTask.class);
    
	public void printMe() {
		logger.info("Running job TestTask..");;
	} 
}
