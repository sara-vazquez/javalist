package dev.sara;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
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
}
