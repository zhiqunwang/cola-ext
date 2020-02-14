package com.alibaba.demo.domain.customer;

public interface CustomerRepository {
     Customer getByById(String customerId);
}
