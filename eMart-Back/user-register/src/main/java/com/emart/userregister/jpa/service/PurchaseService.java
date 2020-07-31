package com.emart.userregister.jpa.service;


import com.emart.userregister.jpa.entity.PurchasehistoryEntity;

import java.util.List;

/**
 * @author gtonggt@cn.ibm.com
 */
public interface PurchaseService {

    /**
     * Get PurchaseHistory List By User
     * @param username
     * @return
     */
    List getPurchaseHistory(String username);

    /**
     * Add Purchase History After Submit Order
     * @param purchasehistoryEntity
     * @return
     */
    PurchasehistoryEntity addPurchaseHistory(PurchasehistoryEntity purchasehistoryEntity);


}
