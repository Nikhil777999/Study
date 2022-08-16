package Linkedlist;

public class SLL_Palindrome 
{
	public static boolean isPalindrome(Linklist list)
	{
		Node slowP=null,fastP=null,sec_start,prev_slowP=null;
		boolean result;
		
		if((list.head == null) || (list.head.next ==null))
			result = true;
		else
			prev_slowP=slowP=fastP=list.head;
		
		while((fastP.next != null) && (fastP.next.next != null))
			{
				prev_slowP=slowP;
				slowP=slowP.next;
				fastP=fastP.next.next;
			}
		System.out.println("Middle node = "+slowP.data);
		sec_start=slowP.next;
		
		if(fastP.next == null)	//odd number f node in list
		{                    
			sec_start=reverse(sec_start);
			prev_slowP.next=null;
			result=isIdentical(list.head,sec_start);
			sec_start=reverse(sec_start);
			prev_slowP.next=sec_start;
		}
		else			//even number f node in list
		{
			sec_start=reverse(sec_start);
			slowP.next=null;
			result=isIdentical(list.head,sec_start);
			sec_start=reverse(sec_start);
			slowP.next=sec_start;
		}
		return result;
	}
	private static Node reverse(Node sec_start) 
	{
		
		return null;
	}
	public static boolean isIdentical(Node s1,Node s2)
	{
		while(true)
		{
			if(s1==null && s2==null)
				return true;
			if(s1==null || s2==null)
				return false;
			if(s1.data != s2.data)
				return false;
			
			s1=s1.next;
			s1=s2.next;
		}
	}
}//end of class
