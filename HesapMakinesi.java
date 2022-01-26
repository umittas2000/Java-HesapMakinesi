import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sayi1,sayi2,sonuc;
        int islem;

        System.out.print("1. Sayiyi giriniz");
        sayi1 = input.nextDouble();

        System.out.print("2. Sayiyi giriniz");
        sayi2 = input.nextDouble();

        System.out.print("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\n Seciminiz:?");
        islem = input.nextInt();

        switch(islem){

            case 1: sonuc = sayi1+sayi2; break;
            case 2: sonuc = sayi1-sayi2; break;
            case 3: sonuc = sayi1*sayi2; break;
            case 4: sonuc = sayi1/sayi2; break;
            default: sonuc=0;
        }


        System.out.print("Sonuc : " + sonuc);
    }
}
