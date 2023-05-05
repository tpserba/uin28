package com.in28minutes.serbatic.tpraga.todo.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String name, String password){
        boolean isValidName = name.equalsIgnoreCase("john");
        boolean isValidPassword = password.equalsIgnoreCase("1234");

        return isValidName && isValidPassword;
    }
}
