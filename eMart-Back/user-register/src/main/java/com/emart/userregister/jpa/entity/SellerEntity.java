package com.emart.userregister.jpa.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author gtonggt@cn.ibm.com
 */
@Entity
@Table(name = "seller", schema = "emart", catalog = "")
public class SellerEntity {
    private int id;
    private String username;
    private String password;
    private String emailid;
    private Integer contactNumber;
    private Timestamp createdDatetime;
    private String companyname;
    private String gstin;
    private String briefAboutCompany;
    private String postalAddress;
    private String website;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "emailid")
    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    @Basic
    @Column(name = "contact_number")
    public Integer getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Integer contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Basic
    @Column(name = "created_datetime")
    public Timestamp getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Timestamp createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    @Basic
    @Column(name = "companyname")
    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    @Basic
    @Column(name = "GSTIN")
    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

    @Basic
    @Column(name = "brief_about_company")
    public String getBriefAboutCompany() {
        return briefAboutCompany;
    }

    public void setBriefAboutCompany(String briefAboutCompany) {
        this.briefAboutCompany = briefAboutCompany;
    }

    @Basic
    @Column(name = "postal_address")
    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    @Basic
    @Column(name = "website")
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SellerEntity that = (SellerEntity) o;

        if (id != that.id) {
            return false;
        }
        if (!Objects.equals(username, that.username)) {
            return false;
        }
        if (!Objects.equals(password, that.password)) {
            return false;
        }
        if (!Objects.equals(emailid, that.emailid)) {
            return false;
        }
        if (!Objects.equals(contactNumber, that.contactNumber)) {
            return false;
        }
        if (!Objects.equals(createdDatetime, that.createdDatetime)) {
            return false;
        }
        if (!Objects.equals(companyname, that.companyname)) {
            return false;
        }
        if (!Objects.equals(gstin, that.gstin)) {
            return false;
        }
        if (!Objects.equals(briefAboutCompany, that.briefAboutCompany)) {
            return false;
        }
        if (!Objects.equals(postalAddress, that.postalAddress)) {
            return false;
        }
        if (!Objects.equals(website, that.website)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (emailid != null ? emailid.hashCode() : 0);
        result = 31 * result + (contactNumber != null ? contactNumber.hashCode() : 0);
        result = 31 * result + (createdDatetime != null ? createdDatetime.hashCode() : 0);
        result = 31 * result + (companyname != null ? companyname.hashCode() : 0);
        result = 31 * result + (gstin != null ? gstin.hashCode() : 0);
        result = 31 * result + (briefAboutCompany != null ? briefAboutCompany.hashCode() : 0);
        result = 31 * result + (postalAddress != null ? postalAddress.hashCode() : 0);
        result = 31 * result + (website != null ? website.hashCode() : 0);
        return result;
    }
}
