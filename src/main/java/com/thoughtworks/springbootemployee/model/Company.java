package com.thoughtworks.springbootemployee.model;

public class Company {

    private Long companyId;
    private String companyName;


    public Company(Long companyId, String companyName) {
        this.companyId = companyId;
        this.companyName = companyName;
    }
    public Long getCompanyId() {
        return companyId;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void setCompanyId(Long companyId){
        this.companyId = companyId;
    }

}
