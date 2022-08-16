
public class Main
{
	public static void main(String[] args)
	{
		
		Linklist l1 =new Linklist();
		l1.append(1);
		l1.insert(54);
		l1.insert(55);
		l1.append(2);
		l1.insert(56);
		l1.insert(57);
		l1.append(12);
		l1.append(13);
//		l1.deleteLast();
		System.out.println(l1);
//		l1.deleteFirst();
//		l1.deleteLast();
//		l1.deleteLast();
//		l1.addByPos(100,15);
//		l1.deleteByPos(1);
		l1.deleteByPos(-1);
		System.out.println(l1);
	}

}
