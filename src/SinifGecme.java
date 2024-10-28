import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args){
        int mat,fiz,tur,kim,muz,toplamders=5;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fiz = inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        tur = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kim = inp.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muz = inp.nextInt();

        if (mat<0 || mat>100){
            mat=0;
            toplamders--;
        }
        if (fiz<0 || fiz>100){
            fiz=0;
            toplamders--;
        }
        if (tur<0 || tur>100){
            tur=0;
            toplamders--;
        }
        if (kim<0 || kim>100){
            kim=0;
            toplamders--;
        }
        if (muz<0 || muz>100){
            muz=0;
            toplamders--;
        }if (toplamders<=0){
            System.out.println("Ders notlarınızı lütfen 0 ile 100 arasında giriniz.");
        }
        double ortalama = (mat+fiz+tur+kim+muz) / toplamders;

        if (ortalama >= 55){
            System.out.println("Sınıfı geçti");
        }else {
            System.out.println("Sınıfta kaldı");
        }
        System.out.println("Ortalamanız: " + ortalama);

    }
}
