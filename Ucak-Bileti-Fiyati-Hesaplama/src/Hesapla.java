import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mesafe, yas, tip;
		double yas�ndirimOran�;
		

		Scanner input = new Scanner(System.in);

		System.out.println("Lutfen mesafeyi giriniz(km) : ");
		mesafe = input.nextInt();

		System.out.println("Lutfen yasinizi giriniz : ");
		yas = input.nextInt();

		System.out.println("Yolculuk tipinizi giriniz : ");
		System.out.println("1 => Tek Y�n\n2 => Gidis-Donus");
		tip = input.nextInt();

		if ((mesafe > 0) && (yas > 0) && (tip == 1 || tip == 2)) {

			if (yas < 12) {
				yas�ndirimOran� = 0.50;

			} else if (yas > 12 && yas < 24) {
				yas�ndirimOran� = 0.10;

			} else if (yas > 65) {
				yas�ndirimOran� = 0.30;

			} else {
				yas�ndirimOran� = 0;
			}
			
			
			double	normalTutar = mesafe * 0.10 ;
			double	yas�ndirimi = normalTutar * yas�ndirimOran� ;
			double	indirimliTutar = normalTutar - yas�ndirimi ;
			double	toplamTutar;
			
			if (tip==2) {
				
				double	gidisDonus�ndirimi = indirimliTutar * 0.20 ;
				toplamTutar = (indirimliTutar - gidisDonus�ndirimi) * 2 ;
			
			}else {
				
				toplamTutar = indirimliTutar;
				
			}
			
			System.out.println("Toplam Tutar : " + toplamTutar + " TL");
			
			
			
			
			
			
			
			
			

		} else {

			System.out.println(" Hatal� Veri Girdiniz.. ! ");

		}

	}

}
