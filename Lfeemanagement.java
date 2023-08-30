package javapro;

import java.util.Scanner;

public class Lfeemanagement extends  LBooksBorrowingManagement{
	//cash,online payment,lazypay
	String a;
	String b;
	  Lfeemanagement(){
		  System.out.println("welcome to payment options");
		} 
	//copy constructor
	Lfeemanagement(String a,String b){
		this.a=a;
		this.b=b;
	}
  
	Lfeemanagement(Lfeemanagement f){
		 a=f.a;
		 b=f.b; 	
		 message();
		 System.out.println("choose any options given below");
		 System.out.println("press 1.for cash, 2.for online payment, 3.for lazypay");
		 paymentoptions();
	}
	public void message() {
		 System.out.println("a="+a);
		 System.out.println("b="+b);
	}
	public void paymentoptions() {
		 Scanner obj = new Scanner(System.in);
		 int s = obj.nextInt();
		 switch(s) {
		 case 1:
			 final int q1=5;
			 final int q2=10;
			 final int q3=15;
			 System.out.println("user has selected the cash option");
			  System.out.println("Enter the total number of books with string");
			  Scanner obj1 = new Scanner(System.in);
			  String d= obj1.nextLine();
			  if(d.equals("one")) {
				  System.out.println("price of the single book is:"+q1);
				  System.out.println("successfully paid");
			  }
			  else if(d.equals("two")) {
				  System.out.println("price of the double book is:"+q2);
				  System.out.println("successfully paid");
			  }
			  else if(d.equals("three")) {
				  System.out.println("price of the triple book is:"+q3);
				  System.out.println("successfully paid");
			  }
			  else {
				  System.out.println("More than three books are not available for sale");
			  }
		 break;
		 case 2:
			 final int w1=5;
			 final int w2=10;
			 final int w3=15;
			 System.out.println("user has selected the online payment option");
			 System.out.println("This options are available--press 1 for google pay--press above 1 for paytm");
			 Scanner obj2a = new Scanner(System.in);
			  int f= obj2a.nextInt();
			  if(f==1) {
				  System.out.println("user has selected the google pay in online payment option");
			  }
			  else {
				  System.out.println("user has selected the paytm in online payment option");
			  }
			  System.out.println("Enter the total number of books with string and \n username_password "
			  		+ "-- eg: one/two/three enter then type username_password");
			  Scanner obj2b = new Scanner(System.in);
			  String e= obj2b.nextLine();
			  Scanner obj2c = new Scanner(System.in);
			  String username_password= obj2c.nextLine();
			  
			  if(e.equals("one")) {
				  System.out.println("price of the single book is:"+w1);
				 if(username_password.equals("Anand_Anand123")) {
				  System.out.println("successfully paid");
				 }
				 else {
					 System.out.println("unable to pay because user entered incorrect username or password");
				 }
			  }
			  else if(e.equals("two")) {
				  System.out.println("price of the double book is:"+w2);
				  if(username_password.equals("Anand_Anand123")) {
					  System.out.println("successfully paid");
					 }
					 else {
						 System.out.println("unable to pay because user entered incorrect username or password");
					 }
			  }
			  else if(e.equals("three")) {
				  System.out.println("price of the triple book is:"+w3);
				  if(username_password.equals("Anand_Anand123")) {
					  System.out.println("successfully paid");
					 }
					 else {
						 System.out.println("unable to pay because user entered incorrect username or password");
					 }
			  }
			  else {
				  System.out.println("More than three books are not available for sale");
			  }	 break;
		 case 3:
			 final int e1=5;
			 final int e2=10;
			 final int e3=15;
			 System.out.println("user has selected the lazypay option");
			 System.out.println("Enter the total number of books with string");
			  Scanner obj3 = new Scanner(System.in);
			  String f1= obj3.nextLine();
			  if(f1.equals("one")) {
				  System.out.println("price of the single book is:"+e1);
				  System.out.println("successfully paid");
			  }
			  else if(f1.equals("two")) {
				  System.out.println("price of the double book is:"+e2);
				  System.out.println("successfully paid");
			  }
			  else if(f1.equals("three")) {
				  System.out.println("price of the triple book is:"+e3);
				  System.out.println("successfully paid");
			  }
			  else {
				  System.out.println("More than three books are not available for sale");
			  }
			 break;
		 }
			 
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 		
	}

}
