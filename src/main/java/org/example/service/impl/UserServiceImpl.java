package org.example.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.modul.User;
import org.example.service.FileService;
import org.example.service.UserService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class UserServiceImpl implements UserService {
    public User create(User user) {
            if (get(user.getChatId()) == null) {
                User newUser = new User(
                        user.getChatId(),
                        user.getPhoneNumber(),
                        user.getState()
                );
                boolean add = users().add(user);
                if (add){
                    File file = new File("users.txt");
                    try {
                        file.createNewFile();
                        FileWriter fileWriter = new FileWriter(file, true);
                        fileWriter.write(newUser.toString());
                        fileWriter.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            return user;
        }

    @Override
    public User get(long chatId) {
        return null;
    }

    @Override
    public List<User> users() {
        return null;
    }

    @Override
    public User update(long chatId, User user) {
        return null;
    }

    @Override
    public User delete(long chatId) {
        users().remove(chatId);
        return null;
    }
}
