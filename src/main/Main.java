package main;

import repository.FileRepository;
import services.Menu;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");

        FileRepository file = new FileRepository();
        file.createFile();
        file.readFile();

        Menu menu =  new Menu();
        menu.showMenu();

    }
}
