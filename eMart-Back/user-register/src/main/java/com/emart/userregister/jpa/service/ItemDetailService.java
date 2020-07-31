package com.emart.userregister.jpa.service;

import com.emart.userregister.jpa.entity.ItemsEntity;

import java.util.List;

/**
 * @author gtonggt@cn.ibm.com
 */
public interface ItemDetailService {
    /**
     * Get Items By Name
     * @param name
     * @return
     */
    List<ItemsEntity> getItemByName(String name);

    /**
     * Get All Item
     * @return
     */

    List<ItemsEntity> getAllItem();


}
