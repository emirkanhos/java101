import java.util.Scanner;
public class manavkasa {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double a=2.14,e=3.67,d=1.11,m=0.95,p=5.00 ;
        double ai,ei,di,mi,pi;

        System.out.print("Armut Kaç Kilo ? : ");
        ai = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        ei = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        di = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        mi = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        pi = input.nextDouble();

        double total;

        total=(a*ai)+(e*ei)+(d*di)+(m*mi)+(p*pi);

        System.out.println("Toplam Tutar :" + total + "TL");




    }
}
