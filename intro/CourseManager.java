package intro;

public class CourseManager {
	
	public void register(Course course) {
		System.out.println(course.name+" kayıt olundu");
	}
	public void begin(Course course) {
		System.out.println("Kursun eğitmeni "+course.educator);
	}
}
