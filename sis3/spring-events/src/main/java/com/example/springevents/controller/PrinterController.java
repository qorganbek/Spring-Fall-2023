package com.example.springevents.controller;

import com.example.springevents.service.PrinterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PrinterController {

    private final PrinterService service;

    @GetMapping("/print")
    public String print(@RequestParam String message) {
        return service.print(message);
    }


}
