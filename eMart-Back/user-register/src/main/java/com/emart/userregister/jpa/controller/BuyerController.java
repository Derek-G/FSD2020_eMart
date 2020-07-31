package com.emart.userregister.jpa.controller;

import com.emart.userregister.jpa.entity.BuyerEntity;
import com.emart.userregister.jpa.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author gtonggt@cn.ibm.com
 */
@RestController
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    /**
     * Get Buyer Info
     * @param id
     * @return
     */
    @RequestMapping(value = "/id",method = RequestMethod.GET)
    public BuyerEntity getBuyerById(@RequestParam("id") Integer id){
        return buyerService.getBuyerById(id);
    }

    /**
     * Get All Buyer
     * @return
     */
    @RequestMapping(value = "/buyers",method = RequestMethod.GET)
    public List<BuyerEntity> findAll(){
        return  buyerService.getAllBuyer();
    }


    /**
     * Insert Buyer Info
     * @param buyerEntity
     * @return
     */
    @RequestMapping(value = "/buyer",method = RequestMethod.POST)
    public BuyerEntity insertOneBuyer(@RequestBody BuyerEntity buyerEntity){
        return buyerService.inertOneBuyer(buyerEntity);
    }
}
