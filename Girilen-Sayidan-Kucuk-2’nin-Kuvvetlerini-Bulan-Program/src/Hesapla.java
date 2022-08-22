import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("lütfen bir sayi giriniz : ");
		int sayi =input.nextInt();
		
		System.out.println("4'un kuvvetleri : ");
		for (int i = 1; i <=sayi; i*=4) {
			System.out.println(i);
			
		}
		
		System.out.println("5'in kuvvetleri : ");
		for (int i = 1; i <=sayi; i*=5) {
			System.out.println(i);
			
		}

	}

}
