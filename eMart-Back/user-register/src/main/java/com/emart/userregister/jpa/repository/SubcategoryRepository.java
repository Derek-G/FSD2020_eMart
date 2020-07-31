package com.emart.userregister.jpa.repository;

import com.emart.userregister.jpa.entity.SubcategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author gtonggt@cn.ibm.com
 */
public interface SubcategoryRepository extends JpaRepository<SubcategoryEntity,Integer> {

    /**
     * Select All Subcategory
     * @return
     */
    @Query(nativeQuery=true, value="SELECT distinct subcategory_name FROM subcategory")
    List findAllSubCategory();
}
