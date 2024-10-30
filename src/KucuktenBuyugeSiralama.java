import java.util.Scanner;

public class KucuktenBuyugeSiralama {
    public static void main(String[] args){

        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.println("1.Sayıyı Giriniz: ");
        a = input.nextInt();
        System.out.println("2.Sayıyı Giriniz: ");
        b = input.nextInt();
        System.out.println("3.Sayıyı Giriniz: ");
        c = input.nextInt();

        if ((a<b) && (a<c)){
            if (b<c){
                System.out.print(a + " < " + b + " < " + c);
            }if (c<b){
                System.out.print(a + " < " + c + " < " + b);
            }

        }if ((b<a) && (b<c)){
            if (c<a){
                System.out.print(b + " < " + c + " < " + a);
            }if (a<c){
                System.out.print(b + " < " + a + " < " + c);
            }
        }if ((c<a) && (c<b)){
            if (a<b){
                System.out.print(c + " < " + a + " < " + b);
            }if (b<a){
                System.out.print(c + " < " + b + " < " + a);
            }
        }
    }
}
