package com.kodilla.kodillajms.controller;

import com.kodilla.kodillajms.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @GetMapping(path = "/sendOrder")
    public void processMessage(@RequestParam String orderName, @RequestParam Double orderPrice) {
        jmsTemplate.convertAndSend("queue-orders", new Order(orderName,orderPrice));
    }

}
