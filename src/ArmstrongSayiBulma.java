import java.util.Scanner;
public class ArmstrongSayiBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        for (int sayi =100; sayi <=999; sayi++){
            int orijinalsayi = sayi;
            int toplam = 0;
            int tempSayi = sayi;

            while (tempSayi > 0){
                int basamak = tempSayi % 10;
                toplam += basamak * basamak * basamak;
                tempSayi /= 10;
            }
            if (toplam == orijinalsayi){
                System.out.println(orijinalsayi);
            }
        }



    }
}
