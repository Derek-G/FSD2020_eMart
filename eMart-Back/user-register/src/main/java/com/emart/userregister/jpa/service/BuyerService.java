package com.emart.userregister.jpa.service;

import com.emart.userregister.jpa.entity.BuyerEntity;

import java.util.List;

/**
 * @author gtonggt@cn.ibm.com
 */
public interface BuyerService {
    /**
     * Get Buyer By ID
     * @param id
     * @return
     */
    BuyerEntity getBuyerById(int id) ;

    /**
     * Get All Buyers List
     * @return
     */

    List<BuyerEntity> getAllBuyer();

    /**
     * Insert User To Buyers Table
     * @param buyerEntity
     * @return
     */

    BuyerEntity inertOneBuyer(BuyerEntity buyerEntity);
}
