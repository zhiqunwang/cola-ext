package com.alibaba.demo.app.service;

import com.alibaba.cola.command.CommandBusI;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.event.EventBus;
import com.alibaba.demo.api.CustomerServiceI;
import com.alibaba.demo.dto.CustomerAddCmd;
import com.alibaba.demo.dto.event.CustomerCreatedEvent;
import com.alibaba.demo.dto.enums.Customer;
import com.alibaba.demo.query.qry.CustomerListByNameQry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerServiceI {

    @Autowired
    private CommandBusI commandBus;

    @Autowired
    private EventBus eventBus;

    @Override
    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        Response response = commandBus.send(customerAddCmd);
        CustomerCreatedEvent customerCreatedEvent = new CustomerCreatedEvent();
        eventBus.fire(customerCreatedEvent);
        return response;
    }

}
