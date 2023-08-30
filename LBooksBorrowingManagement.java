package javapro;

import java.util.Scanner;

public class LBooksBorrowingManagement extends  LFacilitiesManagement {
	
	//polymorphism //overriding
	public void LBooksBorrowingoptions(String option1,String option2,String option3,String option4) {
		System.out.println("Booksborrowing\n_option1:"+option1+"\n_option2:"+option2+"\n_option3:"+option3+"\n_option4:"+option4);
	}
	    //encapsulation
	    private String rentbooks;
	    private String mortgagebooks;
	    private String reservebooks;
	    private String permanentbuying;
	    public String getRentbooks() {
			return rentbooks;
	    	 
	    }                                      
		public void setRentbooks(String rentbooks,String t) {
			System.out.println("preconditions for rentbooks: \n 1.user should be have the identity card or any other proof for rent"
					+ "\n 2.user should be have the money");
    	 System.out.println("Do you have proof and money");
        if(t=="yes") {
        	System.out.println("yes");
        	this.rentbooks = rentbooks;
		}
        else{
        	System.out.println("you are not eligible for rent");
        }
			
		}
		
		public String getMortgagebooks() {
			
			return mortgagebooks;
		}
		public void setMortgagebooks(String mortgagebooks,String v) {
			System.out.println("precondition for exchangebooks: \n 1.user should be have the identity card or any other proof for exchange"
					+ "\n 2.user should be have the book");
			 System.out.println("Do you have proof and books for ex");
			 if(v=="yes") {
		        	System.out.println("yes");
		        	 this.mortgagebooks = mortgagebooks;
				}
		        else{
		        	System.out.println("you are not eligible for exchangebooks");
		        }
		}
		public String getReservebooks() {
			return reservebooks;
		}
		public void setReservebooks(String reservebooks,String w) {
			System.out.println("if books are not available, we use reserve option to reserve books and then get that book next week");
			System.out.println("precondition for reservebooks: \n 1.user should be have the identity card or any other proof for reserve"
					+ "\n 2.user should known the reversing bookdetails");
			 System.out.println("Do you have proof and name of the book");
			 if(w=="yes") {
		        	System.out.println("yes");
		        	this.reservebooks = reservebooks;
				}
		        else{
		        	System.out.println("you are not eligible for reservebooks");
		        }
	
		}
		public String getPermanentbuying() {
			return permanentbuying;
		}
		public void setPermanentbuying(String permanentbuying,String x) {
			System.out.println("we can buy book permanentely if stock is available");
			System.out.println("precondition for buybookspermanently: \n 1.user should be have the identity card or any other proof for reserve"
					+ "\n 2.user should be have the money");
			 System.out.println("Do you have proof and name of the book");
			 if(x=="yes") {
		        	System.out.println("yes");
					this.permanentbuying = permanentbuying;	
				}
		        else{
		        	System.out.println("you are not eligible for permanentbuying");
		        }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
}