package TestJava.MyPract;

/**
 * Hello world!
 *
 */
public class ReflectionSupClass {
	public static void main(String[] args) {
		Student s1 = new Student();
		Class obj = s1.getClass();
		Class superClass = obj.getSuperclass();
		System.out.println("Super class: "+superClass.getName());
	}
}

interface Person {

	public void display();

}

class Student implements Person {

	public String StudentName;
	
	@Override
	public void display() {
		System.out.println("I am a Student");
	}
}