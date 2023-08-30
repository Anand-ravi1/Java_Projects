package javapro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class LBooksAvailabilityManagement extends LloginManagement{
	//collections
    public void booksavailability(String authorname1,String authorname2,String authorname3,String authorname4,String authorname5,String edition ) {
  	  System.out.println("*****Check books availability with names*****");  
  	  System.out.println("*****for chemistry :availablechemistrybooks, "
  	  		+ "for computerscience: availablecomputerbooks, "
  	  		+ "for physics: availablephysicsbooks, "
  	  		+ "for government: availablegovernmentexambooks,"
  	  		+ "for electronic: availableelectronicbooks,"
  	  		+ "for civil: availablecivilbooks,"
  	  		+ "for mechanical: availablemechanicalbooks*****");
  	  TreeSet<String> s = new TreeSet<String>(); //sorting
  	  s.add("chemistrybook    1:authorname:"+authorname1+"and edition"+edition);
  	  s.add("chemistrybook    2:authorname:"+authorname2+"and edition"+edition);
  	  s.add("chemistrybook    4:authorname:"+authorname4+"and edition"+edition);
  	  s.add("chemistrybook    3:authorname:"+authorname3+"and edition"+edition);
  	  s.add("chemistrybook    5:authorname:"+authorname5+"and edition"+edition);
  	  s.add("chemistrybook    5:authorname:"+authorname5+"and edition"+edition);//duplicate
  	  
  	  ArrayList<String> q = new ArrayList<String>();//no sorting
  	  q.add("computersciencebook    1:authorname:"+authorname1+"and edition"+edition);
  	  q.add("computersciencebook    2:authorname:"+authorname2+"and edition"+edition);
  	  q.add("computersciencebook    4:authorname:"+authorname4+"and edition"+edition);
  	  q.add("computersciencebook    5:authorname:"+authorname5+"and edition"+edition);
  	  q.add("computersciencebook    3:authorname:"+authorname3+"and edition"+edition);
  	  
  	  LinkedHashSet<String> w = new LinkedHashSet<String>();//it doesn't maintain insertion order//no dup
  	  w.add("physicsbook     2:authorname:"+authorname2+"and edition"+edition);
  	  w.add("physicsbook     3:authorname:"+authorname3+"and edition"+edition);
  	  w.add("physicsbook     1:authorname:"+authorname1+"and edition"+edition);
  	  w.add("physicsbook     4:authorname:"+authorname4+"and edition"+edition);
  	  w.add("physicsbook     5:authorname:"+authorname5+"and edition"+edition);
  	  w.add("physicsbook     5:authorname:"+authorname5+"and edition"+edition);//duplicate
  	  
  	  TreeSet<String> e = new TreeSet<String>();//insertion//nodup
  	  e.add("governmentexambook    2:authorname:"+authorname2+"and edition"+edition);
  	  e.add("governmentexambook    1:authorname:"+authorname1+"and edition"+edition);
  	  e.add("governmentexambook    3:authorname:"+authorname3+"and edition"+edition);
  	  e.add("governmentexambook    4:authorname:"+authorname4+"and edition"+edition);
  	  e.add("governmentexambook    5:authorname:"+authorname5+"and edition"+edition);
  	 
  	  ArrayList<String> r = new ArrayList<String>();//inse//dup
  	  r.add("electronicbook    2:authorname:"+authorname2+"and edition"+edition);
  	  r.add("electronicbook    1:authorname:"+authorname1+"and edition"+edition);
  	  r.add("electronicbook    3:authorname:"+authorname3+"and edition"+edition);
  	  r.add("electronicbook    4:authorname:"+authorname4+"and edition"+edition);
  	  r.add("electronicbook    5:authorname:"+authorname5+"and edition"+edition);
  	  
  	  TreeSet<String> c = new TreeSet<String>();//insertion//nodup
  	  c.add("civilbook    2:authorname:"+authorname2+"and edition"+edition);
  	  c.add("civilbook    1:authorname:"+authorname1+"and edition"+edition);
  	  c.add("civilbook    3:authorname:"+authorname3+"and edition"+edition);
  	  c.add("civilbook    4:authorname:"+authorname4+"and edition"+edition);
  	  c.add("civilbook    5:authorname:"+authorname5+"and edition"+edition);
  	 
  	  LinkedHashSet<String> p = new LinkedHashSet<String>();//it doesn't maintain insertion order//no dup
  	  p.add("mechanicalbook       2:authorname:"+authorname2+"and edition"+edition);
  	  p.add("mechanicalbook       3:authorname:"+authorname3+"and edition"+edition);
  	  p.add("mechanicalbook       1:authorname:"+authorname1+"and edition"+edition);
  	  p.add("mechanicalbook       4:authorname:"+authorname4+"and edition"+edition);
  	  p.add("mechanicalbook       5:authorname:"+authorname5+"and edition"+edition);
  	  p.add("mechanicalbook       5:authorname:"+authorname5+"and edition"+edition);//duplicate
  	  
  	 

  	  Scanner dd = new Scanner(System.in);
  	  String bc = dd.nextLine();
  	  switch(bc) {
  	  case "availablechemistrybooks":
  		  System.out.println("*****this are the available chemistry books in library rows*****");
  	   for(String i:s) {
  		    		  System.out.println("total collections of:"+i);
  		  }
  	   System.out.println("*****bookschoosing*****");
  		    Iterator<String> oop = s.iterator();
  	      	 System.out.println(oop.next());
  	      	System.out.println(oop.next());
  	      System.out.println(oop.next());
  		 break;
  	     	  
  	  case "availablecomputerbooks":
  		  System.out.println("*****this are the available computerscience books in library rows*****");
      	  for(String j:q) {
      		    		  System.out.println("total collections of:"+j);
      		  }
      	System.out.println("*****bookschoosing*****"); 
		    Iterator<String> oop2 = q.iterator();
	      	 System.out.println(oop2.next());
      	  break;
      	  
  	  case "availablephysicsbooks":
  		  System.out.println("*****this are the available physics books in library rows*****");
      	  for(String k:w) {
      		    		  System.out.println("total collections of:"+k);
      		  }
      	System.out.println("*****bookschoosing*****");
		    Iterator<String> oop3 = w.iterator();
	      	 System.out.println(oop3.next());
	      	System.out.println(oop3.next());
	    
		 break;
      	  
  	  case "availablegovernmentexambooks":
  		  System.out.println("*****this are the available governmentexams books in library rows*****");
      	  for(String l:e) {
      		    		  System.out.println("total collections of:"+l);
      		  }
      	System.out.println("*****bookschoosing*****");
		    Iterator<String> oop4 = e.iterator();
	      	 System.out.println(oop4.next());
      	  break;
      	  
  
  	  case "availableelectronicbooks":
  		  System.out.println("*****this are the available electronic books in library rows*****");
      	  for(String m:r) {
      		    		  System.out.println("total collections of:"+m);
      		  }
      	System.out.println("*****bookschoosing*****");
      	 Iterator<String> oop5 = r.iterator();
      	 System.out.println(oop5.next());
  	  break;
      	  
  	  case "availablecivilbooks":
  		  System.out.println("*****this are the available electronic books in library rows*****");
      	  for(String o:c) {
      		    		  System.out.println("total collections of:"+c);
      		  }
      	System.out.println("*****bookschoosing*****");
      	 Iterator<String> oop6 = c.iterator();
      	 System.out.println(oop6.next());
  	  break;
      	
  	  case "availablemechanicalbooks":
  		  System.out.println("*****this are the available electronic books in library rows*****");
      	  for(String u:p) {
      		   System.out.println("total collections of:"+u);
      		  }
      	System.out.println("*****bookschoosing*****");
      	 Iterator<String> oop7 = p.iterator();
      	 System.out.println(oop7.next());
  	  break;
      	
  	  default:
  	   	  System.out.println("books are not available contact arun for further details"); 
  	  }
  	      	  } 
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
