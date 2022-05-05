package yeniAraba;

import java.util.Scanner;

import static yeniAraba.Giris.*;

public class Islemler extends Giris {
    static Scanner scan=new Scanner(System.in);
    static Islemler renkmodelsecim=new Islemler();





    public static void menu() throws InterruptedException {
        String tercih;
            System.out.println("=============JAVA OTO=============\n" +
                    "============= ANA MENU =============\n" +
                    "\n" +
                    "\t  1- Kiralama\n" +
                    "\t  2- Satis\t\t \n" +
                    "\t  Q- CIKIS\n");
            System.out.println("Lutfen menuden tercihinizi yapiniz");
            tercih = scan.next();

            switch (tercih) {
                case "1":
                    rentACar();
                    break;
                case "2":
                    salesACar();
                    break;
                case "q":
                case "Q":
                    cikis();
                    break;
                default:
                    System.out.println("Lutfen gecerli bir tercih giriniz");
                    for (int i = 1; i <20 ; i++) {
                        Thread.sleep(100);
                        System.out.print(".");

                    }
                    System.out.println(" ");
                    menu();
            }



    }

    private static void salesACar() throws InterruptedException {
        System.out.println("Yalnizca sifir Toyota marka araba satisi yapilmaktadir");

        renkmodelsecim.sales();

        System.out.println("Vites tercihinizi yapiniz");
        System.out.println("1-Manuel, 2-Otomatik, 3-Yari Otomatik");
        String tercihVites= scan.next();
        switch (tercihVites){
            case "1":
                vites="Manuel";
                break;
            case "2":
                vites="Otomatik";
                break;
            case "3":
                vites="Yari Otomatik";
                break;
            default:
                System.out.println("Hatali tercih");
                salesACar();
        }


        renkmodelsecim.purchasing();

        System.out.println("Yakit tercihinizi yapiniz");
        System.out.println("1-Benzinli, 2-Dizel");
        String tercihYakit=scan.next();
        switch (tercihYakit){
            case "1":
                yakit="Benzinli";
                break;
            case "2":
                yakit="Dizel";
                break;
            default:
                System.out.println("Yanlis tercih");
                salesACar();

        }

        Giris arabaSatis=new Giris();
        Giris.yil=2022;
        System.out.println("******Arac Bilgileri Hazirlaniyor******");
        for (int i = 1; i < 30; i++) {
            Thread.sleep(200);
            System.out.print("*");

        }
        System.out.println(" ");

        System.out.println(arabaSatis.toString());
        for (int i = 1; i < 30; i++) {
            Thread.sleep(200);
            System.out.print("*");

        }
        System.out.println(" ");
        System.out.println("Istenilen arac bilgileri dogruysa arac satisi icin bizimle iletisime geciniz");
        System.out.println("Baska bir islem yapmak istiyorsaniz menuye donebilirsiniz");

        for (int i = 1; i < 30; i++) {
            Thread.sleep(200);
            System.out.print("*");

        }
        System.out.println(" ");
        menu();


    }

    private static void cikis() {
        System.out.println("Java Oto'dan cikis yaptiniz");
        System.out.println("******Iyi gunler dileriz******");
    }


    public static void rentACar() throws InterruptedException {
        double saatBasiUcret = 0;
        System.out.println("Arac kiralama icin yil giriniz");
        yil = scan.nextInt();
        if (yil < 2010) {
            System.out.println("2010 yili alti aracimiz yoktur");
            System.out.println("Tekrar tercih yapiniz");
            for (int i = 1; i < 20; i++) {
                Thread.sleep(500);
                System.out.print(".");

            }
            System.out.println(" ");

            rentACar();

        }



        renkmodelsecim.sales();


        System.out.println("Arac kiralama/satis icin yakit giriniz");
        yakit = scan.next();
        System.out.println("Arac kiralama/satis icin vites giriniz");
        vites = scan.next();

        renkmodelsecim.purchasing();


        if (yakit.equalsIgnoreCase("benzinli") && vites.equalsIgnoreCase("manuel")) {
            saatBasiUcret = 100;
            System.out.println("Saat Basi Odemeniz Gereken Ucret : " + saatBasiUcret + " TL");

        } else if (yakit.equalsIgnoreCase("benzinli") && vites.equalsIgnoreCase("otomatik")) {
            saatBasiUcret = 120;
            System.out.println("Saat Basi Odemeniz Gereken Ucret : " + saatBasiUcret + " TL");

        } else if (yakit.equalsIgnoreCase("dizel") && vites.equalsIgnoreCase("manuel")) {
            saatBasiUcret = 120;
            System.out.println("Saat Basi Odemeniz Gereken Ucret : " + saatBasiUcret + " TL");

        } else if (yakit.equalsIgnoreCase("dizel") && vites.equalsIgnoreCase("otomatik")) {
            saatBasiUcret = 150;
            System.out.println("Saat Basi Odemeniz Gereken Ucret : " + saatBasiUcret + " TL");

        } else if (yakit.equalsIgnoreCase("elektrikli") && vites.equalsIgnoreCase("otomatik")) {
            saatBasiUcret = 200;
            System.out.println("Saat Basi Odemeniz Gereken Ucret : " + saatBasiUcret + " TL");


        }


        Giris arabaKira = new Giris();
        System.out.println("******Arac Bilgileri******");
        System.out.println(arabaKira.toString());
        for (int i = 1; i < 20; i++) {
            Thread.sleep(100);
            System.out.print(".");

        }
        System.out.println(" ");
        menu();

    }







}



