
import java.util.Scanner;
public class Odev8{

	
	public static void main(String [] args)
	{
		Scanner klavye = new Scanner(System.in);
		System.out.println("ters cevirmek istediginiz kelimeyi giriniz");
		String metin = klavye.nextLine();
		
		
				
				for(int i=metin.length()-1;i>=0; i--)	
				{
					System.out.print(metin.charAt(i)); 
				}
				
				//for(int i=0;i<metin.length()-1;i++) yerine
				
				// yada  tersMetin+= metin.charAt(metin.length()-(i+1));
				
			// yada StringBuffer metin = new StringBuffer(girilenMetin);
				//System.out.println(metin.reverse);
				}
	}