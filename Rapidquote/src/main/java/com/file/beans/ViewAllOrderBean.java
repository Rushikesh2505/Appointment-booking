package com.file.beans;

public class ViewAllOrderBean {

	private String orderId;

	private String userId;
	
	/** The sub total. */
	private String subTotal;
	
	/** The shipping cost. */
	private String shippingCost;
	
	/** The total weight. */
	private String totalWeight;

	private String totalCost;

	private String orderTime;

	private String orderDate;

	private String noOfItems;

	private String orderCode;

	private String firstName;

	private String lastName;

	private String contactEmail;

	private String contactNumber;

	private String address;
	
	private String orderStatus;
	

	private String orderStatusInt;
	
	/** The total cad file size. */
	private String totalFileSize;

	private String quotePdf;

	public String getQuotePdf() {
		return quotePdf;
	}

	public void setQuotePdf(String quotePdf) {
		this.quotePdf = quotePdf;
	}


	public String getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}

	public String getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(String shippingCost) {
		this.shippingCost = shippingCost;
	}

	public String getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(String totalWeight) {
		this.totalWeight = totalWeight;
	}

	public String getTotalFileSize() {
		return totalFileSize;
	}

	public void setTotalFileSize(String totalFileSize) {
		this.totalFileSize = totalFileSize;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderStatusInt() {
		return orderStatusInt;
	}

	public void setOrderStatusInt(String orderStatusInt) {
		this.orderStatusInt = orderStatusInt;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ViewAllOrderBean [orderId=" + orderId + ", userId=" + userId + ", subTotal=" + subTotal + ", totalCost="
				+ totalCost + ", shippingCost=" + shippingCost + ", totalWeight=" + totalWeight + ", orderTime="
				+ orderTime + ", orderDate=" + orderDate + ", noOfItems=" + noOfItems + ", orderCode=" + orderCode
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", contactEmail=" + contactEmail
				+ ", contactNumber=" + contactNumber + ", address=" + address + ", orderStatus=" + orderStatus
				+ ", orderStatusInt=" + orderStatusInt + "]";
	}

	

}
