package com.example.kafkademo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @Author zhangjian
 * @Date 2021/5/25 19:12
 * @Description kafka参数配置 id、topics
 */
@Configuration
public class KafkaConfig implements InitializingBean {

    private static Logger logger = LoggerFactory.getLogger(KafkaConfig.class);

    @Value("${subscribe.job.id}")
    private String id;
    @Value("${subscribe.job.topics}")
    private String topics;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.setProperty("id", id);
        System.setProperty("topics", topics);
        logger.info(">>>>>>>>>>>>>>>>>kafka监听的id为[{}],topics为[{}]<<<<<<<<<<<<<<<<<", id,topics);
    }
}
