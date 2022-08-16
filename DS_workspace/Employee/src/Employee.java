public class Employee 
{
	private int empno;
	private String name;
	private Date doj;
	
	public Employee() { }
	public Employee(int emp,String name1,Date d) 
	{
		this.empno=emp;
		this.name=name1;
		this.doj=d;
	}
	
	public int getEmployeeNo()
	{
		return this.empno;
	}
	public void setEmployeeNo(int emp1)
	{
		this.empno=emp1;
	}
	public String getEmployeeName()
	{
		return this.name;
	}
	public void setEmployeeName(String name1)
	{
		this.name=name1;
	}
	public Date getEmployeeDate()
	{
		return this.doj;
	}
	public void setEmployeeDate(Date doj)
	{
		this.doj=doj;
	}
	public String toString()
	{
		return "[Emp no. :"+this.empno+"name : "+this.name+"Date :"+this.doj+"]";
	}
	
}
