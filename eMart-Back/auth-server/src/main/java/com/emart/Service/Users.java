package com.emart.Service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gtonggt@cn.ibm.com
 */
@FeignClient(value = "user-register")
@RestController
public interface Users {
    /**
     * Get All User
     * @return
     */
    @GetMapping(value = "/users")
    List getUsers();


}
