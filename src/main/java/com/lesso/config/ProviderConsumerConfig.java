package com.lesso.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ProviderConsumerConfig {

    @Bean
    public Queue helloQueue(){

        //创建指定名称的消息队列
        Queue queue = new Queue("helloQueue");
        return queue;
    }
}
