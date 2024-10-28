import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        String userName = inp.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        String password = inp.nextLine();

        if (userName.equals("patika") && password.equals("123")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Şifreniz yanlış. Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır):");
            String cevap = inp.nextLine();

            if (cevap.equalsIgnoreCase("Evet")) {
                System.out.print("Yeni şifre girin: ");
                String yeniSifre = inp.nextLine();

                if (yeniSifre.equals("123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Şifre sıfırlama iptal edildi.");
            }
        }
    }
}