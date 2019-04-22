package com.shangcheng;

import java.math.BigDecimal;
import java.util.Date;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shangcheng.Serviceimpl.CustomerServiceImpl;
import com.shangcheng.entity.Account;
import com.shangcheng.entity.Customer;
import com.shangcheng.mapper.AccountMapper;
import com.shangcheng.mapper.CustomerMapper;

@SpringBootApplication
@MapperScan("com.shangcheng.mapper")
public class CustApplication implements ApplicationRunner {

	public static void main(String[] args) {

		SpringApplication.run(CustApplication.class, args);
	}

	@Autowired
	AccountMapper accountMapper;
	
	@Autowired
	CustomerMapper custom;
	
	@Autowired
	CustomerServiceImpl customerServiceImpl;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		//注冊功能測試
		/*Customer customer = new Customer();
		   customer.setCreateTime(new Date());
		   customer.setCustomerUser("13530795163");
		   customer.setGender(null);
		   customer.setLoginPassword("123456");
		   customer.setMobilePhone("13530795163");
		   customer.setRegisterTime(new Date());
		   customer.setRemark("注册");
		   customer.setVersionNo(1);
		   Integer addCustomer = custom.AddCustomer(customer);
		   
		   Account account = new Account();
		   account.setAccountStatus(10);
		   account.setAllTheBalance(new BigDecimal(0));
		   account.setCreateTime(new Date());
		   account.setCustomerId(customer.getCustomerId());
		   account.setLockTheBalance(new BigDecimal(0));
		   account.setMyAvailableBalance(new BigDecimal(0));
		   account.setRemark("添加账户表");
		   account.setVersionNo(1);
		   Integer addAccount = accountMapper.addAccount(account);
		   
		   System.out.println(addCustomer+"========"+addAccount+"customerId="+customer.getCustomerId()+"========="+account.getCustomerId());*/
		
		
		Customer customer = new Customer();
		customer.setMobilePhone("17820601511");
		customer.setLoginPassword("123456");
		System.out.println(customerServiceImpl.Login(customer ));
		
		System.exit(0);
	}

}
