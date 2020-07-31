package com.emart.userregister.jpa.repository;

import com.emart.userregister.jpa.entity.BuyerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

/**
 * @description This DAO For Buyer
 * @author gtonggt@cn.ibm.com
 */

public interface BuyerRepository extends JpaRepository<BuyerEntity,Integer> {

}
