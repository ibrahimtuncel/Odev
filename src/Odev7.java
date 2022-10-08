import java.util.Scanner;
public class Odev7 {

    public static void main(String[] args) {
       
        Scanner klavye = new Scanner(System.in);
        
        System.out.println("Bir sayi dizisi girer misiniz?");
        
       
        int[] sayiDizisi = {2,5,6,2,2,4,5,8,6,6,1};
       
        
        for(int i=0;i<sayiDizisi.length-1;i++)
        {
            if(sayiDizisi[i]<sayiDizisi[i+1])
            {
                System.out.println(+i+1 +". siradaki " +sayiDizisi[i]+ " < " +(i+2) + ". siradaki " +sayiDizisi[i+1]);
                
            }
            else if (sayiDizisi[i]>sayiDizisi[i+1])
            {
            	System.out.println(+i+1 +". siradaki " +sayiDizisi[i]+ " > " +(i+2) + ". siradaki " +sayiDizisi[i+1]);
            }
            else if (sayiDizisi[i]==sayiDizisi[i+1])
            {
            	System.out.println(+i+1 +". siradaki " +sayiDizisi[i]+ " = " +(i+2) + ". siradaki " +sayiDizisi[i+1]);
            }
        }
        
    }
}
