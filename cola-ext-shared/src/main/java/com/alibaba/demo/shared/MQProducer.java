package com.alibaba.demo.shared;

/**
 * @description: MQProducer
 * @date: 2020/2/13 下午2:22
 * @author: wangzhiqun
 * @version: 1.0
 */
public interface MQProducer {

    void send(Object message);
}
