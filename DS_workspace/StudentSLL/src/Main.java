
public class Main 
{
	public static void main(String[] args) 
	{
		Student s1= new Student("nikhil",23,'M');
		Student s2= new Student("shruti",15,'F');
	 Linklist list = new Linklist();
	 list.insert(s1);
	 list.addByPos(s2,1);
	 list.append(new Student("fdjsfgg",54,'M'));
	 list.append(new Student("gfftyf",23,'M'));
	 System.out.println(list);
//	 System.out.println(s1);
//	 System.out.println(s2);
	 list.deleteFirst();
	 list.deleteLast();
	 System.out.println(list);
	 

	}

}
