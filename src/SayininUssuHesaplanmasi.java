import java.util.Scanner;

public class SayininUssuHesaplanmasi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz: ");
        int sayi = inp.nextInt();

        System.out.println("4'ün Kuvvetleri: ");
        int i = 1;
        while (i <= sayi){
            System.out.println(i);
            i *= 4;
        }

        System.out.println("5'in Kuvvetleri: ");
        int j = 1;
        while (j <= sayi){
            System.out.println(j);
            j *= 5;
        }

    }
}
