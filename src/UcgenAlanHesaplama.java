import java.util.Scanner;

public class UcgenAlanHesaplama {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double a,b,c;


        System.out.print("1.Kenarı Girin: ");
        a = input.nextInt();

        System.out.print("2.Kenarı Girin: ");
        b = input.nextInt();

        System.out.print("3.Kenarı Girin: ");
        c = input.nextInt();

        double cevre,d;

        d = (a+b+c)/2;
        cevre = 2*d;
        System.out.println("Üçgenin Çevresi: " + cevre);

        double alan;

        alan = Math.sqrt(d *(d-a)*(d-b)*(d-c));

        System.out.println("Üçgenin Alanı: " + alan);

    }
}
