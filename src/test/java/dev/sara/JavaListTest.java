package dev.sara;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import org.junit.jupiter.api.Test;

public class JavaListTest {
    
    public JavaList javaList;

    @Test
    void testCreate_Days() {

        javaList = new JavaList();

        assertThat(javaList.getDays(), hasSize(7));
        assertThat(javaList.getDays(), contains("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"));
    } 

    @Test
    void testGetDaysCount() {
        JavaList javaList = new JavaList();

        assertThat(javaList.getDaysCount(), is(7));
    }

    @Test
    void testDelete_Days() {

        JavaList javaList = new JavaList();

        assertThat(javaList.deleteDay("Martes"), is(true));
        assertThat(javaList.getDays(), not(hasItem("Martes")));
    }

    @Test
    void testGetDay() {
    JavaList javaList = new JavaList();

    assertThat(javaList.getDayByName("Miércoles"), is(Optional.of("Miércoles")));
}

    @Test
    void testConteinsDay() {
        JavaList javaList = new JavaList();

        assertThat(javaList.containsDay("Jueves"), is(true));
    }

    @Test
    void testSortAlphabetically() {
        JavaList javaList = new JavaList();

        javaList.sortDaysAlphabetically();
        assertThat(javaList.getDays(), contains("Domingo", "Jueves", "Lunes", "Martes", "Miércoles", "Sábado", "Viernes"));
    }
}

