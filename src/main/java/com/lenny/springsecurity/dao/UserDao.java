package com.lenny.springsecurity.dao;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserDao {

    private final static List<UserDetails> APPLICATION_USERS = Arrays.asList(
            new User("userone@gmail.com", "123456", Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"))),
            new User("usertwo@gmail.com", "123456", Collections.singleton(new SimpleGrantedAuthority("ROLE_USER")))
    );

    public UserDetails findByUsername(String username) {
        return APPLICATION_USERS.stream().filter(userDetails -> userDetails.getUsername().equals(username)).findFirst()
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
