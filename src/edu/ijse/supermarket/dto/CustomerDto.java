package edu.ijse.supermarket.dto;

import java.sql.Date;

public class CustomerDto {
    private String custID;
    private String custTitle;
    private String custName;
    private Date dob;
    private double salary;
    private String custAddress;
    private String city;
    private String province;
    private String postalCode;

    public CustomerDto() {
    }

    public CustomerDto(String custID, String custTitle, String custName, Date dob, double salary, String custAddress, String city, String province, String postalCode) {
        this.custID = custID;
        this.custTitle = custTitle;
        this.custName = custName;
        this.dob = dob;
        this.salary = salary;
        this.custAddress = custAddress;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    /**
     * @return the custID
     */
    public String getCustID() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public void setCustID(String custID) {
        this.custID = custID;
    }

    /**
     * @return the custTitle
     */
    public String getCustTitle() {
        return custTitle;
    }

    /**
     * @param custTitle the custTitle to set
     */
    public void setCustTitle(String custTitle) {
        this.custTitle = custTitle;
    }

    /**
     * @return the custName
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName the custName to set
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * @return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the custAddress
     */
    public String getCustAddress() {
        return custAddress;
    }

    /**
     * @param custAddress the custAddress to set
     */
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "custID=" + custID + ", custTitle=" + custTitle + ", custName=" + custName + ", dob=" + dob + ", salary=" + salary + ", custAddress=" + custAddress + ", city=" + city + ", province=" + province + ", postalCode=" + postalCode + '}';
    }
}
