package com.example.printer.config;

import com.example.printer.entity.ColorPrinter;
import com.example.printer.entity.IPrintable;
import com.example.printer.entity.Printer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public IPrintable iprintable(){
        return new ColorPrinter();
    }

    @Bean
    public Printer printer(){
        return new Printer();
    }

}
