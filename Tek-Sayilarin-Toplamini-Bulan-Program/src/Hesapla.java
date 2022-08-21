import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int toplam=0 , sayi;
		
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("lütfen bir sayiyi giriniz : ");
			 sayi =input.nextInt();
			 if (sayi%4==0) {
				
				 toplam+=sayi;
			}
			
		} while (sayi %2 == 0 );
		
		System.out.println("Toplam : "+toplam );
	
	}

}
