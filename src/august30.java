import java.util.Scanner;
public class august30 {
	
    public static void main(String[] args) {
       
        Scanner klavye = new Scanner(System.in);
        
        
        System.out.println("Lutfen yasinizi ve cinsiyetinizi giriniz");

        int yas= klavye.nextInt();

        char cinsiyet = klavye.next().toUpperCase().charAt(0);

        String sonuc = cinsiyet== 'K' ? (yas>60 ? ("emekli") : ("calismali")	)  :  (yas>65 ? ("emekli") : ("calismali")) ;
	
	
        System.out.println(sonuc);
    
    
  
    } 
    
} 