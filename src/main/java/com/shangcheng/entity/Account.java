package com.shangcheng.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.core.style.ToStringCreator;

import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import lombok.Data;

/**
 * 账户表
 * @author 谢雄辉
 */
@Data
public class Account {
	
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", myAvailableBalance=" + myAvailableBalance + ", allTheBalance="
				+ allTheBalance + ", lockTheBalance=" + lockTheBalance + ", accountStatus=" + accountStatus
				+ ", remark=" + remark + ", versionNo=" + versionNo + ", createTime=" + createTime + ", customerId="
				+ customerId + "]";
	}
	/**
	 * 账户ID
	 */
	private Long accountId;
	/**
	 * 我的可用余额
	 */
	private BigDecimal myAvailableBalance;
	/**
	 * 全部余额
	 */
	private BigDecimal allTheBalance;
	/**
	 * 锁定余额
	 */
	private BigDecimal lockTheBalance;
	/**
	 * 账户状态 10正常 20禁用
	 */
	private Integer accountStatus;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 版本号
	 */
	private Integer versionNo;
	/**
	 * 插入时间
	 */
	private Date createTime;
	/**
	 * 用户ID
	 */
	private Long customerId;
	public Account() {
	}
public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public BigDecimal getMyAvailableBalance() {
		return myAvailableBalance;
	}
	public void setMyAvailableBalance(BigDecimal myAvailableBalance) {
		this.myAvailableBalance = myAvailableBalance;
	}
	public BigDecimal getAllTheBalance() {
		return allTheBalance;
	}
	public void setAllTheBalance(BigDecimal allTheBalance) {
		this.allTheBalance = allTheBalance;
	}
	public BigDecimal getLockTheBalance() {
		return lockTheBalance;
	}
	public void setLockTheBalance(BigDecimal lockTheBalance) {
		this.lockTheBalance = lockTheBalance;
	}
	public Integer getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(Integer accountStatus) {
		this.accountStatus = accountStatus;
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
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Account(Long accountId, BigDecimal myAvailableBalance, BigDecimal allTheBalance, BigDecimal lockTheBalance,
			Integer accountStatus, String remark, Integer versionNo, Date createTime, Long customerId) {
		super();
		this.accountId = accountId;
		this.myAvailableBalance = myAvailableBalance;
		this.allTheBalance = allTheBalance;
		this.lockTheBalance = lockTheBalance;
		this.accountStatus = accountStatus;
		this.remark = remark;
		this.versionNo = versionNo;
		this.createTime = createTime;
		this.customerId = customerId;
	}
	
}
