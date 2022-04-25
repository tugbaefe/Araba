package yeniAraba;

public class Depo {

   private String marka;
   private String model;
   private int motorGucu;
   private String renk;
   private String yakit;

    public Depo(String marka, String model, int motorGucu, String renk, String yakit) {
        this.marka = marka;
        this.model = model;
        this.motorGucu = motorGucu;
        this.renk = renk;
        this.yakit = yakit;
    }

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
}
