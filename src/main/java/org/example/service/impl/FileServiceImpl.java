package org.example.service.impl;

import org.example.service.FileService;

import java.io.*;

public class FileServiceImpl implements FileService {
    @Override
    public String getDataFromFile(String fileName) {
        File file = new File("src/main/resources/files/" + fileName);
        StringBuilder builder = new StringBuilder();
        try {
            FileReader reader = new FileReader(file);
            BufferedReader bf = new BufferedReader(reader);
            String line;
            while ((line = bf.readLine()) != null){
                builder.append(line);
            }
            bf.close();
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return builder.toString();
    }

    @Override
    public boolean writeDateToFile(String data, String fileName) {
        File file = new File("src/main/resources/files/" + fileName);
        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
