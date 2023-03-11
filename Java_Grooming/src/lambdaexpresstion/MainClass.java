package lambdaexpresstion;

interface Student{
	void study(String name, String subject);
}


public class MainClass {

	public static void main(String[] args) {
		Student s = (name,subject) ->{
			System.out.println(name+" is studying"+subject);
		};
s.study("jack", "java");
s.study("Tom","sql");
	}

}
