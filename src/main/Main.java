package main;

import repository.FileRepository;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");

        FileRepository file = new FileRepository();
        file.createFile();

    }
}
