import java.util.Scanner;
public class EbobEkokBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        int n1 = inp.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int n2 = inp.nextInt();

        int i = 1;
        int minsayi;

        if (n1 > n2){
            minsayi = n2;
        }else {
            minsayi = n1;
        }
        while (minsayi > 0){
            if (n1 % minsayi == 0 && n2 % minsayi ==0){
                i = minsayi;
                break;
            }
            minsayi--;
        }
        System.out.println("EBOB: "+ minsayi);
        int ekok = (n1*n2)/i;
        System.out.println("EKOK: "+ekok);
    }
}
