package dev.sara;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JavaList {

    private List<String> days; 

    public JavaList() {

        days = new ArrayList<>();
        days.add("Lunes");
        days.add("Martes");
        days.add("Miércoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sábado");
        days.add("Domingo");

        System.out.println("ArrayList" + days);
    }

    public List<String> getDays() {
        return new ArrayList<>(days);
    }

    public int getDaysCount() {
        return days.size();
    }

    public boolean deleteDay(String dayName) {
        return days.remove(dayName);
    }

    public Optional<String> getDayByName(String name) {
        return days.stream()

                    .filter(day -> day.equals(name))
                    .findFirst();
    }

    public boolean containsDay(String dayName) {
        return days.contains(dayName);
    }

}

/* 
* 1. La clase debe tener los siguientes métodos:

* Un método para crear la lista de los días de la semana ✔︎
* Un método que retorne los días de la semana ✔︎
* Un método que retorne el largo de la lista ✔︎
* Un método para eliminar un día de la semana ✔︎
* Un método que retorne el día de la semana solicitado ✔︎
* Un método que retorne si el día solicitado existe en la lista ✔︎
* Un método para ordenar la lista de días por orden alfabético
* Un método para vaciar la lista


Requisitos :
* Se debe realizar un test unitario de cada método
* Se debe utilizar la colección "List" de java.util

Entrega :
Repositorio de Github
 */