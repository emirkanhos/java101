import java.util.Scanner;

public class Hipotenus {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int kenar1,kenar2;
        double hipotenus;
        System.out.println("Üçgenin 1.Kenarını Giriniz: ");
        kenar1 = input.nextInt();

        System.out.println("Üçgenin 2.Kenarını Giriniz: ");
        kenar2 = input.nextInt();

        hipotenus = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));


        System.out.print("Hipotenus: " + hipotenus);





    }
}
