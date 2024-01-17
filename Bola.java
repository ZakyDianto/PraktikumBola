package Praktikum;

public class Bola {
    private double jari;

    public void setJari(double jari) {
        this.jari=jari;
    }

    public double getJari(){
        return jari;
    }

    public void showVolume(){
        double volume;
        System.out.println("Volume= "+4/3*Math.PI*Math.pow(jari,3)+"Cm3");
    }

    public void showDiameter(){
        double diameter;
        System.out.println("Diameter= "+2*jari+"Cm");
    }

    public void showLuasPermukaan(){
        double Permukaan;
        System.out.println("Luas Permukaan= "+4*Math.PI*Math.pow(jari, jari)+"Cm2");
    }
}
