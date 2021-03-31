package com.file.beans;

public class ViewOrderBean { 
	
	private String orderId;
	
	private String orderCode;

	private String userId;

	private String totalCost;
	
	private String orderTime;
	
	private String orderDate;
	
	private String noOfItems;
	
	private String orderStatus;
	
	private String shippingCost;
	
	private String quotePdf;

	
	public String getQuotePdf() {
		return quotePdf;
	}

	public void setQuotePdf(String quotePdf) {
		this.quotePdf = quotePdf;
	}

	/** The total cad file size. */
	private String totalCadFileSize;
	
	
	public String getTotalfileSize() {
		return totalfileSize;
	}

	public void setTotalfileSize(String totalfileSize) {
		this.totalfileSize = totalfileSize;
	}

	private String totalfileSize;
	
	
	public String getTotalCadFileSize() {
		return totalCadFileSize;
	}

	public void setTotalCadFileSize(String totalCadFileSize) {
		this.totalCadFileSize = totalCadFileSize;
	}

	public String getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}

	public String getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(String totalWeight) {
		this.totalWeight = totalWeight;
	}

	public String getShippingCost() {
		return shippingCost;
	}

	/** The subtotal. */
	private String subtotal;
	
	/** The total weight. */
	private String totalWeight;

	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(String noOfItems) {
		this.noOfItems = noOfItems;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	
	@Override
	public String toString() {
		return "ViewOrderBean [orderId=" + orderId + ", orderCode=" + orderCode + ", userId=" + userId + ", totalCost="
				+ totalCost + ", orderTime=" + orderTime + ", orderDate=" + orderDate + ", noOfItems=" + noOfItems
				+ ", orderStatus=" + orderStatus + "]";
	}

	/**
	 * Sets the shipping cost.
	 *
	 * @param shippingCost the new shipping cost
	 */
	public void setShippingCost(String shippingCost) {
		this.shippingCost = shippingCost;
	}

	

}
