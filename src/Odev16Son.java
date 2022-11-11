
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Odev16Son {
    String adi;
    double miktar;
    double alisFiyati;
    static File urunler = new File("src/urunler");
    static File indirimler = new File("src/Odev16Indirim_Orani");
    static ArrayList<Odev16Son> urunListesi = new ArrayList<Odev16Son>();
    static double kasa = 0;erm

    public Odev16Son(String adi, double miktar, double alisFiyati) {
        this.adi = adi;
        this.miktar = miktar;
        this.alisFiyati = alisFiyati;
    }

    public static void main(String[] args) {
       
        satisYap("Sogan", 5);
        siparisVer("Muz", 10, 100000);

        satisYap("Incir", 2);
        satisYap("Domates", 4);
        satisYap("Muz", 2);

        satisYap("Pirasa", 1);
        satisYap("Mantar", 15);
        depoyuSay();

    }

    public static void siparisVer(String ad, double miktar, double siparisFiyati) {
        boolean urunVarMi = false;
        for (Odev16Son urun : urunListesi) {
            if (urun.adi.equals(ad)) {
                urunVarMi = true;
                urun.miktar += miktar;
                double satisTutari = (urun.alisFiyati) * miktar;
                kasa -= satisTutari;
                System.out.println(ad + " urununden " + miktar + "KG siparis verilmistir");
                System.out.println("Toplam tutar: " + satisTutari + "\n" + "Kasada " + kasa + "TL var");
                urunVarMi = true;
                break;
            }
        }
        if (!urunVarMi) {
            try {
                BufferedWriter yazici = new BufferedWriter(new FileWriter(urunler, true));

                yazici.write(ad + ", " + miktar + "KG, " + siparisFiyati + "\n");
                yazici.close();
                System.out.println(ad + " urununden " + miktar + "KG siparis verilmistir");
            } catch (IOException ioe) {

            }
        }
        if (urunVarMi) {
            try {
                BufferedReader okuyucu = new BufferedReader(new FileReader(urunler));
                String line = "";
                String yeniMetin = "";
                while ((line = okuyucu.readLine()) != null) {
                    String yeniSatir = line.replace(" ", "");
                    String[] satirDizisi = yeniSatir.split(",");
                    if (satirDizisi[0].equals(ad)) {
                        double eskiMiktar = Double.parseDouble(satirDizisi[1].substring(0, 2));
                        double yeniMiktar = eskiMiktar + miktar;
                        double alisFiyati = Double.parseDouble(satirDizisi[2]);
                        yeniMetin += satirDizisi[0] + ", " + yeniMiktar + "KG, " + alisFiyati + "\n";
                    } else {
                        yeniMetin += line + "\n";
                    }
                }
                okuyucu.close();
                BufferedWriter yazici = new BufferedWriter(new FileWriter(urunler));
                yazici.write(yeniMetin);
                yazici.close();
            } catch (IOException ioe) {

            }
        }

    }

    public static void depoyuSay() {
        try {
            BufferedReader okuyucu = new BufferedReader(new FileReader(urunler));
            String line = "";

            while ((line = okuyucu.readLine()) != null) {
                line = line.replace(" ", "");
                String[] satirDizisi = line.split(",");
                double miktar = Double.parseDouble(satirDizisi[1].substring(0, 2));
                double alisFiyati = Double.parseDouble(satirDizisi[2]);
                urunListesi.add(new Odev16Son(satirDizisi[0], miktar, alisFiyati));
            }
            okuyucu.close();
            
        
        } catch (IOException ioe) {
            System.out.println("Dosya bulunamadi");
        }
    }

    public static void satisYap(String ad, double miktar) {
        double indirimOrani = 0;
        try {
            BufferedReader okuyucu = new BufferedReader(new FileReader(indirimler));
            String line = "";
            String yeniMetin = "";
            while ((line = okuyucu.readLine()) != null) {

                String[] satirDizisi = line.split(" ");
                if (satirDizisi[0].equals(ad)) {
                    indirimOrani = Double.parseDouble(satirDizisi[1]);
                    break;
                }
            }
        } catch (IOException ioe) {

        }
        boolean urunVarMi = false;
        boolean yeteriKadarUrunVarMi = false;
        for (Odev16Son urun : urunListesi) {
            if (urun.adi.equals(ad)) {
                urunVarMi = true;
                if (urun.miktar > miktar) {
                    yeteriKadarUrunVarMi = true;
                    urun.miktar -= miktar;
                    double satisTutari = (urun.alisFiyati * 2) * miktar * (1.0 - indirimOrani);
                    kasa += satisTutari;
                    if (indirimOrani > 0)
                        System.out.println(
                                ad + " urununden " + miktar + "KG " + indirimOrani + " indirim ile satilmistir");
                    else
                        System.out.println(ad + " urununden " + miktar + "KG satilmistir");
                    System.out.println("Toplam tutar: " + satisTutari + "\n" + "Kasada " + kasa + "TL var");

                    urunVarMi = true;
                    break;
                }
            }
        }
        if (!urunVarMi) {
            System.out.println("Elimizde " + ad + " bulunmamaktadir");
        }

        else if (!yeteriKadarUrunVarMi) {
            System.out.println("Elimizde yeteri kadar " + ad + " bulunmamaktadir");
        }
        if (urunVarMi && yeteriKadarUrunVarMi) {
            try {
                BufferedReader okuyucu = new BufferedReader(new FileReader(urunler));
                String line = "";
                String yeniMetin = "";
                while ((line = okuyucu.readLine()) != null) {
                    String yeniSatir = line.replace(" ", "");
                    String[] satirDizisi = yeniSatir.split(",");
                    if (satirDizisi[0].equals(ad)) {
                        double eskiMiktar = Double.parseDouble(satirDizisi[1].substring(0, 2));
                        double yeniMiktar = eskiMiktar - miktar;
                        double alisFiyati = Double.parseDouble(satirDizisi[2]);
                        yeniMetin += satirDizisi[0] + ", " + yeniMiktar + "KG, " + alisFiyati + "\n";
                    } else {
                        yeniMetin += line + "\n";
                    }
                }
                okuyucu.close();
                BufferedWriter yazici = new BufferedWriter(new FileWriter(urunler));
                yazici.write(yeniMetin);
                yazici.close();
            } catch (IOException ioe) {

            }
        }

    }
}
