package com.lesso.topics;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author liuluming
 * @date 2020/8/21 17:01
 */
@Component
public class TopicsConsumer {


    @RabbitListener(bindings ={
            @QueueBinding(value = @Queue,
            exchange = @Exchange(value = "topicsExchange",type = "topic"),
            key = {"#.save.*"})
    })
    public void receiver1(String message){
        System.out.println("receiver1:"+message);
    }

    @RabbitListener(bindings ={
            @QueueBinding(value = @Queue,
            exchange = @Exchange(value = "topicsExchange",type = "topic"),
            key = {"#.user.*"})
    })
    public void receiver2(String message){
        System.out.println("receiver2:"+message);
    }
}
