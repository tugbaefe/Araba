package yeniAraba;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Islemler {
    static Scanner scan = new Scanner(System.in);


    public static void menu() throws InterruptedException {
        String Menu = JOptionPane.showInputDialog(null,"Lutfen Yapmak istediginiz Islemi Seciniz : " +
                "\n1-Kiralama\n2-Satis\nQ-Cikis",JOptionPane.QUESTION_MESSAGE);
        System.out.println(Menu);
            //System.out.println("=============JAVA OTO=============\n" +
            //        "============= ANA MENU =============\n" +
            //        "\n" +
            //        "\t  1- Kiralama\n" +
            //        "\t  2- Satis\t\t \n" +
            //        "\t  Q- CIKIS\n");
            System.out.println("Lutfen menuden tercihinizi yapiniz");
            String tercih = scan.nextLine();

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

            }
            menu();
    }

    public static void rentACar() throws InterruptedException {
        AnaMunu obj = new AnaMunu();
        double saatBasiUcret = 0;
        System.out.println("Arac kiralama icin yil giriniz : ");
        obj.setYil(scan.nextInt());

        System.out.println(obj.getModel());
        System.out.println("Arac kiralama icin listemizden marka tercih ediniz");
        String modelSecim = scan.next();
       switch (modelSecim){
           case "Corolla":
           case "corolla":
               System.out.println("Corolla sectiniz");
               break;
           case "Auris":
           case "auris":
               System.out.println("Auris sectiniz");
               break;
           case "Yaris":
           case "yaris":
               System.out.println("Yaris sectiniz");
               break;
           default:
               System.out.println("Hatali giris yaptiniz");
               rentACar();
       }

        System.out.println(obj.getRenk());
        System.out.println("Arac kiralama icin listemizden renk tercih ediniz");
        String renkSecim = scan.next();
        switch (renkSecim){
            case "Beyaz":
            case "beyaz":
                System.out.println("Beyaz sectiniz");
                break;
            case "Siyah":
            case "siyah":
                System.out.println("Siyah sectiniz");
                break;
            case "Kirmizi":
            case "kirmizi":
                System.out.println("Kirmizi sectiniz");
                break;
            default:
                System.out.println("Hatali giris yaptiniz");
                rentACar();
        }

        System.out.println("Arac kiralama icin yakit giriniz");
        obj.setYakit(scan.next());
        System.out.println("Arac kiralama icin vites giriniz");
        obj.setVites(scan.next());
        if (obj.getYakit().equalsIgnoreCase("benzinli") && obj.getVites().equalsIgnoreCase("manuel")) {
            saatBasiUcret = 100;
            System.out.println("Saat Basi Odemeniz Gereken Ucret : " + saatBasiUcret + " TL");
        } else if (obj.getYakit().equalsIgnoreCase("benzinli") && obj.getVites().equalsIgnoreCase("otomatik")) {
            saatBasiUcret = 120;
            System.out.println("Saat Basi Odemeniz Gereken Ucret : " + saatBasiUcret + " TL");
        } else if (obj.getYakit().equalsIgnoreCase("dizel") && obj.getVites().equalsIgnoreCase("manuel")) {
            saatBasiUcret = 120;
            System.out.println("Saat Basi Odemeniz Gereken Ucret : " + saatBasiUcret + " TL");
        } else if (obj.getYakit().equalsIgnoreCase("dizel") && obj.getVites().equalsIgnoreCase("otomatik")) {
            saatBasiUcret = 150;
            System.out.println("Saat Basi Odemeniz Gereken Ucret : " + saatBasiUcret + " TL");
        } else if (obj.getYakit().equalsIgnoreCase("elektrikli") && obj.getVites().equalsIgnoreCase("otomatik")) {
            saatBasiUcret = 200;
            System.out.println("Saat Basi Odemeniz Gereken Ucret : " + saatBasiUcret + " TL");
        }
      menu();
    }

    public static void cikis() {
        System.out.println("Java Oto'yu tercih ettiginiz icin tesekkur eder");
        System.out.println("******Iyi gunler dileriz******");
    }

}

