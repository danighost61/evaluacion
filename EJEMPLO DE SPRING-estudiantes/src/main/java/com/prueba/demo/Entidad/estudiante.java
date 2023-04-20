package com.prueba.demo.Entidad;

public class estudiante {
    private double cedula;
    private String nombre;
    private String apellido;
    private String curso;
    private double nota_final;

    public estudiante(double cedula, String nombre, String apellido, String curso, double nota_final) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.nota_final = nota_final;
    }

    public double getCedula() {
        return cedula;
    }

    public void setCedula(double cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota_final() {
        return nota_final;
    }

    public void setNota_final(double nota_final) {
        this.nota_final = nota_final;
    }
}
