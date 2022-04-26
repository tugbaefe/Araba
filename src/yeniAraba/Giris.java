package yeniAraba;

import java.util.ArrayList;
import java.util.Arrays;

public class Giris implements Kiralama, Satis  {

    static String marka="Toyota";
    static ArrayList<String > model=new ArrayList<>(Arrays.asList("Corolla","Auris","Yaris"));
    static String yakit;
    static ArrayList<String> renk= new ArrayList<>(Arrays.asList("Beyaz","Siyah","Gri","Kirmizi"));
    static int yil;
    static String vites;

    public Giris(String marka, ArrayList<String > model, String yakit, ArrayList<String> renk, int yil) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.renk = renk;
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
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", vites='" + vites + '\'' +
                '}';
    }


    @Override
    public void purchasing(String renk) {

    }

    @Override
    public void sales(String marka, String model) {

    }
}
