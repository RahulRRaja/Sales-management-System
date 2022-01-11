package com.Sample.Sales.management.System.repository;

import com.Sample.Sales.management.System.entity.Spare_Parts;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Spare_PartsRepository extends PagingAndSortingRepository<Spare_Parts,Integer> {
   @Query("SELECT u FROM user u WHERE u.user_name=?1")
    public List<User> getByUser(String user_name);
  
  
}
