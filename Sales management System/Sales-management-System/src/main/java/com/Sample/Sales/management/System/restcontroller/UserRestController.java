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
    public User saveUser(@RequestBody User u) throws InternalServerErrorException
    {
         userService.CreateUser(u);
        return u;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<User> getAllProduct(@RequestParam(defaultValue = "0")Integer pageNo,@RequestParam(defaultValue = "20")Integer pageSize) throws InternalServerErrorException
    {
        List<User> list = userService.getAllUser(pageNo,pageSize);
        return list;
    }
    @DeleteMapping("/delete")
    public void delete(User user) throws InternalServerErrorException
    {
        userService.deleteUser(user);
    }
    @DeleteMapping("/delete/{uid}")
    public void deleteById(@PathVariable("uid") Integer uid) throws InternalServerErrorException
    {
        userService.deleteUserById(uid);
    }
    @RequestMapping(value = "/get/{uid}", method = RequestMethod.GET, headers = "Accept=application/json")
    public User getUserById(@PathVariable("uid") Integer uid) throws InternalServerErrorException
    {
      return  userService.getUser(uid);
    }
    @PutMapping("/edituser")
    public User editUser(@RequestBody User u) throws InternalServerErrorException
    {
        userService.editUser(u);
        return u;
    }
     @RequestMapping("/search")
    public List<User> searchUser(@PathVariable String user_name)
    {
        return userService.listAll(user_name);
    }


}
