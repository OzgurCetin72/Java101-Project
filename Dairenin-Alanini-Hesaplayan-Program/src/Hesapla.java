import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r,a;
		double pi=3.14;
		double alan;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Yaricapini Giriniz : ");
		r=input.nextInt();
		
		System.out.println("Merkez Acinin Olcusunu Giriniz : ");
		a=input.nextInt();
		
		alan=(pi*(r*r)*a)/360;
		
		System.out.println("Dairenin Alaný : " + alan );
		
		

	}

}
