	
import java.util.Scanner;
public class Odev6 {

	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lutfen bir metin giriniz, metni kelimelere ayisitirip kac kelimeden "
				+ "olustugunu ve her bir kelimeyi sirasi ile yaziniz");

		String cumle = klavye.nextLine();
		
		int baslangicIndex = 0;
		int tekrarSayisi= 0;
		
		for(int i = 0; i<cumle.length();i++)
		{
			if(cumle.charAt(i)==' ')
			{
				String kelime = cumle.substring(baslangicIndex,i);
		
				
				System.out.println(+(tekrarSayisi+1)+ " .kelime " + kelime);
				
				
				baslangicIndex=i+1;
				tekrarSayisi++;
			}
		}
		tekrarSayisi++;
		System.out.println(+(tekrarSayisi)+". kelime "  +cumle.substring(baslangicIndex,cumle.length()));
		
		System.out.println("Cumle " +(tekrarSayisi)+ " kelimeden olusur.");	
		
	}
}







	