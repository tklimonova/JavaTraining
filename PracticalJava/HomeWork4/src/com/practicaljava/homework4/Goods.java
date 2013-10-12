package com.practicaljava.homework4;

abstract public class Goods {
	
		private String goodsTitle;
		private int quantityInStock;
		int DECREASE_CAP = 20;
	
	public Goods(String goodsTitle){
		this.goodsTitle = goodsTitle;
	}
	
	public String getGoodsTitle(){
		return "The title of good is " + goodsTitle;
	}
	
	public int quantityInStock(String goodsTitle){
		System.out.println("Avaliable amount of "+ goodsTitle +"is " + quantityInStock);
		return quantityInStock;
	}
	
	public boolean sizeAvailability(String goodsTitle){
		if (quantityInStock>0){
			System.out.println("Size is available");
			return true;
		}
		System.out.println("Out of stock");
		return false;
	}
	
	public void sale(int percent){
		System.out.println("Beginning a sale....");
		
		//call the abstract method 
		decreasePrice(percent); 
	} 
	
	public abstract boolean decreasePrice(int percent);
	

}
