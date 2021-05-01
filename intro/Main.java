package intro;

public class Main {

	public static void main(String[] args) {
		
		Course course1=new Course(1,"Yaz�l�m Geli�tirici Kamp� ","Engin Demiro�");
		Course course2=new Course(2,"Java-React Kamp ","Engin Demiro�");
		Course[] courses= {course1,course2};
		for (Course course : courses) {
			System.out.println("Kurs ismi: "+course.name+"E�itmen: "+course.educator);
		}
		
		Category category1=new Category(1,"Programlama");
		Category category2=new Category(2,"Donan�m");
		Category[] categories= {category1,category2};
		for(Category category: categories) {
			System.out.println(category.name);
		}
		
		CourseManager courseManager=new CourseManager();
		courseManager.register(course1);
		courseManager.begin(course2);
		
		

	}

}
