package yeniAraba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static yeniAraba.Giris.*;

public class Islemler  {
    static Scanner scan=new Scanner(System.in);



    public static void menu() throws InterruptedException {
        String tercih;
        do {
            System.out.println("=============JAVA OTO=============\n" +
                    "============= ANA MENU =============\n" +
                    "\n" +
                    "\t  1- Kiralama\n" +
                    "\t  2- Satis\t\t \n" +
                    "\t  Q- CIKIS\n");
            System.out.println("Lutfen menuden tercihinizi yapiniz");
            tercih = scan.nextLine();

            switch (tercih) {
                case "1":
                    rentACar();
                    break;
                case "2":
                    break;
                case "q":
                case "Q":
                    cikis();
                    break;
                default:
                    System.out.println("Lutfen gecerli bir tercih giriniz");
                    for (int i = 1; i <20 ; i++) {
                        Thread.sleep(500);
                        System.out.print(".");

                    }
                    System.out.println(" ");
                    menu();
            }
        } while (!tercih.equalsIgnoreCase("q"));

    }

    public static void rentACar() throws InterruptedException {
        double saatBasiUcret = 0;
        System.out.println("Arac kiralama icin yil giriniz");
        yil= scan.nextInt();
        if (yil<2010){
            System.out.println("2010 yili alti aracimiz yoktur");
            System.out.println("Tekrar tercih yapiniz");
            for (int i = 1; i <20 ; i++) {
                Thread.sleep(500);
                System.out.print(".");

            }
            System.out.println(" ");

            rentACar();

        }

        System.out.println(model);
        System.out.println("Arac kiralama icin listemizden marka tercih ediniz");
        String modelSecim= scan.next();
        for (int i = 0; i <model.size() ; i++) {
            if (model.get(i).equalsIgnoreCase(modelSecim)){
                model.get(i);
            }else System.out.println("Hatali giris");
            rentACar();

        }


        System.out.println(renk);
        System.out.println("Arac kiralama icin listemizden renk tercih ediniz");
        String renkSecim= scan.next();
        for (int i = 0; i <renk.size() ; i++) {
            if (renk.get(i).equalsIgnoreCase(renkSecim)){
                renk.get(i);
            }else System.out.println("Hatali giris");
            rentACar();

        }

        System.out.println("Arac kiralama icin yakit giriniz");
        yakit= scan.next();
        System.out.println("Arac kiralama icin vites giriniz");
        vites= scan.next();

        if (yakit.equalsIgnoreCase("benzinli") && vites.equalsIgnoreCase("manuel")){
            saatBasiUcret=100;
            System.out.println("Saat Basi Odemeniz Gereken Ucret : "+saatBasiUcret+" TL");

        }else if (yakit.equalsIgnoreCase("benzinli") && vites.equalsIgnoreCase("otomatik")){
            saatBasiUcret=120;
            System.out.println("Saat Basi Odemeniz Gereken Ucret : "+saatBasiUcret+" TL");

        }else if (yakit.equalsIgnoreCase("dizel") && vites.equalsIgnoreCase("manuel")){
            saatBasiUcret=120;
            System.out.println("Saat Basi Odemeniz Gereken Ucret : "+saatBasiUcret+" TL");

        }else if (yakit.equalsIgnoreCase("dizel") && vites.equalsIgnoreCase("otomatik")){
            saatBasiUcret=150;
            System.out.println("Saat Basi Odemeniz Gereken Ucret : "+saatBasiUcret+" TL");

        }else if (yakit.equalsIgnoreCase("elektrikli") && vites.equalsIgnoreCase("otomatik")){
            saatBasiUcret=200;
            System.out.println("Saat Basi Odemeniz Gereken Ucret : "+saatBasiUcret+" TL");


        }
        System.out.println("******Arac Bilgileri******");
        Giris arabaKira=new Giris();
        System.out.println(arabaKira.toString());


    }

    public static void cikis() {
        System.out.println("Java Oto'dan cikis yaptiniz");
        System.out.println("******Iyi gunler dileriz******");
    }


}

