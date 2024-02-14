package org.example.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.modul.User;
import org.example.service.FileService;
import org.example.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private FileService fileService = new FileServiceImpl();
    private final String fileName = "users.txt";

    public User create(User user){
        String dataFromFile = fileService.getDataFromFile(fileName);
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            List<User> list = objectMapper.readValue(dataFromFile, List.class);
            list.add(user);
            Gson gson = new Gson;

        }
    }
}
