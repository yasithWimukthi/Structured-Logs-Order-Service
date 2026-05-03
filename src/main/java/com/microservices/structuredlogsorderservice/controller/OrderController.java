package com.microservices.structuredlogsorderservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    @GetMapping
    public String getOrders() {
        log.info("Fetching all orders");
        return "Order Service Response";
    }

    @PostMapping
    public String createOrder() {
        log.info("Creating new order");
        return "Order Created Successfully";
    }
}