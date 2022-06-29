package com.appsdeveloper.photoapp.orders.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsdeveloper.photoapp.orders.model.OrderRest;
import com.appsdeveloper.photoapp.orders.model.OrderStatus;

@RestController
public class OrdersController {
	
	@GetMapping("/orders")
	public List<OrderRest> getOrders(){
		
		OrderRest order1 = new OrderRest(UUID.randomUUID().toString(), 
				"product-id-1", "user-id-1", 1, OrderStatus.NEW);
		
		OrderRest order2 = new OrderRest(UUID.randomUUID().toString(), 
				"product-id-2", "user-id-2", 1, OrderStatus.NEW);
		
		return List.of(order1,order2);
	}

}
