import java.util.Scanner;

public class PalindromSayi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();

        if (palindrom(sayi)){
            System.out.println(sayi + " bir palindrom sayıdır.");
        }else {
            System.out.println(sayi + " bir palindrom sayı değildir.");
        }

    }
    public static boolean palindrom(int sayi){

        int temp = sayi;
        int terssayi = 0;
        while(temp !=0){
            int kalan = temp % 10;
            terssayi = terssayi * 10 + kalan;
            temp /= 10;
        }
        return sayi == terssayi;
    }
}
