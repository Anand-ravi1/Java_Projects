package javapro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class LBooksCatalogManagement extends LBooksAvailabilityManagement{

	
	public void booksSection() {//switch
    	 System.out.println("books catalogs are given before entering the bookssection");
    	 System.out.println("use books catalogs to find out your bookssections");
    	 System.out.println("Available books lists: for chemistry books: chemistrybookssection, "
    	 		+ "for computerscience: computersciencebookssection, for electronic books: electronicbookssections,"
    	 		+ "for government books: governmentexambookssections, for physicsbooks: physicsbookssections, "
    	 		+ "for civil books: civilbookssections, for mechanical books: mechanicalbookssections");
    	 Scanner a = new Scanner(System.in);
    	 String bc = a.nextLine();
    	 switch(bc){
    	 case "chemistrybookssection":
    		 System.out.println("Section:3- books are placed in left side");
    		 break;
    	 
    	 case "computersciencebookssection":
    		 System.out.println("Section:5- books are placed in left side middle");
    		 break;
    		 
    	 case "electronicbookssections":
    		 System.out.println("Section:10- books are placed in right side middle");
    		 break;
    	 
    	 case "governmentexambookssections":
    		 System.out.println("Section:22- books are placed in right side top");
    		 break;
    		 
    	 case "physicsbookssections":
    		 System.out.println("Section:11- books are placed in right side bottom");
    		 break;
    	 
    	 case "civilbookssections":
    		 System.out.println("Section:4- books are placed in left side bottom");
    		 break;
    		 
    	 case "mechanicalbookssections":
    		 
    		 System.out.println("Section:1- books are placed in right side bottom");
    		 break;
    		 
    	 default:
    		 System.out.println("This books are not mentioned in books catalog contact arun for solution,because this department is managed by arun");
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
