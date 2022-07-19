package stringsDemo;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bug�n hava �ok g�zel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman say�s� : "+mesaj.length());
		System.out.println("5. eleman :"+mesaj.charAt(4));
		System.out.println(mesaj.concat("Ya�as�n!"));
		System.out.println(mesaj.startsWith("B")); //True-False de�er d�nd�r�r.
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0,4,karakterler,0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a')); //mesaja ba�tan ba�lar istenilen karakteri arar.
		System.out.println(mesaj.lastIndexOf('a')); //mesaja sondan ba�lar istenilen karakteri arar.
		
		
		String yeniMesaj = mesaj.replace(' ', '-'); //se�ilen karakteri se�ilen ba�ka bir karaktere �evirir.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,4));
		
		for(String kelime : mesaj.split(" ")) { //�ift t�rna��n i�ine bo�luk b�rakmazsak harf harf yazar.
			System.out.println(kelime );
		}
		
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim()); //mesajdaki ba�taki ve sonraki bo�luklar� siler.

	}

}
