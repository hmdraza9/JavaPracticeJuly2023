package TestJava.MyPract;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionField {
	public static void main(String[] args) {
		try {
			Student student = new Student();
			Class obj = student.getClass();
			Field student_field = obj.getField("StudentName");
			System.out.println("Details of StudentName class field:");
			student_field.set(student, "Lacey");
			int mod1 = student_field.getModifiers();
			String modifier1 = Modifier.toString(mod1);
			System.out.println("StudentName Modifier::" + modifier1);
			String typeValue = (String) student_field.get(student);
			System.out.println("StudentName Value::" + typeValue);
			
			Animal animl = new Animal();
			obj = animl.getClass();
			Field fiels_animalType = obj.getField("typeOf");
			System.out.println("Details of typeOf class field:");
			fiels_animalType.set(animl, "Land Animals");
			int modI = fiels_animalType.getModifiers();
			String modifier2 = Modifier.toString(modI);
			System.out.println("StudentName Modifier::" + modifier2);
			typeValue = (String)fiels_animalType.get(animl);
			System.out.println("typeOf Value::" + typeValue);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Animal implements testInt{
	
	String typeOf;

	@Override
	public void play() {
		System.out.println("I am playing");
		
	}
	
}
interface testInt{
	
	public void play();
}