package org.example;

import java.util.ArrayList;

public class Estudiante {
    private String ID;
    private String Nombre;

    private double Notafinal;
    private double CantidadNotas;
    private ArrayList<Nota> notas = new ArrayList<>();

    public Estudiante() {}

    public void resgistrarEstudiante(String ID, String Nombre){
        this.ID = ID;
        this.Nombre = Nombre;
    }

    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    public double calcularNotaFinal() {
        double suma = 0;
        for (Nota n : notas) {
            suma += n.getVrNotaPorcentaje();
        }
        return suma;
    }

    public String imprimirInfo(){
        return "ID Estudiante: " + ID + ", Nombre: " + Nombre;
    }

    public String getID() {
        return ID;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }
}

