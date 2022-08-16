package SLL;

public class Main 
{
	public static void main(String[] args) 
	{
		Linklist list=new Linklist();
		list.insert(45);
		list.insert(50);
		list.insert(4);
		System.out.println(list);
		list.append(66);
		list.append(23);
		System.out.println(list);
		list.addByPos(70,5);
		System.out.println(list);
		list.addByPos(100,4);
		System.out.println(list);
		list.deleteByPos(4);
		list.deleteByPos(4);
		System.out.println(list);
		int n =list.listlength();
		System.out.println(n);
	}

}
