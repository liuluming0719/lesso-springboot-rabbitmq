package com.lesso.work;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author liuluming
 * @date 2020/8/20 22:33
 */
@Component
public class WorkProvider {

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void sendMessage(){
        for (int i = 0; i < 10; i++) {
            String message = "work"+" "+new Date();
            System.out.println(message);

            rabbitTemplate.convertAndSend("workQueue",message+i);
        }

    }
}
