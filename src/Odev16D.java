import java.io.*;

import java.util.ArrayList;

public class Odev16D {

   String adi;

   double miktar;

   double alisFiyati;

   static File urunler = new File("src/urunler");

   static ArrayList<Odev16D> urunListesi = new ArrayList<Odev16D>();

   static double kasa = 0;

   public Odev16D(String adi, double miktar, double alisFiyati)

   {

       this.adi = adi;

       this.miktar = miktar;

       this.alisFiyati = alisFiyati;

   }

   public static void main(String[] args) {

       depoyuSay();

       satisYap("Incir",2);

       satisYap("Domates",32);

       satisYap("Muz",2);

       satisYap("Pirasa",1);

       satisYap("Mantar",15);
       
       satisYap("Elma",28);

   }

   public static void depoyuSay()

   {

       try {

           BufferedReader okuyucu = new BufferedReader(new FileReader

               (urunler));

           String line = "";

           

           while((line = okuyucu.readLine())!=null)

           {

               line=line.replace(" ","");

               String[] satirDizisi = line.split(",");

               double miktar = Double.parseDouble

                       (satirDizisi[1].substring(0,2));

               double alisFiyati = Double.parseDouble(satirDizisi[2]);

               urunListesi.add(new Odev16D(satirDizisi[0],miktar

                       ,alisFiyati));

           }

           okuyucu.close();

           

       }

       catch(IOException ioe)

       {

           System.out.println("Dosya bulunamadi");

       }

   }

   public static void satisYap(String ad, double miktar)

   {

       boolean urunVarMi =false;

       boolean yeteriKadarUrunVarMi=false;

       for(Odev16D urun : urunListesi)

       {

           if(urun.adi.equals(ad))

           {

               urunVarMi = true;

               if(urun.miktar>miktar) {

                   yeteriKadarUrunVarMi=true;

                   urun.miktar-=miktar;

                   double satisTutari = (urun.alisFiyati*2)*miktar;

                   kasa += satisTutari;

                   System.out.println(ad+" urununden "+miktar+"KG satilmistir");

                   System.out.println("Toplam tutar: "+satisTutari+"\n"

                           +"Kasada "+kasa+"TL var");

                   

                   urunVarMi = true;

                   break;

               }

           }

       }

       if(!urunVarMi)

       {

           System.out.println("Elimizde "+ad+" bulunmamaktadir");

       }

       

       else if(!yeteriKadarUrunVarMi)

       {

           System.out.println("Elimizde yeteri kadar "+ad+" bulunmamaktadir");

       }

       if(urunVarMi&&yeteriKadarUrunVarMi)

       {

           try {

               BufferedReader okuyucu = new BufferedReader(new FileReader

                   (urunler));

               String line = "";

               String yeniMetin ="";

               while((line = okuyucu.readLine())!=null)

               {

                   String yeniSatir=line.replace(" ","");

                   String[] satirDizisi = yeniSatir.split(",");

                   if(satirDizisi[0].equals(ad))

                   {

                       double eskiMiktar = Double.parseDouble

                               (satirDizisi[1].substring(0,2));

                       double yeniMiktar=eskiMiktar-miktar;

                       double alisFiyati = Double.parseDouble(satirDizisi[2]);

                       yeniMetin+=satirDizisi[0]+", "+yeniMiktar+"KG, "+

                               alisFiyati+"\n";

                   }

                   else

                   {

                       yeniMetin+=line+"\n";

                   }

               }

               okuyucu.close();

               BufferedWriter yazici = new BufferedWriter(new 

                       FileWriter(urunler));

               yazici.write(yeniMetin);

               yazici.close();

           }

           catch(IOException ioe)

           {

               

           }

       }

       

   }



}