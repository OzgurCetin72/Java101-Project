
import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int matematik , fizik , kimya , turkce, tarih , muzik; 
		
		System.out.println(" matematik notunuzu giriniz : ");
		matematik =input.nextInt();
		
		System.out.println(" fizik notunuzu giriniz : ");
		fizik =input.nextInt();
		
		System.out.println(" kimya notunuzu giriniz : ");
		kimya =input.nextInt();
		
		System.out.println(" turkce notunuzu giriniz : ");
		turkce =input.nextInt();
		
		System.out.println(" tarih notunuzu giriniz : ");
		tarih =input.nextInt();
		
		System.out.println(" muzik notunuzu giriniz : ");
		muzik =input.nextInt();
		
		
		int toplam = (matematik + matematik + kimya + turkce + tarih + muzik );
		
		double sonuc = toplam / 6 ;
		
		
		
		System.out.println((sonuc>60) ? "Ortalaminiz " + sonuc + " Sinifi Geçtiniz..": "Ortalaminiz " + sonuc + " Sinifta Kaldiniz..");
		
		
		
		
		

	}

}
