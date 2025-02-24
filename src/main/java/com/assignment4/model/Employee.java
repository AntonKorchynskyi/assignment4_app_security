package com.assignment4.model;

public class Employee {
    private String company;
    private int payroll;             // Original numeric value
    private String hashedPayroll;    // Hashed version (MD5/SHA)
    private String fullName;
    private String reference;
    private String jobTitle;
    private String workFunction;
    private String workSubFunction;
    private String sector;
    private String location;
    private String hashedLocation;   // hashed
    private String building;
    private String room;
    private int requesterTel;        
    private String hashedRequesterTel; 

    // Constructor (include both original and hashed values)
    public Employee(String company, int payroll, String hashedPayroll, String fullName, String reference, 
                    String jobTitle, String workFunction, String workSubFunction, String sector, 
                    String location, String hashedLocation, String building, String room, 
                    int requesterTel, String hashedRequesterTel) {
        this.company = company;
        this.payroll = payroll;
        this.hashedPayroll = hashedPayroll;
        this.fullName = fullName;
        this.reference = reference;
        this.jobTitle = jobTitle;
        this.workFunction = workFunction;
        this.workSubFunction = workSubFunction;
        this.sector = sector;
        this.location = location;
        this.hashedLocation = hashedLocation;
        this.building = building;
        this.room = room;
        this.requesterTel = requesterTel;
        this.hashedRequesterTel = hashedRequesterTel;
    }

    // Getters and Setters
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public int getPayroll() {
        return payroll;
    }
    public void setPayroll(int payroll) {
        this.payroll = payroll;
    }
    public String getHashedPayroll() {
        return hashedPayroll;
    }
    public void setHashedPayroll(String hashedPayroll) {
        this.hashedPayroll = hashedPayroll;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getWorkFunction() {
        return workFunction;
    }
    public void setWorkFunction(String workFunction) {
        this.workFunction = workFunction;
    }
    public String getWorkSubFunction() {
        return workSubFunction;
    }
    public void setWorkSubFunction(String workSubFunction) {
        this.workSubFunction = workSubFunction;
    }
    public String getSector() {
        return sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getHashedLocation() {
        return hashedLocation;
    }
    public void setHashedLocation(String hashedLocation) {
        this.hashedLocation = hashedLocation;
    }
    public String getBuilding() {
        return building;
    }
    public void setBuilding(String building) {
        this.building = building;
    }
    public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    public int getRequesterTel() {
        return requesterTel;
    }
    public void setRequesterTel(int requesterTel) {
        this.requesterTel = requesterTel;
    }
    public String getHashedRequesterTel() {
        return hashedRequesterTel;
    }
    public void setHashedRequesterTel(String hashedRequesterTel) {
        this.hashedRequesterTel = hashedRequesterTel;
    }
}
