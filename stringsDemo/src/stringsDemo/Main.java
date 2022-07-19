package stringsDemo;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayýsý : "+mesaj.length());
		System.out.println("5. eleman :"+mesaj.charAt(4));
		System.out.println(mesaj.concat("Yaþasýn!"));
		System.out.println(mesaj.startsWith("B")); //True-False deðer döndürür.
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0,4,karakterler,0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a')); //mesaja baþtan baþlar istenilen karakteri arar.
		System.out.println(mesaj.lastIndexOf('a')); //mesaja sondan baþlar istenilen karakteri arar.
		
		
		String yeniMesaj = mesaj.replace(' ', '-'); //seçilen karakteri seçilen baþka bir karaktere çevirir.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,4));
		
		for(String kelime : mesaj.split(" ")) { //çift týrnaðýn içine boþluk býrakmazsak harf harf yazar.
			System.out.println(kelime );
		}
		
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim()); //mesajdaki baþtaki ve sonraki boþluklarý siler.

	}

}
