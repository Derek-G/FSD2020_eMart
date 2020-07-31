package com.emart.userregister.jpa.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author gtonggt@cn.ibm.com
 */
@Entity
@Table(name = "user", schema = "emart")
public class UserEntity {
    private int id;
    private String username;
    private String password;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        UserEntity that = (UserEntity) o;

        if (id != that.id) {
            return false;
        }
        if (!Objects.equals(username, that.username)) {
            return false;
        }
        if (!Objects.equals(password, that.password)) {
            return false;
        }
//        if (emailid != null ? !emailid.equals(that.emailid) : that.emailid != null) return false;
//        if (role != null ? !role.equals(that.role) : that.role != null) return false;
//        if (createdDatetime != null ? !createdDatetime.equals(that.createdDatetime) : that.createdDatetime != null)
//            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
//        result = 31 * result + (emailid != null ? emailid.hashCode() : 0);
//        result = 31 * result + (role != null ? role.hashCode() : 0);
//        result = 31 * result + (createdDatetime != null ? createdDatetime.hashCode() : 0);
        return result;
    }
}
