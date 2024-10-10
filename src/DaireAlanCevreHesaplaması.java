import java.util.Scanner;
public class DaireAlanCevreHesaplaması {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int r;
        double pi=3.14,a,alan,dairealan,dairecevre;


        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = input.nextInt();

        System.out.print("Merkez Açı Ölçüsünü Giriniz: ");
        a = input.nextDouble();

        dairealan = pi*r*r;
        dairecevre = 2*pi*r;

        System.out.println("Dairenin Alanı: " + dairealan);
        System.out.println("Dairenin Çevresi: " + dairecevre);

        alan = ((pi*(r*r)*a)/360);
        System.out.println("Daire Diliminin Alanı: " + alan);



    }
}
