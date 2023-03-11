package innerclass;

interface Calculator{
	void add(int a, int b);
	int mul(int a, int b);
}

public class MainClass {
	public static void main(String[] args) {
		
		//Anonymous Inner Class
		Calculator calc=new Calculator() {
			
			@Override
			public void add(int a, int b) {
				System.out.println("Sum:"+(a+b));
				
			}
			
			@Override
			public int mul(int a, int b) {
				
				return a*b;
			}
			
		
		};
		calc.add(10, 20);
		System.out.println("Product: "+calc.mul(5, 8));
				
		
	}

}
