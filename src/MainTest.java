import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    private final Main testing = new Main();
    @Test
    void dataPiuAnno() {
        String result = testing.dataPiuAnno(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("venerdì 1 marzo 2024", result);
    }

    @Test
    void dataMenoMese() {
        String result = testing.dataMenoMese(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("mercoledì 1 febbraio 2023", result);
    }

    @Test
    void dataPiuSetteGiorni() {
        String result = testing.dataPiuSetteGiorni(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("mercoledì 8 marzo 2023", result);
    }
}