package v;

public class Student {

	private int id;
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void student1() {
		
	}
	
	private void student2() {
		
	}
	
	protected void student3() {
		System.out.println("student3 method called..");
	}
	
	public static void student4(String msg) {
	System.out.println("your message: " + msg);	
	}
	
	public final void student5() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}	
}
