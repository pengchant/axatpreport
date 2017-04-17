package com.jlc.bean;

public class BranchInfo {
    private Integer branchId;

    private String branchNam;

    private String branchAddress;

    private String servicecontent;

    private String telnumber;

    private String wroktime;

    private String longtitude;

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getBranchNam() {
        return branchNam;
    }

    public void setBranchNam(String branchNam) {
        this.branchNam = branchNam == null ? null : branchNam.trim();
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress == null ? null : branchAddress.trim();
    }

    public String getServicecontent() {
        return servicecontent;
    }

    public void setServicecontent(String servicecontent) {
        this.servicecontent = servicecontent == null ? null : servicecontent.trim();
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber == null ? null : telnumber.trim();
    }

    public String getWroktime() {
        return wroktime;
    }

    public void setWroktime(String wroktime) {
        this.wroktime = wroktime == null ? null : wroktime.trim();
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude == null ? null : longtitude.trim();
    }
}