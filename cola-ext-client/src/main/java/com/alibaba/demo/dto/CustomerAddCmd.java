package com.alibaba.demo.dto;

import com.alibaba.cola.dto.Command;
import com.alibaba.demo.dto.enums.Customer;
import lombok.Data;

@Data
public class CustomerAddCmd extends Command{

    private Customer customer;

}
