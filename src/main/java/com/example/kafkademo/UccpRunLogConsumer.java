package com.example.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 日志接收
 */
@Component
public class UccpRunLogConsumer {
    @KafkaListener(id = "nihaoashijiewoyebuzhidao",topics = "check")
    public void onMessage(String textMessage){
        System.out.println("==============================================");
        System.out.println(textMessage);
        System.out.println("==============================================");
    }
}
