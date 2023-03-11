package lambdaexpresstion;

@FunctionalInterface
interface Amazon{
	void purchase(String product);
}

class Customer implements Amazon{
	
	public void purchase(String product) {
		System.out.println("Purchasing "+product);
	}
}


public class Runner {

	public static void main(String[] args) {
		
		//sub class or implementation class
		Customer c = new Customer();
		c.purchase("Laptop");
		
		System.out.println("--------------------");
		
		//Anonymous inner class with reference variable
		Amazon a1= new Amazon() {
			
			@Override
			public void purchase(String product) {
				System.out.println("Purchasing "+product);
				
			}
		};
		a1.purchase("Mobile");
		
		System.out.println("--------------------------");
	
		//Anonymous inner class with reference variable
		new Amazon() {
			
			@Override
			public void purchase(String product) {
				System.out.println("Purchasing"+product);
				
			}
		}.purchase("Ear Phone");
		
		System.out.println("----------------------");
		
		Amazon a2=(product) ->{
			System.out.println("Purchasing "+product);
		};
		a2.purchase("Watch");
		
		System.out.println("---------------------------");
		
		Amazon a3= (product) -> System.out.println("Purchasing "+product);
		a3.purchase("Shoes");
		
	}
	
}
