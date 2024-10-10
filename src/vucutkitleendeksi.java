import java.util.Scanner;

public class vucutkitleendeksi {

    public static void main(String[] args){

        double b,k,vke;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        b = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        k = input.nextDouble();

        vke = k/(b*b);

        System.out.print("Vücut Kitle İndeksiniz: " + vke);



    }
}
