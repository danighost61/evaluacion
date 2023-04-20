package com.prueba.demo.Servicios;

import java.util.ArrayList;

import com.prueba.demo.Entidad.estudiante;

public class servicios_estudiantes {

    private ArrayList<estudiante> lista=new ArrayList<>();

    public servicios_estudiantes(){
        lista.add(new estudiante(100521116,"daniel","ramirez","8A",5.0));
        lista.add(new estudiante(100523116,"justin","saavedra","8A",3.6));
        lista.add(new estudiante(100524116,"camila","hernadez","8A",4.4));
        lista.add(new estudiante(100324117,"erling","haaland","8A",1.8));

        lista.add(new estudiante(100312523,"ximena","medina","8B", 4.8));
        lista.add(new estudiante(100212727,"sara","medina","8B", 3.8));
        lista.add(new estudiante(100112229,"javier","montenegro","8B", 2.8));
        lista.add(new estudiante(100812122,"nicolas","garzon","8B", 1.5));

        lista.add(new estudiante(180437337,"alejandro","guerrero","9A", 4.5));
        lista.add(new estudiante(100536337,"samuel","guerrero","9A", 3.2));
        lista.add(new estudiante(150435337,"tomas","rojas","9A", 4.1));
        lista.add(new estudiante(150435337,"juan","rico","9A", 1.5));

    }

    //mostrar todos los elementos registrados en la lista
    public ArrayList<estudiante> mostrar(){
        return lista;
    }

    //buscar y mostrar nota mayor
    public estudiante buscarNotaMayor(String curso) {
        ArrayList<estudiante> Notam = new ArrayList<>();
        for (estudiante m : lista) {
            if(m.getCurso().equalsIgnoreCase(curso)) {
                Notam.add(m);
            }
        }

        estudiante nora_mayor = Notam.get(0);

        for (estudiante m : Notam) {
            if(m.getNota_final() > nora_mayor.getNota_final()) {
                nora_mayor = m;
            }
        }

        return nora_mayor;
    }


    //metodo de buscar y eliminar nota menor

    public String eliminarNotaBaja(String curso) {
        ArrayList<estudiante> Notab = new ArrayList<>();
        for (estudiante m : lista) {
            if(m.getCurso().equalsIgnoreCase(curso)) {
                Notab.add(m);
            }
        }
        if (!Notab.isEmpty()) {
            estudiante nota_baja = Notab.get(0);
            for (estudiante m : Notab)
                if (m.getNota_final() < nota_baja.getNota_final()) {
                    nota_baja = m;
                }
            lista.remove(nota_baja);
            return "El estudiante " + nota_baja.getNombre() + " fue eliminado correctamente.";
        } else {
            return "No se encontraron estudiantes en el curso especificado.";
        }
    }














}