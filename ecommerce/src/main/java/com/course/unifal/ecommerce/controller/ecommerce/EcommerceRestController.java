package com.course.unifal.ecommerce.controller.ecommerce;

import com.course.unifal.ecommerce.domain.user.User;
import com.course.unifal.ecommerce.service.ecommerce.EcommerceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor //the attributes has to be final
public class EcommerceRestController {

    private final EcommerceService ecommerceService;

    @GetMapping(path = "/v1/ecommerce/users")
    public String getEcommerce(@RequestParam String role){
        return "Hello! You are a " + role;
    }

    @PostMapping(path = "/v1/ecommerce/users")
    public String createUsers(@RequestBody User user){
        return "User created! User: " + user.getUser();
    }

    @DeleteMapping(path = "/v1/ecommerce/users")
    public String deleteUsers(@RequestParam(required = false) String username){
        return ecommerceService.deleteUser(username);
    }

    @PutMapping(path = "/v12/ecommerce/user")
    public User updateUser(@RequestBody User user){
        return ecommerceService.updateUser(user);
    }

}
