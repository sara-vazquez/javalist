package dev.sara;

import java.util.ArrayList;
import java.util.List;

public class JavaList {

    private List<String> dias; 

    public JavaList() {

        dias = new ArrayList<>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miércoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sábado");
        dias.add("Domingo");

        System.out.println("ArrayList" + dias);

    }
}
/* 
* 1. La clase debe tener los siguientes métodos:

* Un método para crear la lista de los días de la semana
* Un método que retorne los días de la semana
* Un método que retorne el largo de la lista
* Un método para eliminar un día de la semana
* Un método que retorne el día de la semana solicitado
* Un método que retorne si el día solicitado existe en la lista
* Un método para ordenar la lista de días por orden alfabético
* Un método para vaciar la lista


Requisitos :
* Se debe realizar un test unitario de cada método
* Se debe utilizar la colección "List" de java.util

Entrega :
Repositorio de Github
 */