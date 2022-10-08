public class Odev12{
	
	String ID;
	String isim;
	String soyisim;
	double vize1;
	double vize2;
	double donemSonu;
	double finalNotu;
	

	public Odev12(String ID, String isim, String soyisim, double vize1, double vize2, double donemSonu) {
		
		this.ID = ID;
		this.isim = isim;
		this.soyisim = soyisim;
		this.vize1 = vize1;
		this.vize2 = vize2;
		this.donemSonu = donemSonu;
		this.finalNotu= (double) ((vize1 * 0.25) +  (vize2 * 0.25) + (donemSonu* 0.5));
		
	}
	
	public static void main(String[] args) {

		Odev12 ogr1 = new Odev12("1001", "Ahmet", "TUFAN", 50, 60, 95);
		Odev12 ogr2 = new Odev12("1002", "Yavuz", "AKGUN", 75, 60, 55);
		Odev12 ogr3 = new Odev12("1003", "Selim", "SUKUR", 95, 85, 92);
		Odev12 ogr4 = new Odev12("1004", "Hurrem", "ERDEM", 65, 65, 98);
		Odev12 ogr5 = new Odev12("1005", "Buket", "KORKMAZ", 95, 70, 70);
		Odev12 ogr6 = new Odev12("1006", "Betul", "OZTURK", 30, 60, 74);
		Odev12 ogr7 = new Odev12("1007", "Hasan", "YILMAZ", 40, 65, 25);
		Odev12 ogr8 = new Odev12("1008", "Kerem", "DEMIR", 66, 99, 55);
		Odev12 ogr9 = new Odev12("1009", "Eysan", "KAYNAK", 98, 70, 60);
		Odev12 ogr10 = new Odev12("1011", "Merve", "IKBAL", 81, 60, 95);
		Odev12 ogr11 = new Odev12("1012", "Hakan", "BURUK", 87, 80, 80);
	
		Odev12[] ogrenciler = { ogr1, ogr2, ogr3, ogr4, ogr5, ogr6, ogr7, ogr8, ogr9, ogr10, ogr11 };
		
		
		Odev12[] siraliDizi = ogrenciyiSirala(ogrenciler);
		
		for (int i = 0; i < siraliDizi.length; i++) {
			System.out.println("Basari sirasina gore "+(i+1)+ ". ogrenci "+siraliDizi[i].isim+" " +siraliDizi[i].soyisim+ " final notu " + 
		siraliDizi[i].finalNotu);
		}
	}

	

	public static Odev12[] ogrenciyiSirala(Odev12[] dizi) {
		
			for (int j= 0; j < dizi.length; j++) {
            	Odev12 enBuyuk= dizi[j];
            	int ogrenciSirasi= j;
            
            	 for (int i= j; i < dizi.length; i++) {
                if (dizi[i].finalNotu > enBuyuk.finalNotu) {
                    enBuyuk = dizi[i];
                     ogrenciSirasi = i;
    	}
            	 }     
            	 dizi[ogrenciSirasi]= dizi[j];
            	 dizi[j]= enBuyuk;
			
			}
			return dizi;			
		}			
}		
	
		
