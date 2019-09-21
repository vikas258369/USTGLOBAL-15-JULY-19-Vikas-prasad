package com.ust.Management.HotelManagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Hotel_bill")
class HotelBilling{
	@Id
	@Column(name="item_code")
	private int itemCode ;
	@Column(name="Food_name")
	private String foodName;
	@Column(name="price")
	private double price;
	
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "HotelBilling [itemCode=" + itemCode + ", foodName=" + foodName + ", price=" + price + "]";
	}
	
	
	
}