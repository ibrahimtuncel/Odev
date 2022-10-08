	import java.util.Scanner;
	public class Odev10 {
	    public static void main(String[] args) {
	       
	        Scanner klavye = new Scanner(System.in);
	        
	        System.out.println("Lutfen bir sayi giriniz");
	        int sayi = klavye.nextInt();
	        
	        boolean ilkSatirMi = true;
	        boolean sonSatirMi = false;
	        
	        for( int i=0;i<sayi; i++) {
	        	for( int j=1;j<sayi-i; j++) 
	        	{
	        		System.out.print(" ");
	        	}
	        	System.out.print("*");
	        		
	        	for( int k=1;k<=2*i-1; k++) {	
	        		System.out.print(" ");
	        	}
	        	
	        	if (ilkSatirMi) {
	        		System.out.println(" ");	
	        	} else {
	        	System.out.println("*");
	        }
	        	ilkSatirMi = false;
	        }  	
	        
	        
	        for( int i=1;i<sayi; i++) {
	        	if(i== sayi-1) {
	        		sonSatirMi = true;	
	        	}
	        	for( int j=0;j<i; j++) 
	        	{
	        		System.out.print(" ");
	        	}
	        	System.out.print("*");
	        	
	        	for( int k=1;k<=2*(sayi-i)-3; k++) {	
	        		System.out.print(" ");
	        	}
	        	if (!sonSatirMi) {
	        		System.out.println("*");	
	        	} else {
	        	System.out.println(" ");
	        }
	        	
	        }  	
	    } 
	    
	   
       

	} 