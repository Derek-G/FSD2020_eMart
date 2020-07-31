package com.emart.userregister.jpa.service;


import com.emart.userregister.jpa.entity.ItemsEntity;

import java.util.List;

/**
 * @author gtonggt@cn.ibm.com
 */
public interface SearchItemService {


    /**
     * Find Related Items By Item name
     * @param name
     * @return
     */
    List<ItemsEntity> findItems(String name);


    /**
     * Used To Get 3 Or 4 Items Displayed On The Home Page For Buyers
     * @return
     */
    List<ItemsEntity> findHomeItems();

    /**
     * By Rule Search Item
     * @param name
     * @param start
     * @param end
     * @return
     */
    List<ItemsEntity> searchIteams(String name,Integer start,Integer end);
}
