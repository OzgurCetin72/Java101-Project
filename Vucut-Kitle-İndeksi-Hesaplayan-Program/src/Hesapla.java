import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double boy,sonuc;
		int kilo;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("L�tfen boyunuzu (metre cinsinde) giriniz : ");
		boy=input.nextDouble();
		
		System.out.println(" L�tfen kilonuzu giriniz : ");
		kilo=input.nextInt();
		
		sonuc= kilo / (boy * boy) ;
		
		System.out.println(" Vucut Kitle �ndeksiniz : " + sonuc);
		

	}

}
