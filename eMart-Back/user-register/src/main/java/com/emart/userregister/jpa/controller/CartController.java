package com.emart.userregister.jpa.controller;

import com.emart.userregister.jpa.entity.CartEntity;
import com.emart.userregister.jpa.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author gtonggt@cn.ibm.com
 */
@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    /**
     * Get Cart Data By Given username
     * @param username
     * @return
     */
    @RequestMapping( value= "/cart",method = RequestMethod.GET)
    public List getCartByUser(@RequestParam("username") String username){

        return  cartService.findCartByUser(username);

    }

    /**
     * Add Item To Cart
     * @param cartEntity
     * @return
     */
    @RequestMapping(value = "/addcart",method = RequestMethod.POST)
    public CartEntity addToCart(@RequestBody CartEntity cartEntity){

        return cartService.addToCart(cartEntity);
    }

    /**
     * Delete Item From Cart
     * @param username
     * @return
     */
    @RequestMapping(value = "/deletecart",method = RequestMethod.DELETE)
    public Integer deleteFromCart(@RequestParam("username") String username){

        return cartService.deleteCart(username);

    }

    /**
     * Update Count Of Item
     * @param cartEntity
     * @return
     */
    @RequestMapping(value = "/updatecart",method = RequestMethod.PUT)
    public boolean updateCart(@RequestBody CartEntity cartEntity){

        return cartService.updateCart(cartEntity);
    }
}
