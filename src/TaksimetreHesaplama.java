import java.util.Scanner;
public class TaksimetreHesaplama {

    public static void main(String[] args){

        int km;
        double fiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen Mesafeyi KM olarak giriniz: ");
        km = input.nextInt();

        fiyat = (km * 2.20) + 10;

        System.out.println("Toplam Tutar: " + (fiyat <20 ? 20 : fiyat));





    }
}
