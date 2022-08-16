
public class Main_Stack {

	public static void main(String[] args) {
		
		Stack s1 =new Stack();
		Student e1 =new Student();
		Student e2 =new Student("nikhil   ",23,'M');
		Student e3 =new Student("nikhil   ",35,'M');
		Student e4 =new Student("jwegfwrh ",37,'M');
		Student e5 =new Student("lokyjhi  ",38,'f');
		
		s1.push(e1);
		s1.push(e2);
		s1.push(e3);
		s1.push(e4);
		s1.push(e5);
//		s1.pop();
//		s1.pop();
//		s1.pop();
//		s1.push(10);
		System.out.println(s1);
//		s1.pop();
//		s1.pop();
		Student v=s1.pop();
//		System.out.println(s1);
		System.out.println("["+v+"]");

	}

}
