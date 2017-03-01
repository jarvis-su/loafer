package com.jarvis.services.job;

import org.springframework.stereotype.Component;

@Component
public class Bean01 {
    public void outMessage(){
        System.out.println("hello 我是第一个任务执行类");
    }
}
