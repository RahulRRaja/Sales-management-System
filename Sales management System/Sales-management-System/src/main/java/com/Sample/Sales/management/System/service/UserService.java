package com.Sample.Sales.management.System.service;

import com.Sample.Sales.management.System.entity.User;

import java.util.List;

public interface UserService {

    User CreateUser(User user);

    User getUser(Integer uid);

    User editUser(User user);

    void deleteUser(User user);

    void deleteUserById(Integer uid);

    List<User> getAllUser(Integer pageNo, Integer pageSize);
    
     List<User> listAll(String user_name);
    
    List<User> list(String first_name);

    List<User> lim(String last_name);
}
