
public class Course {
	String courseName;
	String courseCode;
	int numStudents;
	int timeSlot;
	String room;

	public Course(String courseCode, String courseName, int numStudents, int timeSlot, String room) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.numStudents = numStudents;
		this.timeSlot = timeSlot;
		this.room = room;
	}

}
