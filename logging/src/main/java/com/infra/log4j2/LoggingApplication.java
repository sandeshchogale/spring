package com.infra.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LoggingApplication {

    private static final Logger LOGGER = LogManager.getLogger(LoggingApplication.class);
    
	public static void main(String[] args) {
		//SpringApplication.run(LoggingApplication.class, args);
		 ApplicationContext ctx = SpringApplication.run(LoggingApplication.class, args);
         
	        LOGGER.info("Info level log message");
	        LOGGER.debug("Debug level log message");
	        LOGGER.error("Error level log message");
	}

}
