package com.hangnt.demo_sof3021.Buoi10_Schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author hangnt169
 */

@Component
@EnableScheduling
public class TestSchedule {

    @Autowired
    private  TestService service;

//    @Scheduled(cron = "1 * * * * ?")
    @Scheduled(fixedRate = 2000)
    public void checkAndInsertBillingInMonth() {
        try {
            service.demoSchedule();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
