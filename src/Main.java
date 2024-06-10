import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        //creo un oggetto OffsetDateTime con all'interno la stringa suggerita in consegna

        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        //formatto solamente la data con FULL, MEDIUM e SHORT
        //per ogni formattazione stampa un risultato uguale ma con una scrittura diversa

        String dataString = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        System.out.println("Full : " + dataString);

        String dataString2 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

        System.out.println("Medium : " + dataString2);

        String dataString3 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        System.out.println("Short : " + dataString3);

    }
}