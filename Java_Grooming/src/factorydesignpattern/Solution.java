package factorydesignpattern;

class Food{

}

class Biryani extends Food{

}

class CurdRice extends Food{

}

class FriedRice extends Food{

}

class Hotel{


	Food orderFood(int choice){
		if(choice == 1) {
			Biryani b = new Biryani();
			return b;  //return new Biryani;
		}

		else if(choice == 2){
			CurdRice c = new CurdRice();
			return c; //new CurdRice();
		}
		else if(choice == 3) {
			FriedRice f = new FriedRice();
			return f;  //new FriedRice();
		}
		else {
			return null;
		}
	}
}	

public class Solution {
	public static void main(String[] args) {
		
		Hotel hotel = new Hotel();
		
		//         Generalization or upcasting
		//Food obj = hotel.orderFood(1); -> Food obj = new Biryani();
		//Food obj = hotel.orderFood(1); -> Food obj = new CurdRice();
		//Food obj = hotel.orderFood(1); -> Food obj = new FriedRice();
		//Food obj = hotel.orderFood(1); -> Food obj = null;
		
		Food obj = hotel.orderFood(10);
		
		if(obj instanceof Biryani) {
			System.out.println("Eating Biryani");
		}
		else if(obj instanceof CurdRice) {
			System.out.println("Eating CurdRice");
		}
		else if(obj instanceof FriedRice) {
			System.out.println("Eating FriedRice");
		}
		else {
			System.out.println("Invalid Choice");
		}
	

	}
}

//factory design is a returninng differnt type of object by having a generlize return type