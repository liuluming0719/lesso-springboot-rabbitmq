package com.lesso.work;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author liuluming
 * @date 2020/8/20 22:40
 */
@Component
public class WorkConsumer {

    //消费者1
    @RabbitListener(queuesToDeclare = @Queue("workQueue"))
    public void receiver1(String message){
        System.out.println("receiver1"+message);
    }

    //消费者2
    @RabbitListener(queuesToDeclare = @Queue("workQueue"))
    public void receiver2(String message){
        System.out.println("receiver2"+message);
    }
}
