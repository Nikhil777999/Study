import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int size=0;
		System.out.println("Enter no. of Emplployee :");
		size=sc.nextInt();
		 int empid;
		 String name;
		 int dd,mm,yy;
		Employee []emp =new Employee[size];
		
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Enter Emplployeeid :");
			empid=sc.nextInt();
			System.out.println("Enter Emplployee name :");
			name=sc.next();
			System.out.println("Enter Emplployee Date of joining(dd mm yy) :");
			dd=sc.nextInt();mm=sc.nextInt();yy=sc.nextInt();
			
			emp[i]=new Employee(empid,name,new Date(dd,mm,yy));
		}
		sc.close();
		
		//Employee.sortempid(emp);
		sortempid(emp);
		for(int i=0;i<emp.length;i++)
		System.out.println(emp[i]);
	}

	
	
	
	 public static void sortempid(Employee []emp1) 
	{
		for(int i=0;i<emp1.length;i++)
		{
			for(int j=i+1;j<emp1.length;j++)
			{
				if(emp1[i].getEmployeeNo() > emp1[j].getEmployeeNo())
				{
					Employee temp;
					temp=emp1[i];
					emp1[i]=emp1[j];
					emp1[j]=temp;
				}
			}
		}
		
	}

}
