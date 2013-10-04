package com.practicaljava.lesson5;

public class Tax {
    
	double grossIncome;
	String state;
	int dependents;
	
    Tax(double grossIncome, String state, int dependents) {
		this.grossIncome = grossIncome;
		this.state = state;
		this.dependents = dependents;
    }
    
    public double calcTax() { 
    	
    	double stateTax=0;
    	
    	if (grossIncome < 30000) { 
    		stateTax=grossIncome*0.05;
    	}
    	else{
    		stateTax= grossIncome*0.06; 
    	}
    	return stateTax;
    }
    
    static String convertTaxIntoEuro(double tax) {
	    return "$" + tax + " (" + tax * 0.75 + " euros)";
	}
    
}