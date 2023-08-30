package javapro;

import java.util.Scanner;

public class LibrarySystemManagement {
	    //super constructor Lwelcomenotice- welcome notice from library | eg:welcome to library
		//L login management  - user need to enter details for login or register | eg:username and password
		//L books catalog management - choose books section from library catalog | eg:chemistry or physics books
		//L books availability management - searching, needed books availablity and then choosing the books | eg:In chemistry books, searching correct books with author name
		//L facilities management - user can use library facilities | eg:internet, place etc...
		//L books borrowing management - borrowing books from library | eg:rent,exchange etc...
		//L fee management - need to pay for required books | eg:payments for books gpay or cash etc...
     	//L return time date and fine management - this details are given from librarian for user | eg:time,date,fine
		//L records management - all user details has recorded | eg:name, phone no, address etc...
		//L reports management - user can give the feedbacks about library | eg:postbox or directmeetup
		
		public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			//L login management
			LloginManagement first = new LloginManagement("no");
			//L books catalog management
			LBooksCatalogManagement bc = new  LBooksCatalogManagement();
			bc.booksSection();
			//L books availability management
			LBooksAvailabilityManagement ba = new LBooksAvailabilityManagement();
			 ba.booksavailability("senthil","suresh","ashok", "rajesh","arun","seventh");
			//L facilities management
			 LFacilitiesManagement FM = new  LFacilitiesManagement();
		        System.out.println("**choose one facility from any of these below three groups do you want**");
		        System.out.println("**accessfacilities , booksfacilities & placefacilities"
		        		+ " , multimediafacilities & lockerfacilities & internetfacilities & cafefacilities & restingfacilities**");
		        Scanner obj = new Scanner(System.in);
		        String fm = obj.nextLine();
		        switch(fm) {
		        case "accessfacilities":
		         FM.Lfacilities("open access for all_facilities");
		         break;
		        case "booksfacilities":
		        case "placefacilities":
		        FM.Lfacilities("books_facilities","place_facilities");
		        break;
		        case "multimediafacilities":
		        case "lockerfacilities":
		        case "internetfacilities":
		        case "cafefacilities":
		        case "restingfacilities":
		        FM.Lfacilities("multimedia_facilities","locker_facilities","internet_facilities","cafe_facilities");
		        break;
			    default:
			    	System.out.println("This facilities are not available in library");
		        }
			//L books borrowing management
			LBooksBorrowingManagement BO = new LBooksBorrowingManagement();
			BO.LBooksBorrowingoptions("Rent","mortgage","reserve","permanent buying");
			BO.setRentbooks("books rent has successful","yes");
			BO.setMortgagebooks("books exchange has successful","yes");
			BO.setReservebooks("books reserve has successful","no");
			BO.setPermanentbuying("books has successful","no");
			System.out.println("name:"+BO.getRentbooks());
			System.out.println("name:"+BO.getMortgagebooks());
			System.out.println("name:"+BO.getReservebooks());
			System.out.println("name:"+BO.getPermanentbuying());
			//L fee management
			 Lfeemanagement obj0 = new Lfeemanagement();
			 Lfeemanagement obj1 = new  Lfeemanagement("hello","everyone");
			 Lfeemanagement obj2 = new Lfeemanagement(obj1);
			//L return time date and fine management
			 LReturnTimeDateAndFineManagement obj11 = new  LReturnTimeDateAndFineManagement();
			 //L records management 
			 LRecordsManagement obj12 = new  LRecordsManagement();
			 obj12.userrecords1();
			 obj12.userrecords2();
			 //L reports management
			  LReportsManagement ob = new LReportsManagement();
			
		}
	}

