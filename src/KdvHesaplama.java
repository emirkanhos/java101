import java.util.Scanner;

public class KdvHesaplama {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double tutar;
        System.out.print("Ürünün tutarını giriniz: ");
        tutar = input.nextDouble();

        double kdvorani = tutar <=1000 ? 18 : 8;
        System.out.println("KDV Oranı:" + kdvorani);

        double kdvlifiyat = ((kdvorani * tutar)/100) + tutar;
        System.out.println("KDV'li Fiyat: " + kdvlifiyat);

        double kdvsizfiyat = tutar;
        System.out.println("KDV'siz Fiyat: " + kdvsizfiyat);

    }


}
