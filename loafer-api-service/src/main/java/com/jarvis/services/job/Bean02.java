package com.jarvis.services.job;

import org.springframework.stereotype.Component;

@Component
public class Bean02 {
    public void outMessage() {
        System.out.println("hello 我是第二个任务执行类");
    }
}
