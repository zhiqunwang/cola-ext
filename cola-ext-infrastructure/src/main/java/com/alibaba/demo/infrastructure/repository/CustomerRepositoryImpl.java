package com.alibaba.demo.infrastructure.repository;

import com.alibaba.demo.domain.customer.Customer;
import com.alibaba.demo.domain.customer.CustomerRepository;

import com.alibaba.demo.infrastructure.db.dataobject.CustomerDO;
import com.alibaba.demo.infrastructure.db.mapper.CustomerMapper;
import com.alibaba.demo.infrastructure.repository.converter.CustomerConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepositoryImpl implements CustomerRepository {
    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private CustomerConverter customerConverter;

    @Override
    public Customer getByById(String customerId){
      CustomerDO customerDO = customerMapper.getById(customerId);
      //Convert to Customer
      return null;
    }
}
