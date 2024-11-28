import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç elemanlı fibonacci serisi olsun ?: ");
        int n = inp.nextInt();

        if (n<=0){
            System.out.println("Lütfen 0'dan büyük bir sayı girin");
        } else if (n == 1) {
            System.out.println("Fibonacci Serisi: 0");
        }else {
            System.out.print("Fibonacci Serisi: ");
            int number1 = 0, number2 = 1;
            System.out.println(number1 + " " + number2);

            for (int i = 3; i<= n; i++){
                int total = number1 + number2;
                System.out.print(" " + total);
                number1 = number2;
                number2 = total;
            }
            System.out.println();
        }

    }
}
