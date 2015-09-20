/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * create table customer(id bigint auto_increment, name varchar(20));
 * create table address(id bigint auto_increment, address varchar(1));
 * jdbc:h2:~/test;AUTO_SERVER=TRUE
 */
package com.linksinnovation.springtx.model;

/**
 *
 * @author Jirawong Wongdokpuang <jirawong@linksinnovation.com>
 */
public class Customer {
    private Integer id;
    private String name;
    private Address address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public Object[] asArray(){
        return new Object[]{this.id,this.name};
    }
}
