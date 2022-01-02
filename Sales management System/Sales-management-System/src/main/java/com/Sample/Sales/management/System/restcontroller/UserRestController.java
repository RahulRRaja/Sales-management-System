package com.Sample.Sales.management.System.restcontroller;

import com.Sample.Sales.management.System.entity.User;
import com.Sample.Sales.management.System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST, headers = "Accept=application/json")
    public User saveUser(@RequestBody User u)
    {
         userService.CreateUser(u);
        return u;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<User> getAllProduct(@RequestParam(defaultValue = "0")Integer pageNo,@RequestParam(defaultValue = "20")Integer pageSize)
    {
        List<User> list = userService.getAllUser(pageNo,pageSize);
        return list;
    }
    @DeleteMapping("/delete")
    public void delete(User user)
    {
        userService.deleteUser(user);
    }
    @DeleteMapping("/delete/{uid}")
    public void deleteById(@PathVariable("uid") Integer uid)
    {
        userService.deleteUserById(uid);
    }
    @RequestMapping(value = "/get/{uid}", method = RequestMethod.GET, headers = "Accept=application/json")
    public User getUserById(@PathVariable("uid") Integer uid)
    {
      return  userService.getUser(uid);
    }
    @PutMapping("/edituser")
    public User editUser(@RequestBody User u)
    {
        userService.editUser(u);
        return u;
    }

}