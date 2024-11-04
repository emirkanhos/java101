import java.util.Scanner;
public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int ytipi,yas;
        double indirimyas1=(0.5);
        double indirimyas2=(0.1);
        double indirimyas3=(0.3);
        double mesafe;
        System.out.println("Mesafeyi km türünden giriniz :");
        mesafe = inp.nextDouble();

        System.out.println("Yaşınızı giriniz :");
        yas = inp.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        ytipi = inp.nextInt();


        switch (ytipi){
            case 1:

                if (yas>=0 && yas<=12){
                    double normaltutar=mesafe*0.1;
                    double yasindirimi=normaltutar*indirimyas1;
                    double indirimlitutar=normaltutar-yasindirimi;
                    System.out.println("Toplam Tutar = " + indirimlitutar + "TL");

                } else if (yas>12 && yas<=24){
                    double normaltutar=mesafe*0.1;
                    double yasindirimi=normaltutar*indirimyas2;
                    double indirimlitutar=normaltutar-yasindirimi;
                    System.out.println("Toplam Tutar = " + indirimlitutar + "TL");

                } else if (yas>24 && yas<65){
                    double normaltutar=mesafe*0.1;
                    System.out.println("Toplam Tutar = " + normaltutar + "TL");
                } else if (yas>=65) {
                    double normaltutar = mesafe * 0.1;
                    double yasindirimi = normaltutar * indirimyas3;
                    double indirimlitutar = normaltutar - yasindirimi;
                    System.out.println("Toplam Tutar = " + indirimlitutar + "TL");
                }
                else
                    System.out.println("Hatalı Veri Girdiniz !");
                break;


            case 2:

                if (yas>=0 && yas<=12){
                    double normaltutar=mesafe*0.1;
                    double yasindirimi=normaltutar*indirimyas1;
                    double indirimlitutar=normaltutar-yasindirimi;
                    double gidisdonus=indirimlitutar*0.2;
                    double toplamtutar=(indirimlitutar-gidisdonus)*2;
                    System.out.println("Toplam Tutar = " + toplamtutar + "TL");

                } else if (yas>12 && yas<=24){
                    double normaltutar=mesafe*0.1;
                    double yasindirimi=normaltutar*indirimyas2;
                    double indirimlitutar=normaltutar-yasindirimi;
                    double gidisdonus=indirimlitutar*0.2;
                    double toplamtutar=(indirimlitutar-gidisdonus)*2;
                    System.out.println("Toplam Tutar = " + toplamtutar + "TL");

                } else if (yas>24 && yas<65){
                    double normaltutar=mesafe*0.1;
                    System.out.println("Toplam Tutar = " + normaltutar + "TL");
                } else if (yas>=65) {
                    double normaltutar = mesafe * 0.1;
                    double yasindirimi = normaltutar * indirimyas3;
                    double indirimlitutar = normaltutar - yasindirimi;
                    double gidisdonus=indirimlitutar*0.2;
                    double toplamtutar=(indirimlitutar-gidisdonus)*2;
                    System.out.println("Toplam Tutar = " + toplamtutar + "TL");
                }
                else
                    System.out.println("Hatalı Veri Girdiniz !");
                break;


            default:
                System.out.println("Hatalı Veri Girdiniz !");
                break;

        }

    }
}
