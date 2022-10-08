
	public class Odev11Coum2 implements Comparable<Odev11Coum2> {
	    String adi;
	    String soyadi;
	    int TcKimlikNo;
	    String bolumu;
	    double liseMezunOrt;
	    @Override
	    public int compareTo(Odev11Coum2 ort) {
	        return (int) (this.liseMezunOrt - ort.liseMezunOrt);
	    }
	    public Odev11Coum2() {
	    }
	    publicOdev11Coum2(String adi, String soyadi, int TcKimlikNo, String bolumu, double liseMezunOrt) {
	        this.soyadi = soyadi;
	        this.adi = adi;
	        this.TcKimlikNo = TcKimlikNo;
	        this.bolumu = bolumu;
	        this.liseMezunOrt = liseMezunOrt;
	    }
	    public String toString() {
	        return  this.adi + " " + this.soyadi + ": " +
	                this.TcKimlikNo + ", " + this.bolumu +": " +this.liseMezunOrt;
	    }
	    public static void main(String[] args) {
	    	Odev11Coum2 UO01 = new Odev11Coum2("Murat", "kılıc", 498736786, "hukuk", 89.5);
	    	Odev11Coum2 UO02 = new Odev11Coum2("Zeynep", "Arslan", 427382656, "Tip", 98.3);
	    	Odev11Coum2 UO03 = new Odev11Coum2("Ali", "Yavuz", 92642656, "ogretmen", 76.8);
	    	Odev11Coum2 UO04 = new Odev11Coum2("kasım", "Acar", 327582959, "Bilgisayar mühendisi", 89.4);
	    	Odev11Coum2 UO05 = new Odev11Coum2("muhammet", "kaya", 764235865, "eczacilik", 81.8);
	    	Odev11Coum2 [] uniOgrenci = { UO01, UO02, UO03, UO04, UO05};
	       System.out.println(Arrays.toString(uniOgrenci));
	            Arrays.sort(uniOgrenci);
	        System.out.println(Arrays.toString(uniOgrenci));
	 // buyukten kucuge siralansa
	        Arrays.sort(uniOgrenci, Collections.reverseOrder());
	        System.out.println(Arrays.toString(uniOgrenci));
	    }
	}