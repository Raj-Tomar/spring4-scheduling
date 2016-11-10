package com.raj.scheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@ComponentScan(basePackages="com.raj.scheduler")
@EnableScheduling
public class AppConfig {
    @Scheduled(fixedRate = 1000)
    public void doTask() {
    	System.out.println("Do Task...");
    }
    
    @Scheduled(fixedDelay = 1000)
    public void Task1() {
    	System.out.println("Task 1...");
    }
    
    @Scheduled(cron = "*/5 * * * * ?")
    public void Task2() {
    	System.out.println("Task 2...");
    }
} 