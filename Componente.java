package org.example;

public class Componente {
    private int Id;


    private String NombreComponente;

    private String Profesor;

    public Componente() {

    }

    public int getID() {
        return Id;
    }

    public void setID(int Id) {
        this.Id = Id;
    }

    public String getNombreComponente() {
        return NombreComponente;
    }

    public void setNombreComponente(String NombreComponente) {
        this.NombreComponente = NombreComponente;
    }

    public String getProfesor() {
        return Profesor;
    }

    public void setProfesor(String Profesor) {
        this.Profesor = Profesor;
    }

    public void registrarInfoComponente(int Id, String NombreComponente, String Profesor){
        this.Id = Id;
        this.NombreComponente = NombreComponente;
        this.Profesor = Profesor;
    }

    public String imprimirInfoComponente(){
        return
                "El identificador unico del Estudiantes es: " + Id +
                        "\nEl Nombre del comoponente es: "+ NombreComponente +
                        "\nEl nombre del profesor es: " + Profesor;

    }



}
