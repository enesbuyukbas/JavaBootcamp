package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[3];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Enes";
		ogrenciler[2]="Serdar";
		//ogrenciler[3]="Hidayet";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("--------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		

	}

}
