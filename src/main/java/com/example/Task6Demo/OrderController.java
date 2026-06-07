package com.example.Task6Demo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class OrderController {
    HashMap<Integer, Order> orders = new HashMap<>();

    public OrderController() {
        orders.put(1, new Order(101, "Muscat - Al Khuwair", "Pending"));
        orders.put(2, new Order(102, "Muscat - Al Khuwair", "Pending"));
    }

    @PutMapping("/updateOrder/{orderId}")
    public String updateOrder(@PathVariable int orderId, @RequestParam String address, String status) {
        orders.put(1, new Order(1, "Muscat - Al Khuwair", "Pending"));
        if (!orders.containsKey(orderId)) {
            return "Order not found";
        }

        Order order = orders.get(orderId);
        order.setShippingAddress(address);
        order.setOrderStatus(status);

        return "Order Updated Successfully:\n" +
                "Order ID: " + order.getOrderId() + "\n" +
                "Shipping Address: " + order.getShippingAddress() + "\n" +
                "Order Status: " + order.getOrderStatus();
    }


}



