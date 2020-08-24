package com.lesso.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ProviderConsumerConfig {

    @Bean
    public Queue helloQueue(){

        //创建指定名称的消息队列  点对点的方式
        Queue queue = new Queue("helloQueue");
        return queue;
    }

    @Bean
    public Queue workQueue(){

        //创建指定的消息队列的名称  一个消费者对应多个消费者
        Queue workQueue = new Queue("workQueue");
        return workQueue;
    }
}
