package com.Sample.Sales.management.System.Service;

import com.Sample.Sales.management.System.Constants.TestConstants;
import com.Sample.Sales.management.System.entity.User;
import com.Sample.Sales.management.System.repository.UserRepository;
import com.Sample.Sales.management.System.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserRepository userRepository;

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
    void createUser() {
        try {
            userService.CreateUser(user());
        }catch (Exception e){

        }
    }

    @Test
    void getUser() {
            try {
                assertNull(userService.getUser(TestConstants.uid));
            }catch (Exception e) {
            }
    }

    @Test
    void editUser() {
        try {
            userService.editUser(user());
        } catch (Exception e) {
        }
    }

    @Test
    void deleteUser() {
        try {
            userService.deleteUser(user());
        }catch (Exception e){

        }
    }

    @Test
    void deleteUserById() {
        try {
            userService.deleteUserById(TestConstants.uid);
        }catch (Exception e)
        {

        }
    }

    @Test
    void getAllUser() {
        try {
            userService.getAllUser(TestConstants.PAGE_NO,TestConstants.PAGE_SIZE);
        }catch (Exception e){

        }
    }
}
