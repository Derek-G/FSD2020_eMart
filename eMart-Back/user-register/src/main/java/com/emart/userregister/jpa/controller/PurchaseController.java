package com.emart.userregister.jpa.controller;

import com.emart.userregister.jpa.entity.PurchasehistoryEntity;
import com.emart.userregister.jpa.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author gtonggt@cn.ibm.com
 */
@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    /**
     * Get Purchase History List For Buyers
     * @param
     * @return
     */
    @RequestMapping( value= "/purchase",method = RequestMethod.GET)
    public List getPurchaseHistory(@RequestParam("username") String username){

        return purchaseService.getPurchaseHistory(username);

    }

    /**
     * Add History After Submitting Order
     * @param purchasehistoryEntity
     * @return
     */
    @RequestMapping(value = "/addpurchase",method = RequestMethod.POST)
    public PurchasehistoryEntity addPurchaseHistory(@RequestBody PurchasehistoryEntity purchasehistoryEntity){

        return purchaseService.addPurchaseHistory(purchasehistoryEntity);

    }
}
