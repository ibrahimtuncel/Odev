import java.util.*;
public class Odev15 {
	//github
	String isim;
	String soyisim;
	String sicilNo;
	public static ArrayList<Odev15> calisan= new ArrayList<>();

	public Odev15 (String isim, String soyisim,  String sicilNo) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.sicilNo = sicilNo;
		Odev15.calisan.add(this);
	}
	public static void main(String[] args) {
		
		new Odev15( "Ahmet", "TUFAN", "1001");
		new Odev15( "Yavuz", "AKGUN", "1002");
		new Odev15( "Selim", "SUKUR", "1003");
		new Odev15( "Hurrem", "ERDEM","1004");
		new Odev15( "Buket", "KORKMAZ", "1005");
		new Odev15( "Betul", "OZTURK", "1006");
		new Odev15( "Hasan", "YILMAZ", "1007");
		new Odev15( "Kerem", "DEMIR", "1008");
		new Odev15( "Eysan", "KAYNAK", "1009");
		new Odev15( "Merve", "IKBAL", "1010");
		new Odev15( "Hakan", "BURUK", "1011" );
		
		arrayListYazdir(calisan);	
		}
		
	private static void arrayListYazdir(ArrayList<Odev15>calisan) {
		
		for(int i=0; i<calisan.size(); i++) {
			System.out.println(calisan.get(i).sicilNo+ " nolu calisanin adi:" +calisan.get(i).isim+ " soyadi: " 
					+calisan.get(i).soyisim);
	  }
	}
}
	
/*Bu odevde Calisan isimli bir sinif olusturacaksiniz. Calisan nesnelerinin adi soyadi ve sicilNo su bulunacak. 
Calisan sinifi icin constructor methodunu yazin.  Constructor icinde  her calisan nesnesini  static olarak olusturacaginiz 
ArrayListin icine saklayacak duzenlemeyi yapin. 

Main methodu icerisinde en az 10 tane calisan nesnesi olusturunuz. 
Olusturdugunuz butun calisanlarin bilgilerini ekrana yazdiran calisanYazdir methodunu yaziniz. 

Ornek Cikti:

1001 nolu calisanin adi: Fatma soyadi: Gul*/
