package com.example.springevents.service;

import com.example.springevents.domain.event.PrintedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PrintedEventHandler {

    @EventListener
    @Async
    public void process(PrintedEvent event) {
        PrintedEvent printedEvent = new PrintedEvent();
        printedEvent.setMessage(printedEvent.getMessage());
        log.info(event.getMessage());
    }

}
