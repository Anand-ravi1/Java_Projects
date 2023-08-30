package javapro;

public class LRecordsManagement extends LReturnTimeDateAndFineManagement {

	public void userrecords1() {
	     try {//s.no , user id no , password , DOB , working/studying , address , phone no , no.of.books get from library , no.of.books return from user , pending books
	     	
	    	 String a[][]= {{"s.no: 1","useridno: us1221","password: 22ww22","working/studying: studying","DOB: 22/02/2000","address: kknagar","phone no: 6315267874","no.of.books get from library: 2","no.of.books return from user: 1","pending books: 1"},
	    			 {"s.no: 2","useridno: sd1221","password: 33ww22","working/studying: studying","DOB: 19/04/2000","address: annanagar","phone no: 9372657824","no.of.books get from library: 2","no.of.books return from user: 2","pending books: 0"}};
	    	 for(int i=0;i<2;i++) {
	    		 System.out.println("\n libraryuser \s"+i+"\s database");
	    		 for(int j=0;j<10;j++) {
	    			 System.out.println(j+"\t"+a[i][j]);
	    		 }
	    	 }
	    	 System.out.println("user records stored successfully in data base");
	    	 }
	     
	     catch(Exception d){
	    	 System.out.println("user records didn't store the data in data base");
	     }							
	     
		}
		public void userrecords2() {
		     try {//s.no , user id no , password , DOB , working/studying , address , phone no , no.of.books get from library , no.of.books return from user , pending books
		   
		    	 String a[][]= {{"s.no: 3","useridno: oo1221","password: ioww22","working/studying: working","DOB: 01/05/2000","address: gandhinagar","phone no: 7895267874","no.of.books get from library: 2","no.of.books return from user: 1","pending books: 1"},
		    			 {"s.no: 4","useridno: po1221","password: 777ww22","working/studying: working","DOB: 20/07/2000","address: LLnagar","phone no: 6435757824","no.of.books get from library: 2","no.of.books return from user: 2","pending books: 0"}};
		    	 for(int i=0;i<2;i++) {
		    		 System.out.println("\n libraryuser \s"+i+"\s database");
		    		 for(int j=0;j<10;j++) {
		    			 System.out.println(j+"\t"+a[3][11]);
		    		 }
		    	 }
		     	 System.out.println("user records stored successfully in data base");
		    	 }
		     
		     catch(Exception d){
		    	 
		    	 System.out.println("user records didn't store the data in data base");
		    	 
		     }
		     
			}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 }

}