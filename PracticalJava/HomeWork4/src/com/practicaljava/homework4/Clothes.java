package com.practicaljava.homework4;

public class Clothes extends Goods {
	
	public Clothes(String goodsTitle){
		super(goodsTitle);
	}	
		public boolean decreasePrice(int percent){
		if(percent < DECREASE_CAP){
		System.out.println("Decreasing price by " + percent + "$. " + getGoodsTitle());
		
			return true;
		} else{
			System.out.println("Sorry, can't decreasing price by more than " + DECREASE_CAP + "%. "+ getGoodsTitle());
			return false;
			}
		}
		
}
