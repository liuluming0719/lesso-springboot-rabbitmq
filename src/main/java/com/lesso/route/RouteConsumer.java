package com.lesso.route;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author liuluming
 * @date 2020/8/21 16:21
 */
@Component
public class RouteConsumer {

    @RabbitListener(bindings = {
            @QueueBinding(value = @Queue,
            exchange = @Exchange(value = "directExchange",type = "direct"),
            key = {"error","info","warning"})
    })
    public void receiver1(String message){
        System.out.println("receiver1"+message);
    }

    @RabbitListener(bindings = {
            @QueueBinding(value = @Queue,
            exchange = @Exchange(value = "directExchange",type = "direct"),
            key = {"info"})
    })
    public void receiver2(String message){
        System.out.println("receiver2:"+message);
    }
}
