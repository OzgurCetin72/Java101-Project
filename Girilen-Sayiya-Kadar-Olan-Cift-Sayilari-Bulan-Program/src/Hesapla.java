
import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bolum=0,bolunen=0,sonuc ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("lütfen bir sayiyi giriniz : ");
		int sayi =input.nextInt();
	
	
		System.out.println(" 3 ve 4'e tam bolunen sayilar : ");
		
		for (int i = 0; i <= sayi; i++) {
		
		if (i % 12 ==0) {
			System.out.println(i);
			bolum++;
			bolunen += i ;
			
		}
		
	}
	
	sonuc=bolunen/bolum;
	System.out.println(" 3 ve 4'e tam bolunen sayilarin ortalamasi : " + sonuc);
	
	
	}

}
