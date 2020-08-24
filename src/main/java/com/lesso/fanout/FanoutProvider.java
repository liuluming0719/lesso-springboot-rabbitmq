package com.lesso.fanout;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author liuluming
 * @date 2020/8/21 9:26
 */
@Component
public class FanoutProvider {

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void sendMessage(){
        String messsage = "fanout模型" + new Date();
        System.out.println(messsage);
        rabbitTemplate.convertAndSend("fanoutExchange","",messsage);
    }
}
