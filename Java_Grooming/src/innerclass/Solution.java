package innerclass;



abstract class Person{
	abstract void eat();
}

class Tom extends Person{
	@Override
	void eat() {
		System.out.println("Tom is Eating");
	}
}

public class Solution {
	public static void main(String[] args) {
		//By having explicit subclass

		Tom tom = new Tom();
		tom.eat();

		System.out.println("----------------------");

		//Anonymous Inner Class
		Person p = new Person() {

			@Override
			void eat() {
				System.out.println("Eating");

			}
		};
		p.eat();
	}

}