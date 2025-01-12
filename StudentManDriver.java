import java.util.*;
class Student
{
	int id;
	String name;
	long cont;
	String add;
	Education edu;
	Mock mock;

	Student(int id, String name, long cont, String add, Education edu, Mock mock)
	{
		this.id = id;
		this.name = name;
		this.cont = cont;
		this.add = add;
		this.edu = edu;
		this.mock = mock;
	}
	public void displayStudent()
	{
		System.out.println("Id: "+ id +", Name: "+ name+", Contact: "+ cont+", Address: "+ add);
		edu.displayEducation();
		mock.displayMock();
	}
}

class Education
{
	String higherEdu;
	String stream;
	int yop;
	double cgpa;

	Education(String higherEdu, String stream, int yop, double cgpa)
	{
		this.higherEdu = higherEdu;
		this.stream = stream;
		this.yop = yop;
		this.cgpa = cgpa;
	}
	public void displayEducation()
	{
		System.out.println("Higher Education: "+ higherEdu + ", Stream: "+ stream + ", Yop: "+ yop +", CGPA: "+ cgpa);
	}
}

class Mock
{
	String subject;
	String comm;
	String tech;

	Mock(String subject, String comm, String tech)
	{
		this.subject = subject;
		this.comm = comm;
		this.tech = tech;
	}
	public void displayMock()
	{
		System.out.println("Subject: "+ subject + ", Comm: "+ comm+ ", Tech: "+ tech);
	}
}

class StudentManDriver
{
	static ArrayList<Student> listStudent = new ArrayList<>();
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for (; ; ) 
		{
			System.out.println("Welcome to Student Management System");
			System.out.println();
			System.out.println("1. Add Student");
			System.out.println("2. View Students");
			System.out.println("3. Remove Students");
			System.out.println("4. Logout");
			System.out.print("Enter an option: ");
			int opt = sc.nextInt();
			switch(opt)
			{
			case 1: addStudent(); break;
			case 2: viewStudent(); break;
			case 3: removeStudent(); break;
			case 4: System.exit(0);
			default: System.out.println("Wrong option Entered !!!");
			}
		}	
	}
	public static void viewStudent()
	{
		System.out.println("All Student Details");
		System.out.println();
		for(Student obj : listStudent)
		{
			obj.displayStudent();
			System.out.println();
		}
	}
	public static void removeStudent()
	{
		System.out.println("Will important in future ");
	}
	public static void addStudent()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Student Personal details");
		System.out.print("Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Contact: ");
		long cont = sc.nextLong();
		sc.nextLine();
		System.out.print("Address: ");
		String add = sc.nextLine();
		
		System.out.println();
		System.out.println("Education Details");
		System.out.print("Higher Education: ");
		String higherEdu = sc.next();
		System.out.print("Stream: ");
		sc.nextLine();
		String stream = sc.nextLine();
		System.out.print("YOP: ");
		int yop = sc.nextInt();
		System.out.print("CGPA: ");
		double cgpa = sc.nextDouble();
		Education edu = new Education(higherEdu,stream,yop,cgpa);

		System.out.println();
		System.out.println("Mock Details");
		System.out.print("Subject: ");
		sc.nextLine();
		String subject = sc.nextLine();
		System.out.print("Communication: ");
		String comm = sc.next();
		System.out.print("Technical: ");
		String tech = sc.next();
		Mock mock = new Mock(subject,comm,tech);

		Student obj = new Student(id,name,cont,add,edu,mock);
		listStudent.add(obj);
	}
}