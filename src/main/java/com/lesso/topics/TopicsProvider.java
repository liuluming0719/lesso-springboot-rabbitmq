package com.lesso.topics;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author liuluming
 * @date 2020/8/21 16:51
 */
@Component
public class TopicsProvider {


    @Autowired
    RabbitTemplate rabbitTemplate;

    public void sendMessage(){
        rabbitTemplate.convertAndSend("topicsExchange","save.user","发送info的key的动态路由信息");
    }
}
