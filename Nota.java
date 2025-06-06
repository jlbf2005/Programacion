package org.example;

public class Nota {

    private double VrNota;

    private double Porcentaje;

    private double VrNotaPorcentaje;

    public void calcularNotaPorcentaje(){
        this.VrNota = VrNota / Porcentaje;
    }

    public String imprimirNota(){
        return "Nota" + VrNota + "Porcentaje" + Porcentaje + "Nota + Porcentaje" + VrNotaPorcentaje ;
    }

    public double getVrNota() {
        return VrNota;
    }

    public void setVrNota(double VrNota) {
        this.VrNota = VrNota;
    }

    public double getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(double Porcentaje) {
        this.Porcentaje = Porcentaje;
    }

    public double getVrNotaPorcentaje() {
        return VrNotaPorcentaje;
    }

    public void setVrNotaPorcentaje(double VrNotaPorcentaje) {
        this.VrNotaPorcentaje = VrNotaPorcentaje;
    }
}
