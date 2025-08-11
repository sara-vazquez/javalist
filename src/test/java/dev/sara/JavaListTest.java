package dev.sara;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class JavaListTest {
    
    public JavaList javaList;

    @Test
    void testCreate_Days() {

        javaList = new JavaList();

        assertThat(javaList.getDays(), hasSize(7));
        assertThat(javaList.getDays().get(0), is("Lunes"));
        assertThat(javaList.getDays().get(6), is("Domingo"));
    }   

    @Test
    void testDelete_Days() {

        JavaList javaList = new JavaList();

        assertThat(javaList.deleteDay("Martes"), is(true));
        assertThat(javaList.getDays(), not(hasItem("Martes")));
    }
}
