package com.alibaba.demo.infrastructure.repository.converter;

/**
 * @description: Converter
 * @date: 2020/2/13 下午2:36
 * @author: wangzhiqun
 * @version: 1.0
 */
public interface Converter<T, R> {

    //convert Domain entity to DO

    R serialize(T t);

    T deserialize(R r);
}
