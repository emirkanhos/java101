import java.util.Scanner;
public class AtmProjesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password;
        int select;
        int balance=1500;
        int denemehakki = 3;
        while (denemehakki>0){
            System.out.print("Kullanıcı Adınız: ");
            userName = inp.nextLine();
            System.out.println("Şifreniz: ");
            password = inp.nextLine();

            if (userName.equals("patika") && password.equals("patika123")){
                System.out.println("Merhaba Kodluyoruz Bankasına Hoşgeldiniz!");
            do {
                System.out.println("1-Para Yatırma\n"+"2-Para Çekme\n"+"3-Bakiye Sorgula\n"+"4-Çıkış Yap");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçin: ");
                select = inp.nextInt();
                switch (select){
                    case 1:{
                        System.out.println("Para miktarı: ");
                        int price = inp.nextInt();
                        balance += price;
                    }
                    case 2:{
                        System.out.println("Para miktarı: ");
                        int price = inp.nextInt();
                        if (price > balance){
                            System.out.println("Bakiye yetersiz.");
                        }else {
                            balance -= price;
                        }

                    }
                    case 3:{
                        System.out.println("Bakiyeniz: " + balance);
                    }
                }

            }while (select!=4);
            System.out.println("Tekrar görüşmek üzere.");
            break;
            }else{
                denemehakki--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                switch (denemehakki){
                    case 0:{
                        System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                    }
                    default:
                        System.out.println("Kalan Hakkınız : " + denemehakki);
                }
            }
        }
    }
}
