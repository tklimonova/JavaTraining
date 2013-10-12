package com.practicaljava.test;
import com.practicaljava.homework4.Clothes;
import com.practicaljava.homework4.Goods;
import com.practicaljava.homework4.Shoes;

public class TestPriceDecrease {
	
	public static void main(String[] args){
		Goods items[] = new Goods[3];
		
		items[0] = new Shoes("Sandals");
		items[1] = new Clothes("Dress");
		items[2] = new Shoes("Boots");
		
		for (Goods g: items){
				g.sale(30);
		}
		
	}

}
