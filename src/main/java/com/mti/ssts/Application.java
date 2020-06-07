package com.mti.ssts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mti.ssts.config.*;

@SpringBootApplication
public class Application implements CommandLineRunner {
    private static final Logger logger = LogManager.getLogger(Application.class);

	@Autowired
    private AppProperties appProperties;
	@Autowired
    private GlobalProperties globalProperties;
	@Autowired
    private QuartzProperties quartzProperties;
		
	@Override
    public void run(String... args) {

        logger.info("Logging info is on");
        logger.debug("Logging debug is on");
        logger.warn("Logging warn is on");
        logger.error("Logging error is on");
        
		logger.info(appProperties);
		logger.info(globalProperties);
		logger.info(quartzProperties);
		
     	new FileSystemXmlApplicationContext(quartzProperties.getConfigFile());


    }
    
	public static void main( String[] args )
    {

         SpringApplication.run(Application.class, args);
         
   }
}
    
