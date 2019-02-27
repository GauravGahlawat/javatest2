package ThreadDemo1;

import java.util.*;
import java.util.ArrayList;

	class book1
	{
		int bcode;
		String bname;
		Integer price;
		
		public book1(int bcode, String bname,  Integer price)
		{
			this.bcode = bcode;
			this.bname = bname;
			this.price = price;
		}
	}


	class Sortbybname implements Comparator<book1>
		{

	

	public int compare(book1 A, book1 B) {
		
		return A.bname.compareTo(B.bname);
	}

		}
	class Sortbyprice implements Comparator<book1>
	{
		public int compare(book1 a, book1 b)
		{
			return a.price.compareTo(b.price);
		}
	}

	
	public class ArraySort {
		
		public static void main(String[] args) {
				
				ArrayList<book1> s = new ArrayList<book1>();
				book1 s1 = new book1(11,"home science",5000);
				book1 s2 = new book1(12,"gk",4000);
				book1 s3 = new book1(13,"punjabi",3000);
			    book1 s4 = new book1(14,"English",2000);
				book1 s5 = new book1(15,"Accounts",1000);
				book1 s6 = new book1(16,"Hindi",6000);
				book1 s7 = new book1(17,"Hindi",7000);
				book1 s8 = new book1(18,"science",8000);
				book1 s9 = new book1(19,"sst",460);
				book1 s10 = new book1(20,"maths",2800);	
				s.add(s1);
				s.add(s2);
				s.add(s3);
				s.add(s4);
				s.add(s5);
				s.add(s6);
				s.add(s7);
				s.add(s8);
				s.add(s9);
				s.add(s10);
				Collections.sort(s,new Sortbybname());
				
				for(book1 b:s)
				{
					System.out.println(b.bcode+" "+b.bname+" "+b.price);
				}
				
				System.out.println("**************************************");
				
				Collections.sort(s, Collections.reverseOrder(new Sortbyprice()));
				
				for(book1 b:s)
				{
					System.out.println(b.bcode+" "+b.bname+" " +b.price);
				}
			}
	}