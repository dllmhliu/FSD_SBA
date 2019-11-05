package com.ibm.fsd.sba.security.message.request;

import java.util.Set;

import javax.validation.constraints.*;

import java.sql.Date;

public class SignUpForm {
    @NotBlank
    @Size(min = 3, max = 50)
    private String username;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

    private String firstName;

    private String lastName;

    private Long contactNumber;

    private String regCode = "";

    private String role;

    private String linkedinUrl = null;

    private Float yearsOfExperience;

    private Boolean active = false;

    private Boolean confirmedSignUp = false;

    private Boolean resetPassword = false;

    private Date resetPasswordDate;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getRegCode() {
        return regCode;
    }

    public void setRegCode(String regCode) {
        this.regCode = regCode;
    }

    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }

    public Float getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Float yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getConfirmedSignUp() {
        return confirmedSignUp;
    }

    public void setConfirmedSignUp(Boolean confirmedSignUp) {
        this.confirmedSignUp = confirmedSignUp;
    }

    public Boolean getResetPassword() {
        return resetPassword;
    }

    public void setResetPassword(Boolean resetPassword) {
        this.resetPassword = resetPassword;
    }

    public Date getResetPasswordDate() {
        return resetPasswordDate;
    }

    public void setResetPasswordDate(Date resetPasswordDate) {
        this.resetPasswordDate = resetPasswordDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}