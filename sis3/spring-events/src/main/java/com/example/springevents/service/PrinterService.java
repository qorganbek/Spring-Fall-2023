package com.example.springevents.service;

import com.example.springevents.domain.event.PrintedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PrinterService {
    private final ApplicationEventPublisher eventPublisher;

    public String print(String message) {
        log.info("printer service: " + message);
        log.info("Thread name " + Thread.currentThread().getName());

        PrintedEvent printedEvent = new PrintedEvent();
        printedEvent.setMessage(message);

        eventPublisher.publishEvent(printedEvent);
        return message;
    }

}
