package com.emart.userregister.jpa.service;

import com.emart.userregister.jpa.entity.CartEntity;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author gtonggt@cn.ibm.com
 */
public interface CartService {

    /**
     * Cart Service To Get All Items In Cart By User
     * @param username
     * @return
     */
    List findCartByUser(String username);

    /**
     * Add Item To Cart
     * @param cart
     * @return
     */
    CartEntity addToCart(CartEntity cart);

    /**
     * Remove Item To Cart
     * @param cart
     * @return
     */
     boolean removeFromCart(CartEntity cart);

    /**
     * Update Item To Cart
     * @param cartEntity
     * @return
     */
    boolean updateCart(CartEntity cartEntity);

    /**
     * Remove All For User
     * @param buyer_username
     * @return
     */
    @Transactional
    Integer deleteCart(String buyer_username);
}
