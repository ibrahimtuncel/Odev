import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//import java.io.*;


public class Odev16 {
	public static final File notDefteri = new File("src/Urunler");
	 
	 
	/*File Input/Output Odevi
	
	Bu odevde, bir manav isletmesi icin Urun sinifi olusturacaksiniz. Sinifiniz main() methodu icerisinde size 
	verilen urunler.txt dosyasindaki sebze ve meyveleri okuyacak ve her bir tur icin bir nesne olusturacaksiniz. 
 istendiginde depoda bulunan tum urunleri gosterecek ve perakende satis yapildikca urun miktarini azaltacaksiniz. 
 Urunlerin perakende satis fiyati, urunler.txt dosyasinda verilen alis_fiyatinin iki kati olacaktir.
 a= str.get.text;
 b= str.setTeks;
 
 StringTokenizer
 */
	
		public static void main(String[] args) {
			
			String a="Domates";
			String b="Muz";
			String c="Elma";
			String d="Uzum";
			String e="Salatalik";
			String f="Incir";
			String g="Mantar";
			String h="Havuc";
			String i="Ispanak";
			String j="Brokoli";
			String k="Karanabahar";
			String l="Patates";
			String m="Sogan";
			String n="Pirasa";
						
			
			 System.out.println("urun secmek ve almak istenilen miktari girmek icin 1e basiniz. ");
		        System.out.println("Cikmak icin 2e basiniz: ");
		        
		        Scanner klavye = new Scanner(System.in);
		        int tercih = klavye.nextInt();

		        while (tercih != 2) {
		            switch (tercih) {
		            case (1): {
		                System.out.println("urulerimis :"+ a+", "+b+", "+c+", "+d+", "+e+", "+f+", "+g+", "
		            +h+", "+i+", "+j+", "+k+", "+l+", "+m+", "+n);
		                String urunAdi = klavye.next();
		                System.out.println("almak istenilen miktari giriniz");
		                int kg = klavye.nextInt();
		                urunSat(urunAdi, kg);

		                break;
		            }
		          
		            case (2): {
		            	//System.out.println("tesekkurler");
		            	break;
		            	
		            }
		            }

		            if (tercih != 2) {
		            	 System.out.println("urun secmek ve almak istenilen miktari girmek icin 1e basiniz. ");
		 		        System.out.println("Cikmak icin 2e basiniz: ");
		                tercih = klavye.nextInt();
		            }
		        }
		}   
		    

		
		public static void urunSat(String urunAdi, int kg) {
			
			 try {
		            BufferedReader okuyucu = new BufferedReader(new FileReader(notDefteri));
			
				String metin = "";
				String satir = "";
				boolean urunBulunduMu = false;
				while ((satir = okuyucu.readLine()) != null) {
					System.out.println(satir);
					
					 String satirYedek = satir.replace("\t", "");
	                  satirYedek = satirYedek.replace(" ", "");
	                  String[] notDizisi = satirYedek.split(",");
	                  
	                  for (int i=0; i<notDizisi.length;i++) {
	                	  System.out.println(notDizisi[i]);
	                  }
					int cizgiSayaci = 0;
		                if (satirYedek.substring(0, urunAdi.length()).equals(urunAdi)) {
		                    urunBulunduMu = true;
		                   
		                        for (int i = 0; i < satir.length(); i++) {
		                            if (satir.charAt(i) == ',') {
		                                cizgiSayaci++;
		                               
		                                
		                            }
		                        }
		                        if (cizgiSayaci==1) {
		                        	System.out.println("urun tamam");
		     
		                        }
				
				 
                  
                 for( int j=0;j<notDizisi.length;j++) {
                	 if (notDizisi[j]==urunAdi) {
                		 
               
                      System.out.println("Ogrencinin onceki sinavlari girilmeden yeni sinav notu eklenemez");
                	 } 
              }
          }
          metin += satir + "\n";
				}  
				 if (!urunBulunduMu) {
		                System.out.println("Girilen ogrenci numarasi tasiyan bir ogrenci bulunamadi!");
		            }
		            okuyucu.close();
		            
		            
		            BufferedWriter yazici = new BufferedWriter(new FileWriter(notDefteri));
		            yazici.write(metin);
		            yazici.close();
			 } catch (IOException ioe) {
		        	System.out.println("IOException hatasi var.");
		        }
		     
		    }
		}

			 
			 
			
	

	


