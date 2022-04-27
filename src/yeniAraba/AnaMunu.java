package yeniAraba;

import java.util.ArrayList;
import java.util.Arrays;

public class AnaMunu {
    Islemler obj1 = new Islemler();
    ArrayList<String> model = new ArrayList<>(Arrays.asList("Corolla", "Auris", "Yaris"));
    private String yakit;
    ArrayList<String> renk = new ArrayList<>(Arrays.asList("Beyaz", "Siyah", "Kirmizi"));
    private int yil;
    private String vites;

    public AnaMunu() {
    }

    public AnaMunu(ArrayList<String> model, String yakit, ArrayList<String> renk, int yil, String vites) {
        this.model = model;
        this.yakit = yakit;
        this.renk = renk;
        this.yil = yil;
        this.vites = vites;
    }

    public ArrayList<String> getModel() {
        return model;
    }

    public void setModel(ArrayList<String> model) {
     this.model=model;
    }

    public String getYakit() {
        return yakit;
    }

    public void setYakit(String yakit) {
        this.yakit = yakit;
    }

    public ArrayList<String> getRenk() {
        return renk;
    }

    public void setRenk(ArrayList<String> renk) {
        this.renk = renk;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil < 2010) {
            System.out.println("2010 yili alti aracimiz yoktur...");
            System.out.println("Tekrar tercih yapiniz");
        }

    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }


    @Override
    public String toString() {
        return "AnaMunu{" +
                "model=" + model +
                ", yakit='" + yakit + '\'' +
                ", renk=" + renk +
                ", yil=" + yil +
                ", vites='" + vites + '\'' +
                '}';
    }
}
