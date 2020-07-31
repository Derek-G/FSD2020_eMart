package com.emart.userregister.jpa.repository;

import com.emart.userregister.jpa.entity.ItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SearchIteamRepository extends JpaRepository<ItemsEntity,Integer> {

    /**
     * Query Item
     * @param name
     * @return
     */
    List<ItemsEntity> findByItemNameLike(String name);


    /**
     * Use Custom Query To Random Select 3 Items To Display On Home Page
     * @return
     */
    @Query(nativeQuery=true, value="SELECT * FROM items order by rand() LIMIT 3")
    List<ItemsEntity> findHomeItems();

    /**
     * Use Rules Query Items To Display On Home Page
     * @param name
     * @param startPrice
     * @param endPrice
     * @return
     */
    @Query(nativeQuery=true, value="SELECT * FROM items where item_name like CONCAT('%',:name,'%') and price between :startPrice and :endPrice")
    List<ItemsEntity> searchItems(@Param("name") String name,@Param("startPrice") Integer startPrice,@Param("endPrice") Integer endPrice);

}
