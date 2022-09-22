package com.demo.auth.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class User {

    Integer id;

    String username;

    String password;

}
