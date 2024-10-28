import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n1,n2;

        System.out.print("1.Sayıyı Giriniz: ");
        n1 = input.nextInt();
        System.out.print("2.Sayıyı Giriniz: ");
        n2 = input.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme ");
        System.out.print("Seçiminiz : ");

        int islem;
        islem = input.nextInt();

        switch (islem){
            case 1:
                System.out.println("Toplama: " + (n1+n2));
                        break;
            case 2:
                System.out.println("Çıkarma: " + (n1-n2));
                        break;
            case 3:
                System.out.println("Çarpma: " + (n1*n2));
                        break;
            case 4:
                System.out.println(n2 == 0 ? "Hata 0'a bölme yapamazsınız!" : "Sonuç: " + (n1/n2));
                        break;
            default:
                System.out.println("Yanlış seçim yaptınız tekrar deneyiniz. ");

        }


    }
}
