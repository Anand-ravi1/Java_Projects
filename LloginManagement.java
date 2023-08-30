package javapro;

import java.util.Scanner;

public class LloginManagement extends LWelcomenotice {
	//super constructor
	LloginManagement(){
		super();
	}
	LloginManagement(String yes){   //constructor parameterized
		
		
		System.out.println("librarian: only registered profile id's person are allowed to enter inside the library");
		System.out.println("librarian: Are you done your registration? : yes/no");
		if(yes=="yes") {
			System.out.println(yes);
			System.out.println("go to login page");
			login("anand",22);
		}
		else if(yes=="no") {
			System.out.println(yes);
			System.out.println("go to register page");
			register();
			login("arun",23);
		}
	}
	
       public void register() {    //arrays
    	   
    	  String a[][][] = new String[2][2][2];
          System.out.println("Name:");
    	  Scanner details = new Scanner(System.in);
  		  String d1 = details.nextLine();
  		  System.out.println("DOB:");
  		  String d2 = details.nextLine();
  		  System.out.println("Age:");
  		  String d3 = details.nextLine();
  		  System.out.println("phoneno:");
  		  String d4 = details.nextLine();
    	  a[0][0][0]=d1;
    	  a[0][0][1]=d2;
    	  a[0][1][0]=d3;
    	  a[0][1][1]=d4;
          System.out.println("Name:");
  		  String e1 = details.nextLine();
  		  System.out.println("DOB:");
  		  String e2 = details.nextLine();
  		  System.out.println("Age:");
  		  String e3 = details.nextLine();
  		 System.out.println("phoneno:");
  		  String e4 = details.nextLine();
    	  a[1][0][0]=e1;
    	  a[1][0][1]=e2;
    	  a[1][1][0]=e3;
          a[1][1][1]=e4;    	  
           for(int i=0;i<2;i++) {
        	for(int j=0;j<2;j++) {  
        		for(int k=0;k<2;k++) {
        			System.out.println("registered details:"+a[i][j][k]);
        			}
          }
        	}
           System.out.println("registration has done");
           System.out.println("login to profile");
           System.out.println("\n*************************");
        	}
       
       public void login(String a,int b) { //while and elseif
    	   
    	  int i=1;      
    	  while(i<2) {
    		  System.out.println("login with valid details");
    		  System.out.println("own name is username");
    		  System.out.println("DOB is password");
    		  i++;
    	  }
    	  if(a=="anand" && b==22) {
    			  System.out.println("login has successfully 1");
    	  }
    		  	  else if(a=="arun" && b==23){
    				  System.out.println("login has successfully 2");
    			  }
    				  else {
        				  System.out.println("username or passwords are incorrect");
        				  System.out.println("other options: scan college identity barcode to enter the library");
        				  System.out.println("if any issue are you facing from login contact bala for solution because login is managed by bala");
        			  }
    		  
           /* else if(a!="anand" && a!="arun") {
    		  System.out.println("username or password are incorrect");
    		  System.out.println("other options: scan college identity barcode to enter the library");
    		  System.out.println("if any issue are you facing from login contact bala for solution because login is managed by bala");
    	  }
    	  else if(a=="arun"){
    		  if(b==23) {
    			  System.out.println("login has successfully 2");
    		  }
    		  else {
    			  System.out.println("username or password are incorrect");
    			  System.out.println("if any issue are you facing from login contact bala for solution because login is managed by bala");
    		  }
    	  }
    	  System.out.println("\n*************************");
    */
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
