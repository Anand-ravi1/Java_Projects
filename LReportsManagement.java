package javapro;

import java.util.Scanner;

public class LReportsManagement extends LRecordsManagement{
	
	LReportsManagement(){
		super();
		 System.out.println("users can share the feedback to postbox or directmeetup");
		 System.out.println("enter the path name:postbox/directmeetup");
		feedbackfromuser();
	   }
   public void feedbackfromuser() {
	   Scanner obj = new Scanner(System.in);
	   String s = obj.nextLine();
	   if(s.equals("postbox")) {
		   System.out.println("user has selected postbox option");
		   System.out.println("feedback from unknown user: need to change library infrastructure because of harder to find books");
	   }
	   else if(s.equals("directmeetup")){
		   System.out.println("user has selected directmeetup option");
	   }
	   else {
		   System.out.println("users are not interested to give feedback");
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
