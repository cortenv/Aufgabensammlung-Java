package ch.blj.java.grundlagen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * Dieses Konsolenprogramm berechnet das Alter für ein bestimmtes Geburstdatum,
 *  - in Tagen
 *  - in Wochen
 *  - in Monaten
 *  - in Jahren
 *
 *  @author nuu
 *
 */
public class Aufgabe_21 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bitte gib ein Geburtsdatum (TT.MM.JJJJ) ein: ");

        String input = in.readLine();

        LocalDate todayDate = LocalDate.now();
        LocalDate birthDate;

        try {
            birthDate = parseDateString(input);
        }
        catch(Exception ex) {
            System.out.println("Bitte gib ein gültiges Datum ein, im Format: TT.MM.JJJJ.");
            return;
        }

        System.out.println("\nAlter in Jahren: " + String.valueOf(calcYears(birthDate, todayDate)));
        System.out.println("Alter in Monaten: " + String.valueOf(calcMonths(birthDate, todayDate)));
        System.out.println("Alter in Wochen: " + String.valueOf(calcWeeks(birthDate, todayDate)));
        System.out.println("Alter in Tagen: " + String.valueOf(calcDays(birthDate, todayDate)));
    }

    private static int calcYears(LocalDate startDate, LocalDate endDate) {
        Period diffPeriod = Period.between(startDate, endDate);
        return diffPeriod.getYears();
    }

    private static int calcMonths(LocalDate startDate, LocalDate endDate) {
        Period diffPeriod = Period.between(startDate, endDate);
        return (diffPeriod.getYears() * 12) + diffPeriod.getMonths();
    }

    private static int calcWeeks(LocalDate startDate, LocalDate endDate) {
        int days = calcDays(startDate, endDate);
        return days / 7;
    }

    private static int calcDays(LocalDate startDate, LocalDate endDate) {
        // to obtain epoch-seconds for a LocalDateTime instance, we need to convert
        // the LocalDateTime to a ZonedDateTime
        ZoneId zoneId = ZoneId.of("Europe/Berlin");
        long startDateSeconds = startDate.atTime(0,0,0).atZone(zoneId).toEpochSecond();
        long endDateSeconds = endDate.atTime(0,0,0).atZone(zoneId).toEpochSecond();

        long diffSeconds = endDateSeconds - startDateSeconds;

        // 1 day := 86'400 seconds
        return (int)diffSeconds / 86400;
    }

    private static LocalDate parseDateString(String dateStr) {

        String dateFormat = "dd.MM.yyyy";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        LocalDate parsedDate = LocalDate.parse(dateStr, formatter);

        return parsedDate;
    }
}



