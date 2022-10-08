import java.util.Scanner;
public class Odev9 {

    public static void main(String[] args) {
       
        Scanner klavye = new Scanner(System.in);
        
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = klavye.nextInt();
        
        
        for( int i=0;i<sayi; i++) {
        	for( int j=1;j<sayi-i; j++) {
        		System.out.print(" ");
        	}
        	for( int k=1;k<=2*i+1; k++) {	
        		System.out.print("*");
        	}
        	System.out.print("\n");
        }
        
        	
         for( int i=1;i<sayi; i++) {
             for( int j=1;j<=i; j++) {
             	System.out.print(" ");
             }
             for( int k=1;k<=2*(sayi-i)-1; k++) {	
             		System.out.print("*");
             }
             System.out.print("\n");
        
         }  	
        
	}

}