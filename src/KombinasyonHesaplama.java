import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        //C(n,r) = n! / (r! * (n-r)!)
        
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        int n = inp.nextInt();
        System.out.println("Bir Sayı Giriniz: ");
        int r = inp.nextInt();

        if (r > n || n < 0 || r < 0){
            System.out.println("Hata n>=r ve  girilen değerler negatif olmamalıdır.");
            return;
        }

        int nfactorial = 1, rfactorial = 1, eksifactorial = 1;

        for (int i = 1; i<= n; i++){
            nfactorial *= i;
        }

        for (int i = 1; i<=r; i++){
            rfactorial *= i;
        }

        for (int i = 1; i<= (n-r); i++){
            eksifactorial *= i;
        }
        int combination = nfactorial / (rfactorial * eksifactorial);

        System.out.println("C(" + n + "," + r + ") = " + combination);

    }
}
