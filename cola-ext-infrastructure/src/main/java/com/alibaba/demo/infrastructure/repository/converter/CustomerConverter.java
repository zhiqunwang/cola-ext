package com.alibaba.demo.infrastructure.repository.converter;

import com.alibaba.demo.dto.enums.Customer;
import com.alibaba.demo.infrastructure.db.dataobject.CustomerDO;
import org.springframework.stereotype.Component;

/**
 * @description: CustomerConverter
 * @date: 2020/2/14 下午8:01
 * @author: wangzhiqun
 * @version: 1.0
 */
@Component
public class CustomerConverter implements Converter<CustomerDO, Customer> {
    @Override
    public  Customer serialize(CustomerDO customerDO) {
        return null;
    }

    @Override
    public CustomerDO deserialize(Customer customer) {
        return null;
    }
}
