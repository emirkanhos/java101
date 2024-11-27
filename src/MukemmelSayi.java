import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int number = inp.nextInt();

        int total = 0;

        for (int i = 1; i < number; i++){
            if (number % i == 0){
                total += i;
            }
        }
        if (total == number){
            System.out.print(number + " Mükemmel sayıdır.");
        }else {
            System.out.println("Mükemmel sayı değildir.");
        }
    }
}
