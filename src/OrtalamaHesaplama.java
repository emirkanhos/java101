import java.util.Scanner;
public class OrtalamaHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz : ");
        int sayi = inp.nextInt();
        int sayac = 0;
        int toplam = 0;

        for (int i=0; i <= sayi; i++){
            if (i%3==0 && i%4==0){
                toplam += i;
                sayac++;
            }
        }
        if (sayac > 0){
            double ortalama =(double) toplam / sayac;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        }else {
            System.out.println("3 ve 4'e tam bölünen bir sayı bulanamadı.");
        }
    }
}
