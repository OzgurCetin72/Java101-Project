

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
		
		
	
		
		if (matematik < 0 || matematik > 100) {
			matematik=0;
		
		} if (fizik < 0 || fizik > 100) {
			fizik=0;
		
		} if (tarih < 0 || tarih > 100) {
			tarih=0;
		
		} if (kimya < 0 || kimya > 100) {
			kimya=0;
		
		} if (turkce < 0 || turkce > 100) {
			turkce=0;
		
		} if (muzik < 0 || muzik > 100) {
			muzik=0;
		}
		
		
		double ortalama = ( matematik+ tarih+ fizik+ turkce+ kimya+ muzik)/6;
        if (ortalama < 55) {
            System.out.println("Sinifta kaldiniz..");
        }
        else {
            System.out.println("Sinifi Gectiniz Tebrikler..");
    
        }
        System.out.println("Ortalamaniz : " + ortalama);
	
		
		
		
		
		

	}

}