package com.example.cqrsexample.producers;

import com.example.cqrsexample.events.BaseEvent;

public interface EventProducer {
    void produce(String topic, BaseEvent event);
}
