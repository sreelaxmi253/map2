
package map1;
import java.util.*;
import java.util.HashMap;

public class Search{
		 
		public static void main(String[] args) {
			HashMap<Integer,A> hmap= new HashMap<Integer,A>();
		    A a1=new A("Ragava","one","python","hyderabad","orange");
			A a2=new A("Ravi","Nine","java","Mumbai","Blue");
			A a3=new A("Sandy","Five","Android","Pune","Green");
			hmap.put(1, a1);
			hmap.put(2, a2);
			hmap.put(3, a3);
			Iterator trav=hmap.entrySet().iterator();
			while(trav.hasNext())
			{
				 HashMap.Entry record=(HashMap.Entry)trav.next();
				 A j=(A)record.getValue();
				 System.out.println(record.getKey()+" is key of value "+j.c);
				 
			} 
			
		}
	}
		

		
	class A{
		String a,b,c,d,e;
		A(String s1,String s2,String s3,String s4,String s5)
		{
			a=s1;
			b=s2;
			c=s3;
			d=s4;
			e=s5;
			
		}
	}
