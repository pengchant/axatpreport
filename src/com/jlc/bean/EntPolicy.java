package com.jlc.bean;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.jlc.base.bean.BaseObject;

public class EntPolicy extends BaseObject{
	
	private static final long serialVersionUID = 1L;

	private long policyId;
	
	private long EntId;
	
	private String PrimaryPhone;
	
	private String voluntaryPolicyNumber;
	
	private String ctplPolicyNumber;
	
	private String insuredName;
	
	private String insuredBrandModel;
	
	private String agentCode;
	
	private String goodCustomer;
	
	private String isJoinGoodCustomer;
	
	private String localPeccancyZize;
	
	private String LicensePlate;
	
	private String engineNo;
	
	private int isdel;
	
	
	public long getPolicyId() {
		return policyId;
	}



	public void setPolicyId(long policyId) {
		this.policyId = policyId;
	}



	public long getEntId() {
		return EntId;
	}



	public void setEntId(long entId) {
		EntId = entId;
	}



	public String getPrimaryPhone() {
		return PrimaryPhone;
	}



	public void setPrimaryPhone(String primaryPhone) {
		PrimaryPhone = primaryPhone;
	}



	public String getVoluntaryPolicyNumber() {
		return voluntaryPolicyNumber;
	}



	public void setVoluntaryPolicyNumber(String voluntaryPolicyNumber) {
		this.voluntaryPolicyNumber = voluntaryPolicyNumber;
	}



	public String getCtplPolicyNumber() {
		return ctplPolicyNumber;
	}



	public void setCtplPolicyNumber(String ctplPolicyNumber) {
		this.ctplPolicyNumber = ctplPolicyNumber;
	}



	public String getInsuredName() {
		return insuredName;
	}



	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}



	public String getInsuredBrandModel() {
		return insuredBrandModel;
	}



	public void setInsuredBrandModel(String insuredBrandModel) {
		this.insuredBrandModel = insuredBrandModel;
	}



	public String getAgentCode() {
		return agentCode;
	}



	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}



	public String getGoodCustomer() {
		return goodCustomer;
	}



	public void setGoodCustomer(String goodCustomer) {
		this.goodCustomer = goodCustomer;
	}



	public String getIsJoinGoodCustomer() {
		return isJoinGoodCustomer;
	}



	public void setIsJoinGoodCustomer(String isJoinGoodCustomer) {
		this.isJoinGoodCustomer = isJoinGoodCustomer;
	}



	public String getLocalPeccancyZize() {
		return localPeccancyZize;
	}



	public void setLocalPeccancyZize(String localPeccancyZize) {
		this.localPeccancyZize = localPeccancyZize;
	}



	public String getLicensePlate() {
		return LicensePlate;
	}



	public void setLicensePlate(String licensePlate) {
		LicensePlate = licensePlate;
	}



	public String getEngineNo() {
		return engineNo;
	}



	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}



	public int getIsdel() {
		return isdel;
	}



	public void setIsdel(int isdel) {
		this.isdel = isdel;
	}



	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
	
}
