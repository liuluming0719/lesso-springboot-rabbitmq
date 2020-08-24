package com.lesso.route;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author liuluming
 * @date 2020/8/21 10:02
 */
@Component
public class RouteProvider {

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void sendMessage(){
        rabbitTemplate.convertAndSend("directExchange","info","发送info的key的路由信息");
    }
}
