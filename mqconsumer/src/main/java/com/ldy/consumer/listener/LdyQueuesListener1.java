package com.ldy.consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class LdyQueuesListener1 {
    @RabbitListener(queues = {"ldyqueues1"})
    public void getMess(String msg){
        System.out.println("接收到消息："+msg);
    }
}
