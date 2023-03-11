package lambdaexpresstion;

@FunctionalInterface
interface Person{
	String display(int age); //Age: 22
}

public class Test {
	public static void main(String[] args) {
	
		Person p=(age) -> {
			return "Age is "+age;
			
		};
		System.out.println(p.display(22));
	}

}
