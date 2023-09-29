package com.example.printer.service;

import com.example.printer.entity.BWPrinter;
import com.example.printer.entity.ColorPrinter;
import com.example.printer.entity.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrinterService {
    @Autowired
    private Printer printer;
    public PrinterService(){ }

    public String print(String message){
        if(message.contains("color")){
            printer.setup(new ColorPrinter());
        } else {
            printer.setup(new BWPrinter());
        }
        return printer.print(message);
    }
}
