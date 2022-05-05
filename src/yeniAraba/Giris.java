package yeniAraba;

import java.util.ArrayList;
import java.util.Arrays;

import static yeniAraba.Islemler.scan;

public class Giris implements Kiralama,Satis  {

    static String marka="Toyota";
    static ArrayList<String > modelList=new ArrayList<>(Arrays.asList("1-Corolla","2-Auris","3-Yaris"));
    static ArrayList<String > renkList=new ArrayList<>(Arrays.asList("1-beyaz","2-siyah","3-gri"));
   // static String model="Corolla";
    static String yakit;
    static int yil;
    static String vites;
    static String renk="";
    static String model="";


    public Giris(String marka,  ArrayList<String > modelList, String yakit, int yil) {
        this.marka = marka;
        this.modelList = modelList;
        this.yakit = yakit;

        this.yil=yil;
    }

    public Giris() {
    }

    @Override
    public String toString() {

        return "Giris{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakit='" + yakit + '\'' +
                ", yil=" + yil +
                ", renk=" + renk +
                ", vites='" + vites + '\'' +
                '}';
    }

    @Override
    public String purchasing() {
        System.out.println("Arac kiralama/satis icin listemizden renk tercih ediniz");
        System.out.println(renkList);
        String renkSecim= scan.next();
        switch (renkSecim){
            case "1":
                renk="beyaz";
                break;
            case "2":
                renk="siyah";
                break;
            case "3":
                renk="gri";
                break;
            default:
                System.out.println("hatali giris");
        }

        return renk;


    }
    @Override
    public String sales() {
        System.out.println("Arac kiralama/satis icin listemizden model tercih ediniz");
        System.out.println(modelList);
        String modelSecim= scan.next();
        switch (modelSecim){
            case "1":
                model="corolla";
                break;
            case "2":
                model="auris";
                break;
            case "3":
                model="yaris";
                break;
            default:
                System.out.println("hatali giris");

        }

        return model;

    }





}
