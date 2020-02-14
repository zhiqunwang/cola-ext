package com.alibaba.demo.api;

import com.alibaba.cola.dto.Response;
import com.alibaba.demo.dto.CustomerAddCmd;

public interface CustomerServiceI {

     Response addCustomer(CustomerAddCmd customerAddCmd);
}
