import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myInput = new Scanner( System.in );
        int a;
        int b;

        System.out.println("Lütfen 1. Sayıyı Giriniz");
        a= myInput.nextInt();

        System.out.println("Lütfen 2. Sayıyı Giriniz");
        b= myInput.nextInt();


        int toplam = 0;

        toplam=a+b;

        if (toplam % 2 ==0)
        {
            System.out.println("SAYI ÇİFTTİR");
        }
        else {
            System.out.println("SAYI TEKTİR");
        }

    }
}