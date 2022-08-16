import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		double tutar,kdvOraný,kdvTutar,kdvliTutar;
		
		System.out.println("Ucret Tutarýnýzý Giriniz : ");
		tutar=input.nextDouble();
		
		kdvOraný=(tutar>1000)? 8 : 18;
		
		kdvTutar= tutar * kdvOraný ;
		
		kdvliTutar= tutar + kdvTutar;
		
		System.out.println("Kdv Dahil Tutarýnýz : " + kdvliTutar );
		
		
		
		
		
		
	
	
	}

}
