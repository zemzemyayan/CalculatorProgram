package ColculatorProgram;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("birinci sayıyı giriniz: ");
        int deger1 = sc.nextInt();
        System.out.println("ikinci sayıyı giriniz: ");
        int deger2 = sc.nextInt();

        while (true) {
            System.out.println("lütfen seçim yapınız : ");
            System.out.println("1- Toplama işlemi");
            System.out.println("2- Çıkarma işlemi");
            System.out.println("3- Çarpma işlemi ");
            System.out.println("4- Bölme işlemi  ");
            System.out.println("0- Çıkış         ");
            int secim = sc.nextInt();
            if (secim == 0) {
                System.out.println("Çıkış yapılıyor..");
                Thread.sleep(200);
                break;
            }

            switch (secim) {
                case 1:
                    System.out.println("toplam: " + deger1 + deger2);
                    break;
                case 2:
                    System.out.println("fark: " + (deger1 - deger2));
                    break;
                case 3:
                    System.out.println("çarpım: " + deger1 * deger2);
                    break;
                case 4:
                    if (deger2 == 0) {
                        System.out.println("bir sayı 0'a bölünemez!");
                        break;
                    } else {
                        System.out.println("bolüm : " + deger1 / deger2);
                    }
                    break;
                default:
                    System.out.println("lütfen geçerli bir değer girin: 1-4");
            }

        }

        sc.close();

    }
}
