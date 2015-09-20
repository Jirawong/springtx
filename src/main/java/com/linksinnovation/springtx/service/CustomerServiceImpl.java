/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.springtx.service;

import com.linksinnovation.springtx.dao.AddressDao;
import com.linksinnovation.springtx.dao.CustomerDao;
import com.linksinnovation.springtx.model.Address;
import com.linksinnovation.springtx.model.Customer;
import org.h2.message.DbException;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jirawong Wongdokpuang <jirawong@linksinnovation.com>
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;
    private AddressDao addressDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void setAddressDao(AddressDao addressDao) {
        this.addressDao = addressDao;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void createCustomer(Customer customer, Address address) throws Exception {
        customerDao.createCustomer(customer);
            addressDao.createAddress(address);

    }

}
