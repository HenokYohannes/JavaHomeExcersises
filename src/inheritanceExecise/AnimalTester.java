package inheritanceExecise;

public class AnimalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Dog dog=new Dog ();
	
	dog.name="Tarzan";
	dog.color="Black";
	dog.breed="BullDog";
	dog.age=2;
	
	dog.eat();
	dog.bark();
	dog.sleep();
	
	System.out.println(dog.name);
	System.out.println(dog.breed);
	System.out.println(dog.color);
	
	Cat cat=new Cat();
	
	cat.name="Ramina";
	cat.breed="DimuBatsie";
	cat.color="Orang";
	cat.age=1;
	cat.meow();
	cat.eat();
	cat.sleep();
	
	System.out.println(cat.name);
	System.out.println(cat.breed);
	System.out.println(cat.color);
	
	
	}

}
