package m�kemmelSayi;

public class Main {

	public static void main(String[] args) {
		// 6 -> 1, 2, 3 = toplam� 6 eder
		int number=8128;
		int sonuc=0;
		
		if(number==1) {
			System.out.println(number+ " bir m�kemmel say� de�ildir");
			return;
		}
		
		if(number<=0) {
			System.out.println(number+ " ge�ersiz say� girdiniz");
			return;
		}
		
		
		for(int i=1; i<number; i++) {
			if(number % i==0) {
				sonuc=sonuc+i;
				//System.out.println(sonuc); b�lenlerine bakmak i�in kontrol ama�l� kullan�labilir.
			}
		}
		if(number==sonuc) {
			System.out.println(number+ " bir m�kemmel say�d�r");
		}else {
			System.out.println(number+ " bir m�kemmel say� de�ildir");
		}

		

	}

}
