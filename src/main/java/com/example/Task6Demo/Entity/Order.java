package com.example.Task6Demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private int orderId;
    private String shippingAddress;
    private String orderStatus;


}
