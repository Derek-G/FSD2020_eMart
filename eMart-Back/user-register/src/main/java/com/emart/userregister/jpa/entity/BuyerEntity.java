package com.emart.userregister.jpa.entity;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author gtonggt@cn.ibm.com
 */
@Entity
@EnableTransactionManagement
@Table(name = "buyer", schema = "emart", catalog = "")
public class BuyerEntity {
    private int id;
    private String username;
    private String password;
    private String emailid;
    private Integer mobileNumber;
    private Timestamp createdDatetime;

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
    @Column(name = "mobile_number")
    public Integer getMobileNumber() {

        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {

        this.mobileNumber = mobileNumber;
    }

    @Basic
    @Column(name = "created_datetime")
    public Timestamp getCreatedDatetime() {

        return createdDatetime;
    }

    public void setCreatedDatetime(Timestamp createdDatetime) {

        this.createdDatetime = createdDatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BuyerEntity that = (BuyerEntity) o;

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
        if (!Objects.equals(mobileNumber, that.mobileNumber)) {
            return false;
        }
        return Objects.equals(createdDatetime, that.createdDatetime);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (emailid != null ? emailid.hashCode() : 0);
        result = 31 * result + (mobileNumber != null ? mobileNumber.hashCode() : 0);
        result = 31 * result + (createdDatetime != null ? createdDatetime.hashCode() : 0);
        return result;
    }
}
