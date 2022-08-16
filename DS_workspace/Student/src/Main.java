import java.util.Scanner;
public class Main {

	static Scanner sc;

	public static void main(String[] args) 
	{
		String name ="";
		int age =0;
		char gender ='M';
		
		sc = new Scanner(System.in);
		System.out.println("Enter name :");
		name = sc.next();
		System.out.println("Enter age :");
		age = sc.nextInt();
		System.out.println("Enter gender :");
		gender = sc.next().charAt(0);
		
		
		
		Student s1 = new Student(name,age,gender);
		//Student s2 = new Student("Nikhil",23,'M');
		//Student s3 = new Student();
		System.out.println(s1);
		//s1.print();
		//s2.print();
		//s3.print();
		sc.close();
	}

}
