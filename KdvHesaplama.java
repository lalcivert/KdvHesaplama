package day01;
import java.util.Scanner;
public class KdvHesaplama {

    public static void main(String[] args) {

        double fiyat, oran1=0.18,oran2=0.08,KdvliFiyat,KdvTutar;
        Scanner input= new Scanner(System.in);
        System.out.println("ürün fiyatını giriniz: ");
        fiyat= input.nextDouble();

        if (fiyat<=1000){
            KdvTutar=fiyat*oran1;
            KdvliFiyat=fiyat+KdvTutar;
            System.out.println("KDV'siz tutar: "+fiyat);
            System.out.println("KDV oranı:"+oran1);
            System.out.println("KDV'li fiyat: "+KdvliFiyat);
        }

        else{
            KdvTutar=fiyat*oran2;
            KdvliFiyat=fiyat+KdvTutar;
            System.out.println("KDV'siz tutar: "+ fiyat);
            System.out.println("KDV oranı:"+oran2);
            System.out.println("KDV'li fiyat: "+KdvliFiyat);
        }






    }
}
