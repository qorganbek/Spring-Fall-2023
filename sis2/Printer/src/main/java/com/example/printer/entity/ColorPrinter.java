package com.example.printer.entity;

public class ColorPrinter implements IPrintable {
    @Override
    public String print(String text) {
        return String.format("%s is color printed!", text);
    }
}
