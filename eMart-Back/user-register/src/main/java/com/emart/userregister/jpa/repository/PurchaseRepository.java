package com.emart.userregister.jpa.repository;

import com.emart.userregister.jpa.entity.PurchasehistoryEntity;
import com.emart.userregister.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author gtonggt@cn.ibm.com
 */
public interface PurchaseRepository extends JpaRepository<PurchasehistoryEntity,Integer> {

//    List<PurchasehistoryEntity> findPurchasersEntitiesByBuyerId(Integer buyerId);

    /**
     * Get The User's Purchase History List Through The Repository
     * @param username
     * @return
     */
    List findAllByBuyerUsername(@Param("username") String username);


    /**
     * Get User's History Info
     * @param username
     * @return
     */
    @Query(nativeQuery=true, value="select b.item_name,b.price,a.number_of_items,a.date_time from purchasehistory a,items b where a.buyer_username=:username and a.item_id=b.id")
    List getHistoryByUsername(@Param("username") String username);
    
}
