package com.course.unifal.ecommerce.service.ecommerce;

import com.course.unifal.ecommerce.domain.user.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EcommerceService {


    public void createUser(User user){
        return "User: " + user.getUser() + " created!";
    }


    public String deleteUser(String username){
        if( username == null || username.isEmpty()){
            return "User required! You'll delete all users";
        }
        return "User: " + username + "deleted!";
    }


    public User updateUser(User updatedUser){
        //Considering an user already created in database, the following verifications
        //is to update this user based on PUT method
        User userAlreadyCreated = new User();
        userAlreadyCreated.setRole("CAIXA");
        userAlreadyCreated.setPassword("123");
        userAlreadyCreated.setUser("Jhon");

        if(updatedUser.getRole() != null  && !updatedUser.getRole().isEmpty()){
           userAlreadyCreated.setRole(updatedUser.getRole());
        }
        if(updatedUser.getPassword() != null && !updatedUser.getPassword().isEmpty()){
            userAlreadyCreated.setRole(updatedUser.getPassword());
        }
        if(updatedUser.getUser() != null && !updatedUser.getUser().isEmpty()){
            userAlreadyCreated.setUser(updatedUser.getUser());
        }
        return userAlreadyCreated;
    }
}
