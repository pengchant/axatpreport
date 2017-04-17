package com.jlc.views;

/**
 * 理赔进度的视图
 * 
 * @author cp
 * 
 */
public class PolicyClaimProgressView {
	private String entId;// 企业的编号
	private String policyId;// 保单的编号
	private String claimId;// 案件的编号
	private String licensePlate;// 车牌号
	private String caseProgress;// 案件的进度
	private String payment;// 支付的金额

	public String getEntId() {
		return entId;
	}

	public void setEntId(String entId) {
		this.entId = entId;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getClaimId() {
		return claimId;
	}

	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getCaseProgress() {
		return caseProgress;
	}

	public void setCaseProgress(String caseProgress) {
		this.caseProgress = caseProgress;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

}
