package com.Sample.Sales.management.System.repository;

import com.Sample.Sales.management.System.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User,Integer> {
   @Query("SELECT u FROM user u WHERE u.user_name=?1")
    public List<User> getByUser(String user_name);
  
}
