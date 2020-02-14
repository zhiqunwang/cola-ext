package com.alibaba.demo.infrastructure.db.mapper;

import com.alibaba.demo.infrastructure.db.dataobject.CustomerDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {

   CustomerDO getById(String customerId);
}
