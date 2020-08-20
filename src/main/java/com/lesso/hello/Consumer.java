package com.lesso.hello;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "helloQueue")
public class Consumer {

    //创建消息接受者
    @RabbitHandler
    public void receiver(String hello){
        System.out.println("Receiver:"+hello);
    }
}
