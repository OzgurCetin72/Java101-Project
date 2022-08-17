import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sayi1,sayi2,islem,sonuc;
		
		Scanner input = new Scanner(System.in);
		
		
		 System.out.println(" Ýlk sayiyi giriniz : ");
		 sayi1=input.nextInt();
		 
		 System.out.println(" Ýkinci sayiyi giriniz : ");
		 sayi2=input.nextInt();
		 
		 System.out.println(" Ýsleminizi seciniz : ");
		 System.out.println("1-Toplama\n2-Cýkarma\n3-Carpma\n4-Bolme ");
		 islem=input.nextInt();
		 
		 switch (islem) {
		case 1:
			sonuc=sayi1 + sayi2;
			System.out.println(" Sonuc : " + sonuc );
			break;

		case 2:
			sonuc=sayi1 - sayi2;
			System.out.println(" Sonuc : " + sonuc );
			break;
		case 3:
			sonuc=sayi1 * sayi2;
			System.out.println(" Sonuc : " + sonuc );
			break;
		case 4:
			sonuc=sayi1 / sayi2;
			System.out.println(" Sonuc : " + sonuc );
			break;
		}
		 

	}

}
