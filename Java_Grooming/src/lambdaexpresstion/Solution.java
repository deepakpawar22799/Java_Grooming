package lambdaexpresstion;

@FunctionalInterface
interface  Employee{
	void work();
}
public class Solution{
	public static void main(String[] args) {
		
		Employee emp = () ->{
			System.out.println("Working");
		};
		
		emp.work();
		}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

