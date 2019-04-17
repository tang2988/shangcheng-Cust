package com.shangcheng.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.shangcheng.mapper")
public class SpringbootApplicationTest {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootApplicationTest.class, args);
	}

}
