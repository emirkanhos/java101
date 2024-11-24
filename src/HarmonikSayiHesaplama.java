import java.util.Scanner;
public class HarmonikSayiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("N sayısını giriniz: ");
        int n = inp.nextInt();
        double sonuc=0.0;
        for (double i = 1; i<= n ; i++){
            sonuc += (1/i);

        }
        System.out.println(sonuc);

    }

}
