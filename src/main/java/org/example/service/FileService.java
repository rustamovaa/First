package org.example.service;

public interface FileService {
    String getDataFromFile(String fileName);
    boolean writeDateToFile(String data, String fileName);
}
