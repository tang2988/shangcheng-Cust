package com.shangcheng.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shangcheng.Serviceimpl.CustomerServiceImpl;
import com.shangcheng.Util.ResultData;
import com.shangcheng.entity.Customer;

@Controller
@RequestMapping(value = "/user")
public class CustomerController {

	@Autowired
	CustomerServiceImpl customerServiceImpl;

	@RequestMapping("/login.html")
	public String login() {
		return "login";
	}

	@RequestMapping("/register.html")
	public String register() {

		return "register";
	}

	@RequestMapping("/login.do")
	public String loginDo(HttpServletRequest request, @RequestParam("phone") String phone,
			@RequestParam("password") String password) {
		Customer customer = new Customer();
		customer.setMobilePhone(phone);
		customer.setLoginPassword(password);
		ResultData resultData = customerServiceImpl.Login(customer);
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("sessionlogin", resultData.getData());
		return register();

	}

	@RequestMapping("/register.do")
	public String registerDo(@RequestParam("phone") String mobilePhone,
			@RequestParam("password") String loginPassword) {
		customerServiceImpl.userRegistration(mobilePhone, loginPassword);
		return null;

	}

	@RequestMapping("/index")
	public String index() {

		return "index";
	}

}
