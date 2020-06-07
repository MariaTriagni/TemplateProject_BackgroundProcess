package com.mti.ssts.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("quartz")
public class QuartzProperties {

	private String configFile;

	public String getConfigFile() {
		return configFile;
	}

	public void setConfigFile(String configFile) {
		this.configFile = configFile;
	}

	@Override
	public String toString() {
		return "QuartzProperties [configFile=" + configFile + "]";
	}
	
	
}
