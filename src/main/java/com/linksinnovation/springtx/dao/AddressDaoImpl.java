/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linksinnovation.springtx.dao;

import com.linksinnovation.springtx.model.Address;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jirawong Wongdokpuang <jirawong@linksinnovation.com>
 */
public class AddressDaoImpl implements AddressDao {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void createAddress(Address address) throws Exception{
        throw new Exception();
        
//        String queryAddress = "insert into Address (id, address) values (?,?)";
//
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        jdbcTemplate.update(queryAddress, address.asArray());
//        System.out.println("Inserted into Address Table Successfully");
    }

}
