import java .util.*;

public class dif
{
	void func()
	{
		Set st = new HashSet();
		
		st.add("coke ");
		st.add("momes ");
		st.add("chicken");
		st.add(100 );
		st.add(6.7);
		
		if(st.isEmpty())
		{
			System.out.println("blank");
		}
		else 
		{

		System.out.println(st);
		System.out.println("no.of items :"+st.size());
		}
	
	}
	public static void main(String args[])
	{
		dif obj =new dif();
		obj.func();
	}
}
