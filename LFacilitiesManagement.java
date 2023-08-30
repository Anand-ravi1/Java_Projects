package javapro;

import java.util.Scanner;

public class LFacilitiesManagement extends LBooksAvailabilityManagement{
    
		//polymorphism overloading
     	static int i1=0; 
	public void Lfacilities(String first_facilities) {

		for(int i=0;i<=0;i++) {
		  System.out.println("****"+first_facilities+"****");
		for(int j=0;j==0;j++) {
			System.out.println("anyone can access this library with user id's");
		}
		}
		 i1++;
		    System.out.println("only"  +  i1  +  "\n id for per user");
	}
	public void Lfacilities(String second_facilities,String third_facilities) {
		for(int k=0;k==0;k++) {
			 System.out.println("****"+second_facilities+"****");
			 i1++;
			 i1++;
			 System.out.println("more than"  +  i1  +  "\n are not allowed to user ");
			for(int l=0;l==0;l++) {
				System.out.println("\t and");
				System.out.println("****"+third_facilities+"****");
				i1--;
				System.out.println("only"  +  i1  +  "\n place is allowed for per user");
			}
		}
	}
	//overidding
	public void Lfacilities(String fourth_facilities,String fifth_facilities,String sixth_facilities,String seventh_facilities) {
		int p=77;
	do {
		System.out.println("****"+fourth_facilities+"****"+"\n only allowed for group discussion");
		System.out.println("****"+fifth_facilities+"****"+"\n only"+i1+"locker for per user");
		System.out.println("****"+sixth_facilities+"****"+"\n available for library user's");
		System.out.println("****"+seventh_facilities+"****"+"\n available for library user's");
		
	}while(p==0);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              }
}

