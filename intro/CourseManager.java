package intro;

public class CourseManager {
	
	public void register(Course course) {
		System.out.println(course.name+" kay�t olundu");
	}
	public void begin(Course course) {
		System.out.println("Kursun e�itmeni "+course.educator);
	}
}
