import java.util.Scanner;

public class Sirala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;

		Scanner input = new Scanner(System.in);
		
		 System.out.println( " 1.sayiyi giriniz : ");
		 a= input.nextInt();
		 
		 System.out.println( " 2.farkli bir sayi giriniz : ");
		 b= input.nextInt(); 
		 
		 System.out.println( " 3.farkli bir sayi giriniz : ");
		 c= input.nextInt();

		 System.out.println( " Sıralamanız : ");
		 if ((a<b && a<c)){
		    
			 if (b<c){
		    	 
				 System.out.print("a<b<c");
		    
			 }else{
		    	  System.out.print("a<c<b");
		      }
		
		 }else if ((b<a && b<c)){
		    
			 if (a<c){
		    	  
				 System.out.print("b<a<c");
		    
			 }else{
		    	 
				 System.out.print("b<c<a");
		      }
		
		 }else{
		    
			if (a<b){
		    	 System.out.print("c<a<b");
		    
			}else{
		    	 System.out.print("c<b<a");
		    }
		}
		
		

	}

}
