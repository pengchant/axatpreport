package com.jlc.bean;

public class Customerinfo {
    private Integer customerid;

    private String openid;

    private String primaryphone;

    private String voluntarypolicynumber;

    private String ctplpolicynumber;

    private String insuredname;

    private String insuredbrandmodel;

    private String agentcode;

    private String goodcustomer;

    private String isjoingoodcustomer;

    private String localpeccancyzize;

    private String licenseplate;

    private String engineno;

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getPrimaryphone() {
        return primaryphone;
    }

    public void setPrimaryphone(String primaryphone) {
        this.primaryphone = primaryphone == null ? null : primaryphone.trim();
    }

    public String getVoluntarypolicynumber() {
        return voluntarypolicynumber;
    }

    public void setVoluntarypolicynumber(String voluntarypolicynumber) {
        this.voluntarypolicynumber = voluntarypolicynumber == null ? null : voluntarypolicynumber.trim();
    }

    public String getCtplpolicynumber() {
        return ctplpolicynumber;
    }

    public void setCtplpolicynumber(String ctplpolicynumber) {
        this.ctplpolicynumber = ctplpolicynumber == null ? null : ctplpolicynumber.trim();
    }

    public String getInsuredname() {
        return insuredname;
    }

    public void setInsuredname(String insuredname) {
        this.insuredname = insuredname == null ? null : insuredname.trim();
    }

    public String getInsuredbrandmodel() {
        return insuredbrandmodel;
    }

    public void setInsuredbrandmodel(String insuredbrandmodel) {
        this.insuredbrandmodel = insuredbrandmodel == null ? null : insuredbrandmodel.trim();
    }

    public String getAgentcode() {
        return agentcode;
    }

    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode == null ? null : agentcode.trim();
    }

    public String getGoodcustomer() {
        return goodcustomer;
    }

    public void setGoodcustomer(String goodcustomer) {
        this.goodcustomer = goodcustomer == null ? null : goodcustomer.trim();
    }

    public String getIsjoingoodcustomer() {
        return isjoingoodcustomer;
    }

    public void setIsjoingoodcustomer(String isjoingoodcustomer) {
        this.isjoingoodcustomer = isjoingoodcustomer == null ? null : isjoingoodcustomer.trim();
    }

    public String getLocalpeccancyzize() {
        return localpeccancyzize;
    }

    public void setLocalpeccancyzize(String localpeccancyzize) {
        this.localpeccancyzize = localpeccancyzize == null ? null : localpeccancyzize.trim();
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate == null ? null : licenseplate.trim();
    }

    public String getEngineno() {
        return engineno;
    }

    public void setEngineno(String engineno) {
        this.engineno = engineno == null ? null : engineno.trim();
    }
}