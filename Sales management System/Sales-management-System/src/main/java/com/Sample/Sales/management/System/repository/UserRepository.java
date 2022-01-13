package com.Sample.Sales.management.System.repository;

import com.Sample.Sales.management.System.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User,Integer> {
   @Query("SELECT u FROM user u WHERE u.user_name LIKE %:user_name%")
    public List<User> FindByUserLike(String user_name);
    @Query("SELECT u FROM user u WHERE u.first_name LIKE %:first_name%")
    public List<User> findByFirstNameLike(String first_name);

    @Query("SELECT u FROM user u WHERE u.last_name LIKE %:last_name%")
    public List<User> findByLastNameLike(String last_name);

}
