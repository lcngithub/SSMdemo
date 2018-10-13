package com.louis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author: lcn_louis
 * @Date: 2018/10/11 下午1:49
 */

@Component
public class FlightTrainTask {
    private static final Logger log = LoggerFactory.getLogger(FlightTrainTask.class);

    @Scheduled(cron = "*/5 * * * * ?") // 间隔5秒执行
    public void taskCycle() {
        log.info("使用SpringMVC框架配置定时任务");
        System.out.println("使用SpringMVC框架配置定时任务");
    }
}
