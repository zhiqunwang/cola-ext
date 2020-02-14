package com.alibaba.demo.infrastructure.event;

import com.alibaba.cola.event.DomainEventI;
import com.alibaba.cola.event.EventBusI;
import com.alibaba.cola.event.EventI;
import com.alibaba.demo.shared.DomainEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * DomainEventPublisher, this is for demo purpose, the Event is sent to EventBus
 *
 * Normally DomainEvent should be sent to Messaging Middleware
 *
 * @author Frank Zhang
 * @date 2019-01-04 11:05 AM
 */
@Component
public class DefaultDomainEventPublisher implements DomainEventPublisher {

    @Autowired
    private EventBusI eventBus;

    public void publish(EventI domainEvent) {
        eventBus.fire(domainEvent);
    }
}
