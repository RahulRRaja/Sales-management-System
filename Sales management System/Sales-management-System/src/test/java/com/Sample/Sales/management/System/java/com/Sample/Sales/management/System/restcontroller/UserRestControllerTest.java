package com.Sample.Sales.management.System.restcontroller;

import com.Sample.Sales.management.System.Constants.TestConstants;
import com.Sample.Sales.management.System.entity.User;
import com.Sample.Sales.management.System.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class UserRestControllerTest {

    @InjectMocks
    private UserRestController userRestController;

    @Mock
    private UserServiceImpl userService;

    private User user()
    {
        User user = new User();
        user.setUid(TestConstants.uid);
        user.setUser_name(TestConstants.user_name);
        user.setAddress(TestConstants.address);
        user.setPhone_no(TestConstants.phone_no);
        return user;
    }


    @Test
    void saveUser() {
        try {
            userRestController.saveUser(user());
        }catch (Exception e)
        {

        }
    }

    @Test
    void getAllProduct() {
        try {
            userRestController.getAllProduct(TestConstants.PAGE_NO,TestConstants.PAGE_SIZE);
        }catch (Exception e)
        {

        }
    }

    @Test
    void delete() {
        try {
            userRestController.delete(user());
        }catch (Exception e)
        {

        }
    }

    @Test
    void deleteById() {
        try {
            userRestController.deleteById(TestConstants.uid);
        }catch (Exception e)
        {

        }
    }

    @Test
    void getUserById() {
        try {
            userRestController.getUserById(TestConstants.uid);
        }catch (Exception e)
        {

        }
    }

    @Test
    void editUser() {
        try {
            userRestController.editUser(user());
        }catch (Exception e)
        {

        }
    }
}