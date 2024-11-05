import java.util.Scanner;
public class TekSayiToplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number,total=0;

        do {
            System.out.println("Bir Sayı Giriniz: ");
            number = input.nextInt();

            if (number% 2 == 0 && number % 4 == 0){
                total += number;
            }

        }while (number % 2 == 0);
        System.out.println("Çift ve 4'ün katları olan sayıları toplamı: " + total);
    }
}
