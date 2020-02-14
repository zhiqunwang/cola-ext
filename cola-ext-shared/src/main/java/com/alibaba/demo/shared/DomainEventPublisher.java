package com.alibaba.demo.shared;

import com.alibaba.cola.event.EventI;

/**
 * @description: DomainEventPublisher
 * @date: 2020/2/13 下午2:30
 * @author: wangzhiqun
 * @version: 1.0
 */
public interface DomainEventPublisher {

     void publish(EventI event);
}
