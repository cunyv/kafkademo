package com.example.kafkademo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author zhangjian
 * @Date 2021/5/25 19:36
 * @Description TODO
 */
@Component
@ConfigurationProperties(prefix = "subscribe.job")
public class KafkaProperties {
    private String id;
    private String topics;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }
}
