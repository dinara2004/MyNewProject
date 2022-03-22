package com.company.service;

import com.company.model.User;

import java.util.List;

public interface UserService {
    void UserdiKoshuu(List<User> mas, User user);
    int IDMnTabuu(List<User> mas, int id);
    int IDMnOchuruu(List<User> mas, int id);
    int BaarynAluu(List<User> mas);
}
