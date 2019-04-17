package com.shangcheng.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.shangcheng.entity.Account;
import com.shangcheng.mapper.AccountMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.shangcheng.mapper")
@SpringBootApplication
public class AccountTest {

	@Autowired
	AccountMapper accountMapper;

	@Test
	public void testfinall() throws Exception {

		List<Account> account = accountMapper.getAccountList();
		System.out.println(account);

	}

	@Test
	public void testfindById() throws Exception {

		Account account = accountMapper.getAccountById(1010000000000L);
		System.out.println(account);

	}

}
