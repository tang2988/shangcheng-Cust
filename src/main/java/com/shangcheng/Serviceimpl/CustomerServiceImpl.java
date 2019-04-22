package com.shangcheng.Serviceimpl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shangcheng.Util.ResultData;
import com.shangcheng.entity.Account;
import com.shangcheng.entity.Customer;
import com.shangcheng.mapper.AccountMapper;
import com.shangcheng.mapper.CustomerMapper;

@Service
public class CustomerServiceImpl {
	
	@Autowired
	CustomerMapper customerMapper;
	
	@Autowired
	AccountMapper accountMapper;
	
	/**
	 * 注册
	 * @param mobilePhone 用户名
	 * @param loginPassword 密码
	 * @return
	 */
	public ResultData userRegistration(String mobilePhone,String loginPassword) {
		
		ResultData resultData =new ResultData();
		//逐个判断mobilePhone中的字符是否是0-9
		final String number = "0123456789";
		  for(int i = 0;i < number.length(); i ++){
			  if(number.indexOf(mobilePhone.charAt(i)) == -1) {
				  resultData.setMsg("用戶名不合法");
				  return resultData;
			  }
		  }
		  
		  //检察用户名是否存在
		   List<Customer> customerslist = customerMapper.findAll();
		   for (Customer customer : customerslist) {
			
			   if(mobilePhone.equals(customer.getMobilePhone())) {
				   resultData.setMsg("用户名已存在,注册失败");
				   return resultData;
			   }
		   	}
		   
		  //密码长度必须在8--16位数之间
		   if(loginPassword.length()<8 ||loginPassword.length()>16 ) {
			   resultData.setMsg("密码长度不符合要求");
			   return resultData;
		   }
		  
		 //注册用户
		   Customer customer = new Customer();
		   customer.setCreateTime(new Date());
		   customer.setCustomerUser(mobilePhone);
		   customer.setGender(null);
		   customer.setLoginPassword(loginPassword);
		   customer.setMobilePhone(mobilePhone);
		   customer.setRegisterTime(new Date());
		   customer.setRemark("注册");
		   customer.setVersionNo(1);
		   Integer addCustomer = customerMapper.AddCustomer(customer);
		  
		   if(addCustomer<1) {
			   resultData.setMsg("注册用户失败");
			   return resultData;
				
		   }
		   //添加账户表
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
		   if(addAccount >0) {
			   resultData.setMsg("注册成功");
			   resultData.setData(customer);
		   }else {
			   resultData.setMsg("注册账户表失败");
		   }
		   
		   return resultData;
			      
		 
		
	}


	/**
	 * 登陆
	 * @param customer
	 * @return
	 */
	public ResultData Login(Customer customer) {
		ResultData resultData = new ResultData();
		//根据用户名查询用户信息
		 Customer customerByMobilePhone = customerMapper.getCustomerByMobilePhone(customer.getMobilePhone());
		if(customerByMobilePhone==null) {
			resultData.setMsg("用户不存在");
			return resultData;
		}
		//判断密码是否正确
		if(!customer.getLoginPassword().equals(customerByMobilePhone.getLoginPassword())) {
			resultData.setMsg("密码错误");
			return resultData;
		}
		resultData.setMsg("登录成功");
		resultData.setData(customerByMobilePhone);
		return resultData;
	}

}
