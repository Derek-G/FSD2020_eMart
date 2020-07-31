package com.emart.userregister.jpa.repository;

import com.emart.userregister.jpa.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author gtonggt@cn.ibm.com
 */
public interface CartRepository extends JpaRepository<CartEntity,Integer> {

    /**
     *
     * Get Shopping Cart Data Through The Specified Username
     * @param username
     * @return
     */
    @Query(nativeQuery=true, value="select a.buyer_username,a.item_name,a.count,b.price,a.item_id from cart a,items b where a.buyer_username=:username and a.item_id=b.id")
    List findCartEntitiesByBuyerUsername(@Param("username") String username);


    /**
     * Update Counts For Cart
     * @param number
     * @param username
     * @param item_id
     * @return
     */
    @Query(nativeQuery=true, value="update cart set count = :number where buyerUsername=:username and item_id=:item_id")
    Boolean updateCart(@Param("number") Integer number,@Param("username") String username,@Param("item_id") Integer item_id);

    /**
     * Clean Cart
     * @param buyerUsername
     * @return
     */
    Integer deleteAllByBuyerUsername(@Param("buyerUsername") String buyerUsername);


}
