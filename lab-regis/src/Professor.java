
public class Professor extends Person {
	int salary;
	Course[] courses;
	int numCourse;

	public Professor(String firstName, String lastName) {
		super(firstName, lastName);
		courses = new Course[30];
		numCourse = 0;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

	void createCourse(Course courses) {
		this.courses[numCourse] = courses;
		numCourse++;
	}

	void listCourses() {
		System.out.println("Course List :");
		for (Course c : courses) {
			if (c != null)
				System.out.println("- " + c.courseName);
		}
	}

	void printInfo() {
		super.printInfo();
		System.out.println("Age : " + super.getAge());
		System.out.println("Role : Student");
		System.out.println("Address: " + address.streetAddress);
		System.out.println(address.district + " " + address.city);
		System.out.println(address.zipCode);
		System.out.println("Salary : " + salary);
	}

}
