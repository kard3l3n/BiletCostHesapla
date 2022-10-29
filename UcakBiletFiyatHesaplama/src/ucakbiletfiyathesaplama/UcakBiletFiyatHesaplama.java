package ucakbiletfiyathesaplama;
import java.util.Scanner;
import java.math.*;
public class UcakBiletFiyatHesaplama {
    public static void main(String[] args) {
        int km,yas,gidisTipi;
        double kmbasi=0.10,normaltutar,indirim;
        
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Km:");
        km=input.nextInt();
       
        System.out.println("yas:");
        yas=input.nextInt();
        
        System.out.println("gidisTipi((tek yon => 1)/(cift yön => 2)):");
        gidisTipi=input.nextInt();
        
         if(km<0 || yas<0){
             System.out.println("Hatalı veri girdiniz");
         }
         else if(gidisTipi!=1 && gidisTipi!=2){
             System.out.println("Hatalı veri girdiniz");
         }
         else{
             normaltutar=km*kmbasi;
             System.out.println(normaltutar);
             if(yas<12){
                 indirim=normaltutar*(0.5);
                 normaltutar=normaltutar-indirim;
                 System.out.println(normaltutar);
             }
             if(yas>=12 && yas<=24){
                 indirim=normaltutar*(0.1);
                 normaltutar=normaltutar-indirim;
                 System.out.println(normaltutar);
             }
             if(yas>65){
                 indirim=normaltutar*(0.3);
                 normaltutar=normaltutar-indirim;
                 System.out.println(normaltutar);
             }
             if(gidisTipi==2){
                 indirim=normaltutar*(0.2);
                 normaltutar=normaltutar-indirim;
                 normaltutar=normaltutar*2;
                 System.out.println(normaltutar);
             }
             
             
             
         }
        
        
        
    }
    
}
