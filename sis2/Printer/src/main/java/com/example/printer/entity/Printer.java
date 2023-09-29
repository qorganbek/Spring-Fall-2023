package com.example.printer.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Printer {
    @Autowired
    private IPrintable printable;

    public void setup(IPrintable printable) {
        this.printable = printable;
    }

    public String print(String text){
        return printable.print(text);
    }

}
