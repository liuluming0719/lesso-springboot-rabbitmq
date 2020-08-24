package com.lesso.hello;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "helloQueue")
public class HelloConsumer {

    //创建消息接受者
    @RabbitHandler
//    @RabbitListener(queuesToDeclare = @Queue("workQueue"))
    public void receiver(String hello){
        System.out.println("Receiver:"+hello);
    }
}
