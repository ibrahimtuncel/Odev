
public class Odev11 {

    String isim;
    String soyisim;
    String TCNo;
    String bolumu;
    double mezuniyetOrtalamasi ;
    
    
    public Odev11 (String isim, String soyisim, String TCNo, String bolumu , double mezuniyetOrtalamasi) {
    	
        this.isim = isim;
        this.soyisim = soyisim;
        this.TCNo = TCNo;
        this.bolumu= bolumu;
        this.mezuniyetOrtalamasi= mezuniyetOrtalamasi; 
    }

    public static void main(String[] args) {

        Odev11 ogr1 = new Odev11("Burak", "YILMAZ", "123456789", "Egitim", 90);
        Odev11 ogr2 = new Odev11("Hande", "YENER", "155525225",  "Tip", 98);
        Odev11 ogr3 = new Odev11("Arda", "TURAN", "1119754822",  "Muhendislik", 88);
        Odev11 ogr4 = new Odev11("Ali", "Kaya", "45318122",  "Psikoloji", 68);
        Odev11 ogr5 = new Odev11("Elif", "KARA", "231845552",  "Mimarlik", 77);
        
        Odev11[] ogrenciler = { ogr1, ogr2, ogr3, ogr4, ogr5 };
        
        Odev11[] siraliDizi = diziyiSirala(ogrenciler);

      
        for(int i = 0; i < ogrenciler.length; i++) {
        	
        	
        	
        	System.out.println("Basari sirasina gore "+(i+1)+ ". ogrenci "+siraliDizi[i].isim+ " "+ "ortalamasi "+ siraliDizi[i].mezuniyetOrtalamasi);
            
        }
    }
    	public static Odev11[] diziyiSirala(Odev11[] dizi) {

            for (int j= 0; j < dizi.length; j++) {
            	Odev11 enBuyuk= dizi[j];
            	int ogrenciSirasi= j;
            
            	 for (int i= j; i < dizi.length; i++) {
                if (dizi[i].mezuniyetOrtalamasi > enBuyuk.mezuniyetOrtalamasi) {
                    enBuyuk = dizi[i];
                     ogrenciSirasi = i;
    	}
            
            	 }      
            	 dizi[ogrenciSirasi]= dizi[j];
            	 dizi[j]= enBuyuk;
            	
        }
       
        return dizi;
        
    	}
    	
       // public static void diziyiYazdir(int[] dizi) {
           // for (int i = 0; i < dizi.length; i++) {
               // System.out.println((i + 1) + ". eleman:\t" + dizi[i]);
	//}
    	

				
				
        

	
  
		
        	//}
        	}
     
        
        	
