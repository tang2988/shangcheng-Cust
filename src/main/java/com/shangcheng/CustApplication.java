package com.shangcheng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.shangcheng.mapper.AccountMapper;

@SpringBootApplication
@MapperScan("com.shangcheng.mapper")
public class CustApplication implements ApplicationRunner {

	public static void main(String[] args) {

		SpringApplication.run(CustApplication.class, args);
	}

	@Autowired
	AccountMapper accountMapper;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(accountMapper.getAccountById(1010000000000L));
		System.exit(0);
	}

}
