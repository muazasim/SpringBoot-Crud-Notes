package com.example.demo.controller;
import com.example.demo.entity.User;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.service.UserService;
import com.example.demo.service.UserService;
// import org.springframework.web.bind.annotation.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@org.springframework.stereotype.Controller
// @Controller
@RestController
@CrossOrigin("http://localhost:3000/")

public class UserContoller {
    @Autowired
private UserService service;

@PostMapping("/saveUser")
public User saveUser(@RequestBody User user)
{
  
return service.saveUser(user);
}

@GetMapping("/getAllUser")
public List<User> getAllUser()
{
return service.getAllUser();
}

@PutMapping("/updateUser")
public User updateUser(@RequestBody User user){
return service.updateUser(user);
}
@DeleteMapping("/deleteUser/{id}")
public String deleteUser(@PathVariable int id )
{
    return service.deleteUser(id);
}
    
}
