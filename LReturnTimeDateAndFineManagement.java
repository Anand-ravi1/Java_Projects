package javapro;

import java.util.ArrayList;
import java.util.Scanner;
  
public class  LReturnTimeDateAndFineManagement extends Lfeemanagement{
	 LReturnTimeDateAndFineManagement(){
		   System.out.println("when user got the book, return time date and fine has applied for user in library database");
		   userdetails();
		   }
	 public void userdetails() {
		 
		 StringBuilder a = new StringBuilder("login your profile to see the books details in library");
    	  for(int i=0;i<a.length();i++) {
    		 if(a.charAt(i) >= 97 && a.charAt(i) <= 122) {
    			 int b =(int)a.charAt(i)-32;   			 
    			 a.setCharAt(i, (char)b);
    		 }
    	 }
    	  System.out.println(a);
    	  System.out.println("Enter username then enter password---"
    	  		+ "username: anand, password:22"
    	  		+ "/  username: arun, password:23");
    	  
		 Scanner ss = new Scanner(System.in);
		 String sss = ss.nextLine();
		 String aaa = ss.nextLine();
		 if(sss.equals("anand") && aaa.equals("22")) {
			 int i=0;
			 while(i<1){
			 System.out.println("username:\t"+sss);
			 i++;
			 }
			 ArrayList<String> q = new ArrayList<String>();
			 q.add("books name::chemistry,physics");
			 q.add("\nreturn Date:2/12/2022,2/12/2022");
			 q.add("\nreturn time:morning,morning");
			 q.add("\nfine:,if user need to pay fine when they delayed to submit the books");
			 q.add("\nperdelayed day is:5rs");  
			 System.out.println(q);
		 }
		 else if(sss.equals("arun") && aaa.equals("23")) {
			 int i=0;
			 while(i<1){
			 System.out.println("username:\t"+sss);
			 System.out.println("books returntime, date and fine section");
			 System.out.println("books you bought");
			 i++;
			 }
			 ArrayList<String> q = new ArrayList<String>();
			 q.add("books name:computerscience,physics");
			 q.add("\nreturn Date:3/12/2022,3/12/2022");
			 q.add("\nreturn time:within morning,within morning");
			 q.add("\nfine:if user need to pay fine when they delayed to submit the books");
			 q.add("\nperdelayed day is:5rs");
			 System.out.println(q);
		 }
		 else {
			 System.out.println("Incorrect username or password");
		 }
      }
public static void main(String[] args) {
       // TODO Auto-generated method stub
 }
}