package com.emart.userregister.jpa.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author gtonggt@cn.ibm.com
 */
@Entity
@Table(name = "category", schema = "emart", catalog = "")
public class CategoryEntity {
    private int categoryId;
    private String categoryName;
    private String briefDetails;

    @Id
    @Column(name = "category_id")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "category_name")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Basic
    @Column(name = "brief_details")
    public String getBriefDetails() {
        return briefDetails;
    }

    public void setBriefDetails(String briefDetails) {
        this.briefDetails = briefDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CategoryEntity that = (CategoryEntity) o;

        if (categoryId != that.categoryId) {
            return false;
        }
        if (!Objects.equals(categoryName, that.categoryName)) {
            return false;
        }
        if (!Objects.equals(briefDetails, that.briefDetails)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        result = 31 * result + (briefDetails != null ? briefDetails.hashCode() : 0);
        return result;
    }
}
