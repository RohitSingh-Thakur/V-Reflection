package v;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException {
		
		// How to load a class
		// 1st way using Class.forName("v.Student");
		Class<?> studentInfo = Class.forName("v.Student");
		
		// getting all the constructors
		Constructor<?>[] constructors = studentInfo.getConstructors();
		System.out.println("All The Constructors");
		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor);
		}
		System.out.println("==============================================================================");
		
		// getting all the variables
		Field[] fields = studentInfo.getDeclaredFields();
		System.out.println("All The variables");
		for (Field field : fields) {
			System.out.println(field);
		}
		System.out.println("==============================================================================");
		
		// getting all the methods (private/public/protected/static/final/setters and getters/toString())
		Method[] methods = studentInfo.getDeclaredMethods();
		System.out.println("All The Methods");
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("==============================================================================");
		
		// getting only public methods as well as object class public methods
		Method[] methods2 = studentInfo.getMethods();
		System.out.println("All The Public Methods");
		for (Method method : methods2) {
			System.out.println(method);
		}
		System.out.println("==============================================================================");

		// 2nd way using Class<Student> student = Student.class;
		
		Class<Student> student = Student.class;
		
		// 3d way Class<? extends Student> class1 = student2.getClass();
		
		Student student2 = new Student();
		Class class1 = student2.getClass();
		
		
		
		
		
		
		
		// call any method using reflection 
		
		Class<?> studentObj = Class.forName("v.Student");
		Student students = (Student)studentObj.newInstance();
		
		//calling without parameterized method
		Method method = studentObj.getDeclaredMethod("student3");
		method.invoke(students);
			
		// calling parameterized method
		Class[] argss = new Class[] {String.class};
		Method method2 = studentObj.getDeclaredMethod("student4",argss);
		method2.invoke(students, "Rohit");
					
	}

}
