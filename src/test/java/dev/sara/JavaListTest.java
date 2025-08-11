package dev.sara;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JavaListTest {
    
    private JavaList javaList;

    @BeforeEach
    void setUp() {
        javaList = new JavaList();
    }

    @Test
    void testCreate_Days() {

        assertThat(javaList.getDays(), hasSize(7));
        assertThat(javaList.getDays(), contains("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"));
    } 

    @Test
    void testGetDaysCount() {

        assertThat(javaList.getDaysCount(), is(7));
    }

    @Test
    void testDelete_Days() {

        assertThat(javaList.deleteDay("Martes"), is(true));
        assertThat(javaList.getDays(), not(hasItem("Martes")));
    }

    @Test
    void testGetDay() {

    assertThat(javaList.getDayByName("Miércoles"), is(Optional.of("Miércoles")));
}

    @Test
    void testConteinsDay() {

        assertThat(javaList.containsDay("Jueves"), is(true));
    }

    @Test
    void testSortAlphabetically() {

        javaList.sortDaysAlphabetically();
        assertThat(javaList.getDays(), contains("Domingo", "Jueves", "Lunes", "Martes", "Miércoles", "Sábado", "Viernes"));
    }

    @Test
    void testClearDays() {

        javaList.clearDays();
        assertThat(javaList.getDays(), hasSize(0));
    }
}

