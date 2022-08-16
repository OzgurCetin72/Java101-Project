import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int km;
		double kmBasina= 2.20;
		int taksimetreAcilis=10;
		int minUcret=20;
		double tutar;

		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Km Mesafesini Giriniz : ");
		km=input.nextInt();
		
		tutar= (km * kmBasina) + taksimetreAcilis; 
		
		System.out.println( (tutar>20) ? "TUTAR : " + tutar + " TL" : "TUTAR : " + minUcret + " TL" );
		
		
	}

}
