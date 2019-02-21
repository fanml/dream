package com.example.superwoman.service;

public interface UserService {
    boolean selectUserByName(String name);

    boolean insertUser(String username, String password);
}
