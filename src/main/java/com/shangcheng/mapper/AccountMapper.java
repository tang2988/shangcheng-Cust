package com.shangcheng.mapper;

import java.util.List;

import com.shangcheng.entity.Account;


public interface AccountMapper {

	List<Account> getAccountList();
	
	Account getAccountById(Long AccountId);
	

}
