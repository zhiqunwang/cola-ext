package com.alibaba.demo.controller;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.demo.api.CustomerServiceI;
import com.alibaba.demo.dto.CustomerAddCmd;
import com.alibaba.demo.dto.enums.Customer;
import com.alibaba.demo.query.dto.CustomerDTO;
import com.alibaba.demo.query.qry.CustomerListByNameQry;
import com.alibaba.demo.query.service.CustomerQueryServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerServiceI customerService;

    @Autowired
    private CustomerQueryServiceI customerQueryServiceI;

    @GetMapping(value = "/customer")
    public MultiResponse<CustomerDTO> listCustomerByName(@RequestParam String name){
        CustomerListByNameQry customerListByNameQry = new CustomerListByNameQry();
        customerListByNameQry.setName(name);
        return customerQueryServiceI.listByName(customerListByNameQry);
    }

    @PostMapping(value = "/customer")
    public Response addCustomer(@RequestBody CustomerAddCmd customerAddCmd){
        return customerService.addCustomer(customerAddCmd);
    }
}
