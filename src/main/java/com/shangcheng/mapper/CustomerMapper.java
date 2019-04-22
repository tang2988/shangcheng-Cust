package com.shangcheng.mapper;

import java.util.List;

import com.shangcheng.entity.Customer;

public interface CustomerMapper {
	
	

	List<Customer> findAll();
	
	
	/**
	 * 根据客户id查询客户信息
	 * @param CustomerId
	 * @return
	 */
	Customer getCustomerById(Long CustomerId);
	/**
	 * 注册
	 * @param customer
	 * @return
	 */
	Integer AddCustomer(Customer customer);
	
	/**
	 * 登陆
	 * @param customer
	 * @return
	 */
	Customer Login(Customer customer);
	
	/**
	 * 根据用户名查询用户信息
	 * @param mobilePhone
	 * @return
	 */
	Customer getCustomerByMobilePhone(String mobilePhone);

	
	
}
