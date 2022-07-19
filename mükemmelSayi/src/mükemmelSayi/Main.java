package mükemmelSayi;

public class Main {

	public static void main(String[] args) {
		// 6 -> 1, 2, 3 = toplamı 6 eder
		int number=8128;
		int sonuc=0;
		
		if(number==1) {
			System.out.println(number+ " bir mükemmel sayı değildir");
			return;
		}
		
		if(number<=0) {
			System.out.println(number+ " geçersiz sayı girdiniz");
			return;
		}
		
		
		for(int i=1; i<number; i++) {
			if(number % i==0) {
				sonuc=sonuc+i;
				//System.out.println(sonuc); bölenlerine bakmak için kontrol amaçlı kullanılabilir.
			}
		}
		if(number==sonuc) {
			System.out.println(number+ " bir mükemmel sayıdır");
		}else {
			System.out.println(number+ " bir mükemmel sayı değildir");
		}

		

	}

}
