import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int armut,elma,domates,muz,patlican;
	
	  double	armutKg = 2.14 ;
	  double	elmaKg = 3.67 ;
	  double	domatesKg = 1.11 ;
	  double	muzKg = 0.95 ;
	  double	patlicanKg = 5.00 ;
	  double toplam;	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Armut Ka� Kilo ? : ");
		armut=input.nextInt();
		
		System.out.println("Elma Ka� Kilo ? : ");
		elma=input.nextInt();
		
		System.out.println("Domates Ka� Kilo ? : ");
		domates=input.nextInt();
		
		System.out.println("Muz Ka� Kilo ? : ");
		muz=input.nextInt();
		
		System.out.println("Patl�can Ka� Kilo ? : ");
		patlican=input.nextInt();
		
		toplam = (armut*armutKg) + (elma*elmaKg) + (domates*domatesKg) + (muz*muzKg) + (patlican*patlicanKg) ;
		
		System.out.println("Toplam Tutar : " + toplam + "TL");

	}

}
