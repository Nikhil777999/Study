
public class Student 
{
	private String name;
	private int age;
	private char gender;
	
	public Student()
	{
		this.name = null;
		this.age = 0;
		this.gender = ' ';
		
	}
	public Student(String n,int a,char g)
	{
		this.name = n.toUpperCase();
		this.age = a;
		this.gender = g;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String toString()
	{
		String str ="["+name+", "+age+", "+gender+"]";
		return str;
	}
}
