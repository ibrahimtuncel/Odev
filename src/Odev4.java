
import java.util.Scanner;
public class Odev4 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir tek sayi girer misiniz?");
		int girilenSayi = klavye.nextInt();
		
		int [] tekSayiDizi = new int[(girilenSayi)/2+1];
		
		int ilkSayi = girilenSayi;
		int index = 0;
		
		while(ilkSayi>=1)
		{
			tekSayiDizi[index]=ilkSayi;
			ilkSayi = ilkSayi-2;
			index = index +1;
		}
		index = 0;
		while(index<=tekSayiDizi.length-1)
		{
			System.out.print(tekSayiDizi[index]+", ");
			index = index+1;
		}
	}

}