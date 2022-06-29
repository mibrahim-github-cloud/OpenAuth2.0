package com.appsdeveloper.photoapp.orders.model;


public class OrderRest {

	private String orderId;
	private String productId;
	private String userId;
	private int quantity;
	private OrderStatus orderStatus;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public OrderRest(String orderId, String productId, String userId, int quantity, OrderStatus orderStatus) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.userId = userId;
		this.quantity = quantity;
		this.orderStatus = orderStatus;
	}
	
	@Override
	public String toString() {
		return "OrderRest [orderId=" + orderId + ", productId=" + productId + ", userId=" + userId + ", quantity="
				+ quantity + ", orderStatus=" + orderStatus + "]";
	}
	
	
}
