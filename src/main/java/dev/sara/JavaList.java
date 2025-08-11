package dev.sara;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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

    public void sortDaysAlphabetically() {
        Collator collator = Collator.getInstance(Locale.forLanguageTag("es-ES"));
        collator.setStrength(Collator.PRIMARY);
        days.sort(collator);
    }

    public void clearDays(){
        days.clear();
    }
}