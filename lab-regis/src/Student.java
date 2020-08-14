
public class Student extends Person {
	double gpa;
	int numCourses;
	Course[] courses;

	public Student(String firstName, String lastName) {
		super(firstName, lastName);
		courses = new Course[30];
		numCourses = 0;
	}

	void printInfo() {
		super.printInfo();
		System.out.println("Age : " + super.getAge());
		System.out.println("Role : Student");
		System.out.println("Address: " + address.streetAddress);
		System.out.println(address.district + " " + address.city);
		System.out.println(address.zipCode);
		System.out.println("GPA : " + gpa);
	}

	void setGPA(double gpa) {
		this.gpa = gpa;
	}

	void registerCourse(Course course) {
		courses[numCourses] = course;
		numCourses++;
	}

	void listCourses() {
		System.out.println("Course List :");
		for (Course c : courses) {
			if (c != null)
				System.out.println("- " + c.courseName);
		}
	}
}
