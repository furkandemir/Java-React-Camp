
public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor(1,"Engin","Demiro�","engin@gmail.com","Yaz�l�mG eli�tirme Kamp� c#");
		Student student=new Student(2,"Furkan","Demir","furkan@gmail.com","Java React Camp");
		
		
		
		UserManager userManagers1=new UserManager();
		UserManager userManagers2=new UserManager();
		
		userManagers1.add(student);
		userManagers2.add(instructor);
		
		
		
		

	}

}
