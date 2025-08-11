package dev.sara;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class JavaListTest {
    
    public JavaList javaList;

    @Test
    void testCreate_Days() {

        javaList = new JavaList();

        assertThat(javaList.days, hasSize(7));
        assertThat(javaList.days.get(0), is("Lunes"));
        assertThat(javaList.days.get(6), is("Domingo"));
    }   

    @Test
    void testDelete_Days() {

        JavaList javaList = new JavaList();

        boolean removed = javaList.days.remove("Martes");

        assertThat(removed, is(true));
        assertThat(javaList.days, not(hasItem("Martes")));
    }
}
