
public class Main {
// testuser

	public static void main(String[] args) {
		Address[] address = new Address[30];
		Student[] student = new Student[30];
		Course[] course = new Course[30];
		Professor[] professor = new Professor[30];
		address[1] = new Address("111 Huaykaew", "Muang", "Chiang Mai", "50300");
		address[2] = new Address("222 SuownDonk", "Muang", "Chiang Rai", "50300");
		address[3] = new Address("333 SuownDonk", "Muang", "Chiang Rai", "50300");
		professor[1] = new Professor("John", "Doe");
		professor[1].setAddress(address[1]);
		professor[1].setDateOfBirth("15-10-2533");
		student[1] = new Student("Non", "Ny");
		student[2] = new Student("Tawee", "Sopapan");
		student[1].setAddress(address[2]);
		student[1].setDateOfBirth("11-10-2541");
		student[2].setAddress(address[3]);
		student[2].setDateOfBirth("29-12-2541");
		professor[1].setSalary(100000);
		professor[1].printInfo();
		// address[1].printAddress();
		course[1] = new Course("ENGCE101", "JAVA", 10, 15, "TC101");
		course[2] = new Course("ENGCE102", "SWdev", 10, 15, "TC102");
		professor[1].createCourse(course[1]);
		professor[1].createCourse(course[2]);
		student[1].registerCourse(course[1]);
		student[2].registerCourse(course[2]);
		for (int i = 1; i <= 2; i++) {
			student[i].setGPA(i + 2.00);
			student[i].printInfo();
			student[i].listCourses();
			// address[i+1].printAddress();
		}
	}
}