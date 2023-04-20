package com.prueba.demo.controlador;

import com.prueba.demo.Entidad.estudiante;
import com.prueba.demo.Servicios.servicios_estudiantes;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*",maxAge = 3600)

@RestController
public class controladorEstudiantes {

    servicios_estudiantes servicio=new servicios_estudiantes();

    //metodo para mostrar todos los objetos de la lista
    @GetMapping("/mostrar")
    public ArrayList<estudiante> verpersona() {return servicio.mostrar();}

    //metodo de buscar y mostrar estudiante con nota mayor
    @GetMapping("/buscarNotaMayor/{dato}")
    public estudiante nota_mayor(@PathVariable("dato") String curso) {
        return servicio.buscarNotaMayor(curso);
    }

    //metodo para eliminar estudiante con nota más baja del curso especificado
    @DeleteMapping("/eliminar/{dato}")
    public String notab(@PathVariable("dato") String curso) {
        return servicio.eliminarNotaBaja(curso);
    }






}