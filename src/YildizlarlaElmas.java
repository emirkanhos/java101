import java.util.Scanner;
public class YildizlarlaElmas {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = inp.nextInt();

        for (int i = 0;  i<n; i++){
            for (int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++){
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n-2; i>=0; i--){

            for (int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for (int k=0; k < (2*i + 1); k++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
