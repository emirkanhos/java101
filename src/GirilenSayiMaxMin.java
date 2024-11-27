import java.util.Scanner;
public class GirilenSayiMaxMin {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? : ");
        int n = inp.nextInt();
        System.out.print("1.Sayıyı Giriniz: ");
        int firstnumber = inp.nextInt();
        int min = firstnumber;
        int max = firstnumber;

        for (int i=2; i<=n; i++){
            System.out.print(i+".Sayıyı Giriniz: ");
            int number = inp.nextInt();
            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

    }
}
