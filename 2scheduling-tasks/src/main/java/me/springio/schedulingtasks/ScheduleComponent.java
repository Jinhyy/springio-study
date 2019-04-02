package me.springio.schedulingtasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduleComponent {
    private static final Logger logger = LoggerFactory.getLogger(ScheduleComponent.class);
    private static final DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");


    //@Scheduled(cron = "초 분 시 일 년 월")
    @Scheduled(fixedRate = 1000)
    public void currentTimeMethod(){
        logger.info("지금 시간 : {}", dateFormat.format(new Date()));
    }
}
