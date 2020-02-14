package com.alibaba.demo.infrastructure.query.assembler;

import com.alibaba.demo.infrastructure.db.dataobject.CustomerDO;
import com.alibaba.demo.query.dto.CustomerDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

/**
 * @description: CustomerDTOAssembler
 * @date: 2020/2/13 下午3:17
 * @author: wangzhiqun
 * @version: 1.0
 */
@Component
public class CustomerDTOAssembler implements Function<CustomerDO, CustomerDTO> {
    @Override
    public CustomerDTO apply(CustomerDO customerDO) {
        return null;
    }
}
