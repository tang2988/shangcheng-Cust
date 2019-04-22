package com.shangcheng.mapper;

import com.shangcheng.entity.Account;


public interface AccountMapper {

	
	
	Account getAccountById(Long AccountId);
	
	Integer addAccount(Account account);
	

}
