package Lab;

public class Lab2_StudentDB {

	public static void main(String[] args) {
	// create student
		Student stu1 = new Student("William", "112223333");
		Student stu2 = new Student("Allen", "789081235");
		Student stu3 = new Student("Jane", "987525489");
		
		stu1.enroll("Eng201");
		stu1.enroll("Comp404");
		stu1.enroll("Lit255");
		
		stu1.showCourses();
		stu1.checkBalance();
		stu1.payTuition(500);
		stu1.checkBalance();
		System.out.pringln(stui.toString());
	}

}

class Student{
	// properties
		private static int iD =0;
		private String userId;
		private String name;
		private String ssn; 
		private String email;
		private String phone;
		private String city;
		private String state;
		private String courses = "";
		private static final int costOfCourse = 850;
		private int balance = 0;
			
			
	public Student(String name, String ssn){
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
	}
	
	private void setEmail(){
		email = name.toLowerCase() + "." iD + "@sdatuniversity.com";
		System.out.println("Your email is: " + email);
		
	}
	public String getEmail(){
		return email;
	}
	
	private void setUserId(){
		int max = 9000;
		int min = 1000; 
		int randNum = (int) (Math.random() * ((max - min)));	
		randNum = randNum + min;
		userID = iD + "" + randNum + ssn.substring(6);
		System.out.println("Your User ID is: " + userId);
	}
	
	public void enroll(String course){
		this.courses = this.courses + "/n" + course;
		balance = balance + costOfCourse;
		
		
	}
	
	public void payTutition(int amount){
		balance = balance - amount;
		System.out,println("Payment: $" + amnount);
		
	}
	
	public void checkBalance (){
		System.out.println("Balance: $" + balance);
	
	}
	
	public void showCourses(){
		System.out.println(courses);
	}
	
	public String toString(){
		return "[NAME: + name + ]"/n [COURSES: + courses + "]/n [BALANCE: " + balance + "]";
	}
}

