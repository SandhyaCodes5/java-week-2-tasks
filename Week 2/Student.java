package myPackage;
class Student{
	String name;
	int age;
	String course;
	Student(String name, int age, String course){
		this.name = name;
		this.age = age;
		this.course = course;
	}
	public void studentDetails() {
		System.out.println("Student details are:");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Course: " + course );
	}
}

public class Main {

	public static void main(String[] args) {
        Student s = new Student("Sandhya",20,"B.Tech");
        s.studentDetails();
	}
}
