package org.example.service;

import org.example.modul.User;

import java.util.List;

public interface UserService {
    User create(User user);
    User get(long chatId);
    List<User> users();
    User update(long chatId, User user);
    User delete(long chatId);
}
