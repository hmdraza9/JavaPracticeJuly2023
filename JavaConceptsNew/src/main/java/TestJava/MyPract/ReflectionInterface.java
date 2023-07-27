package TestJava.MyPract;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionInterface  {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Class obj = dog.getClass();
		Class[] objInterface = obj.getInterfaces();
		System.out.println("Dog class implements below interfaces");
		
		for(Class citm : objInterface) {
			System.out.println("Interface name: "+citm.getName());
		}

		Method[] objMethods = obj.getMethods();
//		System.out.println("Dog class have below methods");
		
		for(Method mitm : objMethods) {
//			System.out.println("Method name: "+mitm.getName());
		}

		Field petNameField = obj.getField("petName");
		petNameField.set(dog, "Tuffy");

	}

}

interface Animals{
	public void display();
}

interface PetAnimals{
	public void makeSound();
}

class Dog implements Animals, PetAnimals{

	String petName;
	String name="Scooby";
	String food="Pedigree";
	float age=3.4f;
	boolean isAllergic = false;

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Dog make sound : Bark Bark");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is PetAnimals Dog");
		
	}
}
