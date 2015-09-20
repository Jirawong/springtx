/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.springtx.service;

import com.linksinnovation.springtx.model.Address;
import com.linksinnovation.springtx.model.Customer;

/**
 *
 * @author Jirawong Wongdokpuang <jirawong@linksinnovation.com>
 */
public interface CustomerService {
    public void createCustomer(Customer customer,Address address) throws Exception ;
}
