package yeniAraba;

import java.util.Scanner;

public class Depo implements Urunler{
    static Scanner scan= new Scanner(System.in);


   private String marka;
   private String model;
   private int motorGucu;
   private String renk;
   private String yakit;





    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotorGucu() {
        return motorGucu;
    }

    public void setMotorGucu(int motorGucu) {
        this.motorGucu = motorGucu;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getYakit() {
        return yakit;
    }

    public void setYakit(String yakit) {
        this.yakit = yakit;
    }

    @Override
    public void urunler(String marka, String model, int motorGucu, String renk, String yakit) {

    }
}
