import java.util.Scanner;
public class HavaDurumuOnerme {
    public static void main(String[] args){
        int sicaklik;
        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklık Giriniz: ");
        sicaklik = input.nextInt();

        if(sicaklik<25){
            if (sicaklik<15){
                if (sicaklik<5){
                    System.out.println("Kayak");
                }else {
                    System.out.println("Sinema");
                }
            }else {
                System.out.println("Piknik");
            }
        }else{
            System.out.println("Yüzme");
        }
    }
}
