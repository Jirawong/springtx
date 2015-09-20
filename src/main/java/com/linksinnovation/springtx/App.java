/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.springtx;

import com.linksinnovation.springtx.model.Address;
import com.linksinnovation.springtx.model.Customer;
import com.linksinnovation.springtx.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Jirawong Wongdokpuang <jirawong@linksinnovation.com>
 */
public class App {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = ctx.getBean(CustomerService.class);
        
        Address address = new Address();
        address.setAddress("aa");
        
        Customer customer = new Customer();
        customer.setName("mr.x");
        
        customerService.createCustomer(customer,address);
    }
}
