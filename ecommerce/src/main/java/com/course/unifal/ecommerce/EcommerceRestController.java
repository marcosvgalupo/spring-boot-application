package com.course.unifal.ecommerce;

import org.springframework.web.bind.annotation.*;

@RestController
public class EcommerceRestController {

    @GetMapping(path = "/v1/ecommerce/users")
    public String getEcommerce(@RequestParam String role){
        return "Hello! You are a " + role;
    }

    @PostMapping(path = "/v1/ecommerce/users")
    public String createUsers(@RequestBody User user){
        return "User created! User: " + user.getUser();
    }

    @DeleteMapping(path = "/v1/ecommerce/users")
    public String deleteUsers(@RequestParam(required = false) String user){
        if( user == null || user.isEmpty()){
            return "User required! You'll delete all users";
        }
        return user;
    }

    @PutMapping(path = "/v12/ecommerce/users")
    public User updateUsers(@RequestBody User user){
        //Considering a user already created in database, the following verifications
        //is to update this user based on PUT method
        if(user.getRole() != null  && !user.getRole().isEmpty()){
            // update user role
        }
        if(user.getPassword() != null && !user.getPassword().isEmpty()){
            // update user password
        }
        if(user.getUser() != null && !user.getUser().isEmpty()){
            // update user
        }

        return user;
    }



}
