
import java.util.Scanner;
public class Odev3 {
	
	public static void main(String [] args)
	{
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lutfen adresinizi giriniz: ");
		String adres = klavye.nextLine();

		String arananMahalle = "Mahallesi";
		String arananCadde = "Caddesi";
		String arananSokak = "Sokak";
		String Ankara = "Ankara";
		
		String Mahalle = adres.substring(0, adres.indexOf(arananMahalle));

		System.out.println("Mahalle ismi: "+ Mahalle);
		
		String Caddesi = adres.substring(adres.indexOf(arananMahalle)+arananMahalle.length(),
				adres.indexOf(arananCadde));
		System.out.println("Cadde ismi: "+ Caddesi);
		
		String Sokak = adres.substring(adres.indexOf(arananCadde)+arananCadde.length(),
				adres.indexOf(arananSokak));
		System.out.println("Sokak ismi: "+ Sokak);
		
		
		String İlce =  adres.substring(adres.indexOf(Ankara) -12, adres.indexOf(Ankara));
		System.out.println("ilce ismi: "+ İlce);
		
		String Sehir =  adres.substring(adres.indexOf(Sokak)+40, adres.indexOf(Sokak)+47);
		System.out.println("Sehir ismi: "+ Sehir);
	}
}