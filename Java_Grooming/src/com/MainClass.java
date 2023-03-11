package com;



class Beverage{
	
}
class Tea extends Beverage{
	
}
class Coffee extends Beverage {
	
}

class Company{
	
	Beverage orderBeverage(int choice) {
		if(choice == 1) {
			Tea t =new Tea();
			return t;
		}
		else if(choice == 2){
			Coffee c = new Coffee();
			return c; //new Coffee();
		
	}
		else {
			return null;
		}
}
}

public class MainClass {
	
	public static void main(String[] args) {
		
		Company company=new Company();
		
		
		Beverage obj= company.orderBeverage(1);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
