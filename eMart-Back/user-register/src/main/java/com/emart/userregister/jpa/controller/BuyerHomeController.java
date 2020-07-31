package com.emart.userregister.jpa.controller;


import com.emart.userregister.jpa.entity.ItemsEntity;
import com.emart.userregister.jpa.service.SearchItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author gtonggt@cn.ibm.com
 */
@RestController
public class BuyerHomeController {

    @Autowired
    private  SearchItemService searchItemService;

    /**
     * Used To Get Random 3 Items To Display On Home Page.
     */
    @RequestMapping( value= "/homeitems",method = RequestMethod.GET)
    List<ItemsEntity> getHomeItems(){
        return searchItemService.findHomeItems();
    }
}
