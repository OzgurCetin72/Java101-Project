import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		double tutar,kdvOran�,kdvTutar,kdvliTutar;
		
		System.out.println("Ucret Tutar�n�z� Giriniz : ");
		tutar=input.nextDouble();
		
		kdvOran�=(tutar>1000)? 8 : 18;
		
		kdvTutar= tutar * kdvOran� ;
		
		kdvliTutar= tutar + kdvTutar;
		
		System.out.println("Kdv Dahil Tutar�n�z : " + kdvliTutar );
		
		
		
		
		
		
	
	
	}

}
