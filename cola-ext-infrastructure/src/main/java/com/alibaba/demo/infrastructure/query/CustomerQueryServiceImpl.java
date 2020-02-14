package com.alibaba.demo.infrastructure.query;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.demo.infrastructure.db.mapper.CustomerMapper;
import com.alibaba.demo.query.dto.CustomerDTO;
import com.alibaba.demo.query.qry.CustomerListByNameQry;
import com.alibaba.demo.query.service.CustomerQueryServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: CustomerQueryServiceImpl
 * @date: 2020/2/13 下午3:14
 * @author: wangzhiqun
 * @version: 1.0
 */
@Service
public class CustomerQueryServiceImpl implements CustomerQueryServiceI {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry) {
        return null;
    }
}
