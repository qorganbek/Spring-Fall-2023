package com.example.printer.controller;

import com.example.printer.service.PrinterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PrinterController {
    private final PrinterService printerService;

    @GetMapping("")
    public String test(){
        return "This is main page!";
    }

    @GetMapping("/print")
    public String print(@RequestParam String text){
        return printerService.print(text);
    }

}
