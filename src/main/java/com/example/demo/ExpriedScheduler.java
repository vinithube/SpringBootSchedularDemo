package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ExpriedScheduler {

    private static final Logger logger = LoggerFactory.getLogger(ExpriedScheduler.class);

    @Scheduled(initialDelay = 30000,fixedDelay = 30000)
    public void markExpired(){
        logger.info("Welcome in schedular demo :{}",new Date());

//        Note how we're using both fixedDelay as well as initialDelay in this example.
//        The task will be executed the first time after the initialDelay value,
//        and it will continue to be executed according to the fixedDelay.
//
//        This option is convenient when the task has a setup that needs to be completed.
    }


//    @EnableAsync
//    public class ScheduledFixedRateExample {
//        @Async
//        @Scheduled(fixedRate = 1000)
//        public void scheduleFixedRateTaskAsync() throws InterruptedException {
//            System.out.println(
//                    "Fixed rate task async - " + System.currentTimeMillis() / 1000);
//            Thread.sleep(2000);
//        }
//
////        Now this asynchronous task will be invoked each second, even if the previous task isn't done.
//
//    }


//    @Scheduled(cron = "0 15 10 15 * ?")
//    public void scheduleTaskUsingCronExpression() {
//
//        long now = System.currentTimeMillis() / 1000;
//        System.out.println(
//                "schedule tasks using cron jobs - " + now);
//    }


}
