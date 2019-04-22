package com.shangcheng.entity;

import java.util.Date;

import lombok.Data;

/**
 * 用户表
 * @author Administrators
 *
 */

@Data
public class Customer {

	/**
	 * '客户Id(业务标识101+10自增长)'
	 */

	private Long  customerId;
	
	/**
	 * '用户昵称
	 */
	private String customerUser;
	
	/**
	 *  用户手机号码 登陆账户
	 */
	private String mobilePhone;
	
	/**
	 * 用户登陆密码
	 */
	private String loginPassword;
	
	/**
	 * 性别 男10 女20
	 */
	private Integer gender;
	
	/**
	 * 注册时间
	 */
	private Date registerTime;
	
	/**
	 * 备注
	 */
	private String remark;
	
	/**
	 * 版本号
	 */
	private Integer versionNo;
	
	/**
	 * 创建时间
	 */
	private Date createTime;

	public Customer() {
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerUser() {
		return customerUser;
	}

	public void setCustomerUser(String customerUser) {
		this.customerUser = customerUser;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(Integer versionNo) {
		this.versionNo = versionNo;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String toString() {
		return "Customer [customerId=" + customerId + ", customerUser=" + customerUser + ", mobilePhone=" + mobilePhone
				+ ", loginPassword=" + loginPassword + ", gender=" + gender + ", registerTime=" + registerTime
				+ ", remark=" + remark + ", versionNo=" + versionNo + ", createTime=" + createTime + "]";
	}
	
	
	


}
