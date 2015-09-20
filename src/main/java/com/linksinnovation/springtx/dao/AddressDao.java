/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.springtx.dao;

import com.linksinnovation.springtx.model.Address;

/**
 *
 * @author Jirawong Wongdokpuang <jirawong@linksinnovation.com>
 */
public interface AddressDao {
    public void createAddress(Address address) throws Exception;
}
