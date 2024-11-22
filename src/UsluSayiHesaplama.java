import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Üssü Alınacak Taban Sayıyı Giriniz: ");
        int n = inp.nextInt();
        System.out.println("Üssü Giriniz: ");
        int k = inp.nextInt();

        long total = 1;

        for (long i = 1; i<=k;  i++){
            total = total * n;
        }
        System.out.println("Sonuç: " + total);
        // long kullanılmasının sebebi yüksek hesaplamalar için
    }
}
