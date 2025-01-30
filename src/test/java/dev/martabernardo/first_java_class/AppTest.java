package dev.martabernardo.first_java_class;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;

class AppTest {
    @Test
    @DisplayName("Second test person instance print")
    void testAppPersonInstanceSecond() {
        String result = App.dataToPrint("Marta", "Bernardo", "11222333D", 1985);

        assertEquals(result, "Marta Bernardo / 11222333D / 1985");
    }


}
