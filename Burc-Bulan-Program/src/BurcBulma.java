import java.util.Scanner;

public class BurcBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int month, day;
	      String burc=" " ;
	       

	        Scanner input = new Scanner(System.in);
	       
	        System.out.print("Do�du�unuz ay : ");
	        month = input.nextInt();
	        
	        System.out.print("Do�du�unuz g�n : ");
	        day = input.nextInt();

	        if ((month > 12) || (month < 1)) {
	            System.out.println("Hatal� giri� yapt�n�z. L�tfen tekrar deneyiniz..");
	        
	        } else {
	        	

		        if (month == 1) {
		            if (day > 0 && day <= 21) {
		                burc= "O�lak";
		            } else if (day > 0 && day <= 31) {
		                burc= "Kova";
		            } else
		            	 System.out.println("Hatal� giri� yapt�n�z. L�tfen tekrar deneyiniz..");

		        } else if (month == 2) {
		            if (day > 0 && day <= 19) {
		                burc= "Kova";
		            } else if (day > 0 && day <= 29) {
		                burc= "Bal�k";
		            } else
		            	 System.out.println("Hatal� giri� yapt�n�z. L�tfen tekrar deneyiniz..");
		        } else if (month == 3) {
		            if (day > 0 && day <= 20) {
		                burc= "Bal�k";
		            } else if (day > 0 && day <= 31) {
		                burc= "Ko�";
		            } else
		            	 System.out.println("Hatal� giri� yapt�n�z. L�tfen tekrar deneyiniz..");
		        } else if (month == 4) {
		            if (day > 0 && day <= 20) {
		                burc= "Ko�";
		            } else if (day > 0 && day <= 30) {
		                burc= "Bo�a";
		            } else
		            	 System.out.println("Hatal� giri� yapt�n�z. L�tfen tekrar deneyiniz..");
		        } else if (month == 5) {
		            if (day > 0 && day <= 21) {
		                burc= "Bo�a";
		            } else if (day > 0 && day <= 31) {
		                burc= "�kizler";
		            } else
		            	 System.out.println("Hatal� giri� yapt�n�z. L�tfen tekrar deneyiniz..");

		        } else if (month == 6) {
		            if (day > 0 && day <= 22) {
		                burc= "�kizler";
		            } else if (day > 0 && day <= 30) {
		                burc= "Yenge�";
		            } else
		            	 System.out.println("Hatal� giri� yapt�n�z. L�tfen tekrar deneyiniz..");

		        } else if (month == 7) {
		            if (day > 0 && day <= 22) {
		                burc= "Yenge�";
		            } else if (day > 0 && day <= 31) {
		                burc= "Aslan";
		            } else
		            	 System.out.println("Hatal� giri� yapt�n�z. L�tfen tekrar deneyiniz..");

		        } else if (month == 8) {
		            if (day > 0 && day <= 22) {
		                burc= "Aslan";
		            } else if (day > 0 && day <= 31) {
		                burc= "Ba�ak";
		            } else
		            	 System.out.println("Hatal� giri� yapt�n�z. L�tfen tekrar deneyiniz..");

		        } else if (month == 9) {
		            if (day > 0 && day <= 22) {
		                burc= "Ba�ak";
		            } else if (day > 0 && day <= 30) {
		                burc= "Terazi";
		            } else
		            	 System.out.println("Hatal� giri� yapt�n�z. L�tfen tekrar deneyiniz..");

		        } else if (month == 10) {
		            if (day > 0 && day <= 22) {
		                burc= "Terazi";
		            } else if (day > 0 && day <= 31) {
		                burc= "Akrep";
		            } else
		            	 System.out.println("Hatal� giri� yapt�n�z. L�tfen tekrar deneyiniz..");

		        } else if (month == 11) {
		            if (day > 0 && day <= 21) {
		                burc= "Akrep";
		            } else if (day > 0 && day <= 30) {
		                burc= "Yay";
		            } else
		            	 System.out.println("Hatal� giri� yapt�n�z. L�tfen tekrar deneyiniz..");

		        } else if (month == 12) {
		            if (day > 0 && day <= 21) {
		                burc= "Yay";
		            } else if (day > 0 && day <= 31) {
		                burc= "O�lak";
		            } else
		            	 System.out.println("Hatal� giri� yapt�n�z. L�tfen tekrar deneyiniz..");
		        }
		        
	            System.out.println("Burcunuz : " + burc);
	        }
	
	
	}

}
