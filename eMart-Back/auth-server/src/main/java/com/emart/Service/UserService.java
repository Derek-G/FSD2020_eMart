package com.emart.Service;

import com.emart.Entity.UserEntity;

import java.util.List;

/**
 * @author gtonggt@cn.ibm.com
 */
public interface UserService {

    /**
     * Get All User
     * @return
     */
    List<UserEntity> getUsers();

}
