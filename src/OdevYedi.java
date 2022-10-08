
import java.util.Scanner;
public class OdevYedi {

    public static void main(String[] args) {
       
        Scanner klavye = new Scanner(System.in);
        
        System.out.println("Bir sayi dizisi girer misiniz?");
        
       
        int[] sayiDizisi = {1,4,5,6,1,3,5,9,0,6,2,6,7};
        
//        int arrayUzunlugu =  klavye.nextInt();
//        int []sayiArrayi = new int [arrayUzunlugu];
        
        	//sayiArrayi[1] = klavye.nextInt();
        
        //System.out.println(sayiArrayi[1]+ ",");
        
        
        
        
        for(int i=1;i<sayiDizisi.length-1;i++)
        {
            if(sayiDizisi[i-1] <sayiDizisi[i]) 
           
			if(sayiDizisi[i+1]<sayiDizisi[i])
            {
            	System.out.println("Index " +i+ " deki " +  +sayiDizisi[i]+ " sayisi, Index " +(i-1)+ " deki "  
            +sayiDizisi[i-1]+ " sayisindan ve Index " +(i+1)+ " deki "+  +sayiDizisi[i+1]+ " sayisidan daha buyuktur.") ;
            }
            
        }
        
    }
}

