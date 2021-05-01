
public class Student extends User {
	
	String courses;
	
	
	
	public Student(int id,String firstName,String lastName,String email,String courses) {
		
		super(id,firstName,lastName,email);
		this.courses=courses;
	}
	
	public String getCourses() {
		return courses;
	}

}
