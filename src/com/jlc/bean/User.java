package com.jlc.bean;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.jlc.base.bean.BaseObject;

public class User extends BaseObject {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 167281642280391967L;
	/**
	 * 测试用户ID
	 */
	private Long id;
	/**
	 * 用户账号
	 */
	private String account;
	/**
	 * 用户密码
	 */
	private String password;
	/**
	 * 用户姓名
	 */
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	} 
}
