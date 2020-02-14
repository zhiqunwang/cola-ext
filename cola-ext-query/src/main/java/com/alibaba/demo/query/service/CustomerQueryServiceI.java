package com.alibaba.demo.query.service;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.demo.query.dto.CustomerDTO;
import com.alibaba.demo.query.qry.CustomerListByNameQry;

/**
 * @description: CustomerQueryServiceI
 * @date: 2020/2/13 下午3:10
 * @author: wangzhiqun
 * @version: 1.0
 */
public interface CustomerQueryServiceI {

     MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
