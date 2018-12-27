package Lab;

public class Lab2_StudentDB {

	public static void main(String[] args) {
	// create student
		Student stu1 = new Student("William", "112223333");

	}

}

class Student{
	// properties
		private static int iD =1000;
		private String name;
		private String ssn; 
		private String email;
			
			
	public Student(String name, String ssn){
		iD++;
		this.name = name;
		this.ssn = ssn;
		setAccountId();
		setEmail();
	}
	
	private void setEmail(){
		email = name.toLowerCase() + "@sdatuniversity.com";
		System.out.println("Your email is: " + email);
		
	}
}

