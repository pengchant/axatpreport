package com.jlc.bean;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.jlc.base.bean.BaseObject;

public class EnterPrise extends BaseObject{
	
	private static final long serialVersionUID = 1L;

	private long EntId;
	
	private long  EntCode;
	
	private String Password;
	
	private String EntName;
	
	
	
	public long getEntId() {
		return EntId;
	}



	public void setEntId(long entId) {
		EntId = entId;
	}


	public long getEntCode() {
		return EntCode;
	}



	public void setEntCode(long entCode) {
		EntCode = entCode;
	}



	public String getPassword() {
		return Password;
	}



	public void setPassword(String password) {
		Password = password;
	}



	public String getEntName() {
		return EntName;
	}



	public void setEntName(String entName) {
		EntName = entName;
	}



	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
