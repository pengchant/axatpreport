package com.jlc.bean;

public class Claiminfo {
    private Integer caseId;

    private String casenumber;

    private Integer customerid;

    private Integer casestep;

    private String addressline1;

    private String repairshopid;

    private String repairshopname;

    private String otherlicenseplate;

    private String otherreporter;

    private String otherphone;

    private String longitude;

    private String latitude;

    private String losslocationreason;

    private String surveyspeoplename;

    private String cellphone;

    private String casetype;

    private Integer isfinished;

    private String state;

    private String city;

    private String county;

    private String reportername;

    private String lossdate;

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getCasenumber() {
        return casenumber;
    }

    public void setCasenumber(String casenumber) {
        this.casenumber = casenumber == null ? null : casenumber.trim();
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getCasestep() {
        return casestep;
    }

    public void setCasestep(Integer casestep) {
        this.casestep = casestep;
    }

    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1 == null ? null : addressline1.trim();
    }

    public String getRepairshopid() {
        return repairshopid;
    }

    public void setRepairshopid(String repairshopid) {
        this.repairshopid = repairshopid == null ? null : repairshopid.trim();
    }

    public String getRepairshopname() {
        return repairshopname;
    }

    public void setRepairshopname(String repairshopname) {
        this.repairshopname = repairshopname == null ? null : repairshopname.trim();
    }

    public String getOtherlicenseplate() {
        return otherlicenseplate;
    }

    public void setOtherlicenseplate(String otherlicenseplate) {
        this.otherlicenseplate = otherlicenseplate == null ? null : otherlicenseplate.trim();
    }

    public String getOtherreporter() {
        return otherreporter;
    }

    public void setOtherreporter(String otherreporter) {
        this.otherreporter = otherreporter == null ? null : otherreporter.trim();
    }

    public String getOtherphone() {
        return otherphone;
    }

    public void setOtherphone(String otherphone) {
        this.otherphone = otherphone == null ? null : otherphone.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getLosslocationreason() {
        return losslocationreason;
    }

    public void setLosslocationreason(String losslocationreason) {
        this.losslocationreason = losslocationreason == null ? null : losslocationreason.trim();
    }

    public String getSurveyspeoplename() {
        return surveyspeoplename;
    }

    public void setSurveyspeoplename(String surveyspeoplename) {
        this.surveyspeoplename = surveyspeoplename == null ? null : surveyspeoplename.trim();
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    public String getCasetype() {
        return casetype;
    }

    public void setCasetype(String casetype) {
        this.casetype = casetype == null ? null : casetype.trim();
    }

    public Integer getIsfinished() {
        return isfinished;
    }

    public void setIsfinished(Integer isfinished) {
        this.isfinished = isfinished;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getReportername() {
        return reportername;
    }

    public void setReportername(String reportername) {
        this.reportername = reportername == null ? null : reportername.trim();
    }

    public String getLossdate() {
        return lossdate;
    }

    public void setLossdate(String lossdate) {
        this.lossdate = lossdate == null ? null : lossdate.trim();
    }
}