package com.vulnerable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.SpringVersion;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("Vulnerable Java app running");
        System.out.println("Log4j version: " + logger.getClass().getPackage().getImplementationVersion());
        System.out.println("Spring version: " + SpringVersion.getVersion());

        logger.info("Testing vulnerable dependencies");

        // Using vulnerable libraries
        try {
            // This would be where vulnerable code would be
            System.out.println("App completed");
        } catch (Exception e) {
            logger.error("Error occurred", e);
        }
    }
}