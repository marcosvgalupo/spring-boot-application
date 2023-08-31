package com.course.unifal.ecommerce.domain.user;

import lombok.Data;

@Data
public class User {
    private String user;
    private String password;
    private String role;
}
