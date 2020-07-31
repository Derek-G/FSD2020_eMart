package com.emart.userregister.jpa.service;

import com.emart.userregister.jpa.entity.UserEntity;

import java.util.List;

/**
 * @author gtonggt@cn.ibm.com
 */
public interface UsersService {
    /**
     * Get All Users
     * @return
     */
    List<UserEntity> getUsers();
}
