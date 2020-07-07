package com.example.operator;

public class FileResources {
    public void runHello() {
        FileResources f;
        f = new FileResources("file.txt");
        for (String line : f.lines()) {
            System.out.println(line);
        }
    }
}
