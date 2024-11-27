import java.util.Scanner;
public class AsalSayilar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        for (int number = 2; number <=100; number++){
            int bolensayi = 0;
            for (int i = 2; i < number; i++){
                if (number % i == 0){
                    bolensayi++;
                    break;
                }
            }
                if (bolensayi == 0){
                System.out.println(number + " ");
            }
        }

    }
}
