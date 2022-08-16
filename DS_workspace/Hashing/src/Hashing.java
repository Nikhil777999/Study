public class Hashing 
{
	String [] stringArray;
	
	public Hashing(int size)
	{
		stringArray = new String[size];
	}
	
	public int hashFunction(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			 sum=sum+str.charAt(i);
		}
		int index= sum % stringArray.length;
		return index;
	}
	
	public void insertL(String str )
	{
		int index=hashFunction(str);
		System.out.println("["+str+"] key form hashfunction = "+index);
		if(stringArray[index]==null)
		{
			stringArray[index]=str;
		}
		else
		{ 	while(true)
			{
				if(index < stringArray.length-1)
					index++;
				else
					index=0;
				if(stringArray[index]==null)
				{
					stringArray[index]=str;
					break;
				}
			}
		}
			System.out.println("and it is placed at "+index);	
	}
	
	public void insertQ(String str )
	{
		int index=hashFunction(str);
		System.out.println(str+"key form hashfunction Q ="+index);
		if(stringArray[index]==null)
		{
			stringArray[index]=str;
		}
		else
		{ int i=1;
			while(true)
			{	index=index+(i*i);
				if(index > stringArray.length-1)
					{	index=0;
						i=0;
					}

				if(stringArray[index]==null)
				{
					stringArray[index]=str;
					break;
				}i++;
			}
		}
			System.out.println("and it is placed at "+index);	
	}
	
	public void removeL(String str) {
		int index=searchL(str);
		stringArray[index]=null;
		System.out.println("and it is remove at "+index);	
	}
	public void removeQ(String str) {
		int index=searchQ(str);
		stringArray[index]=null;
		System.out.println("and it is remove at Q "+index);	
	}
	
	public int searchL(String str)
	{
		int index=hashFunction(str);
		System.out.println("["+str+"] key form hashfunction = "+index);
		
		if(stringArray[index]!=null && stringArray[index].equals(str))
		{
			return index;
		}
		else
		{
			while(true)
			{
				if(index < stringArray.length-1)
					index++;
				else
					index=0;
				if(stringArray[index]!=null && stringArray[index].equals(str))
				{
					return index;
				}
			}	 
		}
	}
	
	public int searchQ(String str)
	{
		int index=hashFunction(str);
		System.out.println("["+str+"] key form Q hashfunction = "+index);
		
		if(stringArray[index]!=null && stringArray[index].equals(str))
		{
			return index;
		}
		else
		{
			int i=1;
			while(true)
			{	index=index+(i*i);
				if(index > stringArray.length-1)
					{	index=0;
						i=0;
					}

				if(stringArray[index]!=null && stringArray[index].equals(str))
				{
					return index;
				}i++;
		}	 
		}
	}
}
