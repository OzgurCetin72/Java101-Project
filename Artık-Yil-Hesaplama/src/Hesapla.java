import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int yil;

		Scanner input = new Scanner(System.in);

		System.out.println("Y�l Giriniz : ");
		yil = input.nextInt();

		// oncelikle 100'un kati olup olmadigini kontrol ediyoruz.
		double hesap1 = yil % 100;

		if (hesap1 == 0) {

			// 100'un kati ise 400'e tam bolunup bolunmedigine bakiyoruz.
			double hesap2 = yil % 400;

			if (hesap2 == 0) {

				System.out.println(yil + " bir artik yildir ! ");
			} else {

				System.out.println(yil + " bir artik yil degildir ! ");
			}

		} else {

			// 100'un kati degil ise 4'e tam bolunup bolunmedigine bak�yoruz.
			double hesap3 = yil % 4;

			if (hesap3 == 0) {

				System.out.println(yil + " bir art�k yildir ! ");
			} else {

				System.out.println(yil + " bir art�k yil degildir ! ");
			}
		}

	}

}
