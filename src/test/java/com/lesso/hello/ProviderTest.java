package com.lesso.hello;

import com.lesso.fanout.FanoutProvider;
import com.lesso.route.RouteConsumer;
import com.lesso.route.RouteProvider;
import com.lesso.topics.TopicsProvider;
import com.lesso.work.WorkConsumer;
import com.lesso.work.WorkProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class ProviderTest {


    @Autowired
    HelloProvider helloProvider;

    @Autowired
    WorkProvider workProvider;

    @Autowired
    FanoutProvider fanoutProvider;

    @Autowired
    RouteProvider routeProvider;

    @Autowired
    TopicsProvider topicsProvider;

    //动态路由
    @Test
    public void topics(){
        topicsProvider.sendMessage();
    }

    //路由模型
    @Test
    public void route(){
        routeProvider.sendMessage();
    }

    //一个生产者对应一个消费者
    @Test
    public void hello(){
        helloProvider.sendMessage();
    }

    //一个生产者对应多个消费者
    @Test
    public void work(){
        workProvider.sendMessage();
    }

    //广播模型
    @Test
    public void fanout(){
        fanoutProvider.sendMessage();
    }


}
