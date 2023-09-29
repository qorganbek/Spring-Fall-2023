package com.example.printer.entity;

public class BWPrinter implements IPrintable {

    @Override
    public String print(String text){
        return String.format("%s is black-white printed!", text);
    }
}
