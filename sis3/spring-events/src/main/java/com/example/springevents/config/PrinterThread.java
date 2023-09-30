//package com.example.springevents.config;
//
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//public class PrinterThread implements Runnable {
//    @Override
//    public void run() {
//        log.info("thread startted");
//        log.info("Name: " + Thread.currentThread().getName());
//
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e){
//            throw new RuntimeException();
//        }
//        log.info("printer thread end");
//
//    }
//}
