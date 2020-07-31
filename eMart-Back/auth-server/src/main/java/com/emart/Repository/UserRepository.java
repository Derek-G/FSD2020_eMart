package com.emart.Repository;


import com.emart.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author gtonggt@cn.ibm.com
 */
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    @Query(nativeQuery=true, value="SELECT id,username,password FROM seller union select id,username,password from buyer")
    /**
     * Get All User
     * @return
     */
    List<UserEntity> getUsers();
}
