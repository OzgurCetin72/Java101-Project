import java.util.Scanner;

public class Giris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userName,password;
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Kullanici Adinizi Giriniz : ");
		userName=input.nextLine();
		
		System.out.println("Sifrenizi Giriniz : ");
		password=input.nextLine();
		
		if ((userName.equals("patika")) && (password.equals("java123"))) {
			
			System.out.println(" Giris Yaptiniz.. ");
			
		}else {
			
			System.out.println(" Bilgileriniz Yanlis.. ");
			
			System.out.println("Sifrenizi degistirmek ister misiniz? (evet/hayir) ");
			String cevap=input.nextLine();
			
			if (cevap.equals("evet")) {
				
				System.out.println(" Yeni Sifrenizi Giriniz : ");
				String newPassword=input.nextLine();
				
				if (!(newPassword.equals("java123"))) {
					
					  System.out.println(" Yeni sifreniz olusturuldu..");
					
				}else {
					 
					System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz..");
				}
				
				
			}else if (cevap.equals("hayir")) {
			
				System.out.println(" iyi günler dileriz.. ");
				
			}else {
				System.out.println(" Hatali cevap.. ");
			}
			
		}
		
		
		

	}

}
