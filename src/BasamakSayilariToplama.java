import java.util.Scanner;
public class BasamakSayilariToplama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        int sayi = inp.nextInt();

        if(sayi < 0){
            sayi = -sayi;
        }
        int toplam = 0;

        while(sayi > 0){
            toplam += sayi % 10;
            sayi /= 10;
        }
        System.out.println("Basamakların Toplamı: " + toplam);
    }
}
