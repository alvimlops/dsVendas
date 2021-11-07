package com.alvimlops.dsvendas.dto;

import com.alvimlops.dsvendas.entities.Saller;

public class SalesSumDTO {

	private String sellerName;
	private Double sum;


	public SalesSumDTO() {
	}


	public SalesSumDTO(Saller seller, Double sum) {
		
		this.sellerName = seller.getName();
		this.sum = sum;
	}


	public String getSellerName() {
		return sellerName;
	}


	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}


	public Double getSum() {
		return sum;
	}


	public void setSum(Double sum) {
		this.sum = sum;
	}
	













}



