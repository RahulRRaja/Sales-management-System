package com.Sample.Sales.management.System.service.impl;

import com.Sample.Sales.management.System.entity.User;
import com.Sample.Sales.management.System.repository.UserRepository;
import com.Sample.Sales.management.System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User CreateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(Integer uid) {

     return  userRepository.findById(uid).get();
    }

    @Override
    public User editUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.deleteAll();
    }

    @Override
    public void deleteUserById(Integer uid) {
        userRepository.deleteById(uid);
    }

    @Override
    public List<User> getAllUser(Integer pageNo, Integer pageSize) {
        Pageable paging = PageRequest.of(pageNo,pageSize);
        Page<User> userPage = userRepository.findAll(paging);
        if(userPage.hasContent())
        {
            return userPage.getContent();
        }
       else{
           return new ArrayList<>();
        }
    }
    @Override
    public List<User> listAll(String user_name) {

            return userRepository.getByUser(user_name);

    }



}
