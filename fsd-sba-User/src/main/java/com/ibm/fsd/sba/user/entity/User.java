package com.ibm.fsd.sba.user.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(
        name = "users",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"user_name"})})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NaturalId
    @NotBlank
    @Size(max = 50)
    @Email
    @Column(name = "user_name")
    private String userName;

    @NotBlank
    @Size(min = 6, max = 100)
    @Column(name = "password")
    private String password;

    @Size(min = 3, max = 50)
    @Column(name = "first_name")
    private String firstName;

    @Size(min = 3, max = 50)
    @Column(name = "last_name")
    private String lastName;

    @Positive(message = "Contact number should be positive value")
    @Column(name = "contact_number")
    private Long contactNumber;

    @Column(name = "reg_code")
    private String regCode = "";

    @Column(name = "role")
    private String role;

    @Column(name = "linkedin_url")
    private String linkedinUrl = null;

    @Column(name = "years_of_experience")
    private Float yearsOfExperience;

    @Column(name = "active")
    private Boolean active = false;

    @Column(name = "confirmed_signup")
    private Boolean confirmedSignUp = false;

    @Column(name = "reset_password")
    private Boolean resetPassword = false;

    @Column(name = "reset_password_date")
    private Date resetPasswordDate;


    public User() {
    }

    public User(
            String userName,
            String password,
            String firstName,
            String lastName,
            Long contactNumber,
            String regCode,
            String linkedinUrl,
            Float yearsOfExperience,
            Boolean active,
            Boolean confirmedSignUp,
            Boolean resetPassword,
            Date resetPasswordDate) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.regCode = regCode;
        this.role = role;
        this.linkedinUrl = linkedinUrl;
        this.yearsOfExperience = yearsOfExperience;
        this.active = active;
        this.confirmedSignUp = confirmedSignUp;
        this.resetPassword = resetPassword;
        this.resetPasswordDate = resetPasswordDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
}
