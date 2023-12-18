import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime piuAnno = data.plusYears(1);
        OffsetDateTime menoMese = data.minusMonths(1);
        OffsetDateTime piuSetteGiorni = data.plusDays(7);
        String dataAnno = piuAnno.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dataMese = menoMese.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dataGiorni = piuSetteGiorni.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(dataAnno);
        System.out.println(dataMese);
        System.out.println(dataGiorni);
    }
    public String dataPiuAnno(OffsetDateTime data) {
        OffsetDateTime piuAnno = data.plusYears(1);
        return piuAnno.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }

    public String dataMenoMese(OffsetDateTime data) {
        OffsetDateTime menoMese = data.minusMonths(1);
        return menoMese.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }

    public String dataPiuSetteGiorni(OffsetDateTime data) {
        OffsetDateTime piuSetteGiorni = data.plusDays(7);
        return piuSetteGiorni.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }
}
