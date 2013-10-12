package com.practicaljava.homework4;

public class Shoes extends Goods {
	public Shoes(String goodsTitle){
		super(goodsTitle);
	}
	
	public boolean decreasePrice(int percent){
		System.out.println("Decreasing price by " + percent + "$. " + getGoodsTitle());
		
			return true;
	}

}
