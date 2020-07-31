package com.emart.jpa.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author gtonggt@cn.ibm.com
 */
@Entity
@Table(name = "discounts", schema = "emart", catalog = "")
public class DiscountsEntity {
    private int id;
    private String discountCode;
    private String percentage;
    private Timestamp startDate;
    private Timestamp endDate;
    private String description;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Discount_code")
    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    @Basic
    @Column(name = "percentage")
    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    @Basic
    @Column(name = "start_date")
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "end_date")
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DiscountsEntity that = (DiscountsEntity) o;

        if (id != that.id) {
            return false;
        }
        if (!Objects.equals(discountCode, that.discountCode)) {
            return false;
        }
        if (!Objects.equals(percentage, that.percentage)) {
            return false;
        }
        if (!Objects.equals(startDate, that.startDate)) {
            return false;
        }
        if (!Objects.equals(endDate, that.endDate)) {
            return false;
        }
        if (!Objects.equals(description, that.description)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (discountCode != null ? discountCode.hashCode() : 0);
        result = 31 * result + (percentage != null ? percentage.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
