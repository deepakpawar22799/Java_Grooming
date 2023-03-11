package factorydesignpattern;
class person{
	
}

class Employee extends person{
	int id =100;
	void work() {
		System.out.println("Working");
	}
}

class Student extends person{
	int age= 22;
	void study() {
		System.out.println("Studying");
		
	}
}
public class Runner {
	
	// Generalization
	// 1.Person obj = new Employee();
	// 2.Person obj = new Student();
	
	static void display (person obj) {
		if(obj instanceof Employee ) {
			Employee e =(Employee) obj;
			System.out.println(e.id);
			e.work();
		}
		else if(obj instanceof Student ) {
			Student s =(Student) obj;
			System.out.println(s .age);
			s.study();
		}
		
	}
	public static void main(String[] args) {
		
display(new Employee());
	display(new Student());	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
