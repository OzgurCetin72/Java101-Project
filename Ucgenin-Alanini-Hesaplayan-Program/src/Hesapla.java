import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner input = new Scanner(System.in);
		
		int a,b,c;
		double u,alan;
		
		System.out.println(" a Kenar uzunlugunu giriniz : ");
		a=input.nextInt();
		
		System.out.println(" b Kenar uzunlugunu giriniz : ");
		b=input.nextInt();
		
		System.out.println(" c Kenar uzunlugunu giriniz : ");
		c=input.nextInt();
		
                //Ucgenin cevresi  = 2u     u=(a+b+c)/2;
		
		u=(a+b+c)/2;
		
		//Alan= karakök içinde u*(u-a)*(u-b)*(u-c) 
		
		alan=Math.sqrt( u*(u-a)*(u-b)*(u-c) );
		
		System.out.println(alan);
	
	
	}

}
