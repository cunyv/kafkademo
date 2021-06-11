package com.example.kafkademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangjian
 * @Date 2021/6/10 16:52
 * @Description TODO
 */
@RestController
@RequestMapping("/kafka")
public class KafkaProducer {

    @Autowired
    KafkaTemplate<String,Object> kafkaTemplate;

    @GetMapping("/produceMsg")
    public String produceMsg(){
        ListenableFuture<SendResult<String, Object>> send = kafkaTemplate.send("20210610007007008", "你好");
        System.out.println(send);
        return "nihao";
    }
}
