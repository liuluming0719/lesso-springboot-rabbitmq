package com.lesso.hello;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class HelloProvider {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMessage(){
        String message = "hello" + new Date();
        System.out.println(message);
        amqpTemplate.convertAndSend("helloQueue",message);
    }
}
