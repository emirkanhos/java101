import java.util.Scanner;
public class NotOrtalamasiHesaplama {


    public static void main(String[] args){

        int matematik,fizik,kimya,turkce,tarih,muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz: ");
        matematik = input.nextInt();

        System.out.println("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();

        System.out.println("Turkce Notunuzu Giriniz: ");
        turkce = input.nextInt();

        System.out.println("Tarih Notunuzu Giriniz: ");
        tarih = input.nextInt();

        System.out.println("Muzik Notunuzu Giriniz: ");
        muzik = input.nextInt();

        int ortalama;
        double ortalamasonuc;

        ortalama = matematik+fizik+kimya+turkce+tarih+muzik;
        ortalamasonuc = ortalama / 6;

        System.out.println("Bütün derslerin ortalaması: " + ortalamasonuc);

        System.out.println(ortalamasonuc > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");


    }
}
