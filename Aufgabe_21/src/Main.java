import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        System.out.println("Gib dein Geburtsdatum im 'dd.MM.yyyy' Format ein.");

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String userInput = scan.nextLine();

        Date birthday = dateFormat.parse(userInput);
        Date heute = new Date();
        long ms = heute.getTime()-birthday.getTime();
        long sek= ms/1000;
        long min = sek/60;
        long std = min/60;
        long tage = std/24;
        long wochen = tage/7;
        long monate = tage/30; //unregelmässige tage im Monat
        long jahre = monate/12;

        if (tage/30/12/jahre <= 31 && monate/12/12 <= 12) {
            System.out.println("Alter in Jahre: "+jahre);
            System.out.println("Alter in Monaten: "+monate);
            System.out.println("Alter in Wochen: "+wochen);
            System.out.println("Alter in Tagen: "+tage);
        } else {
            System.out.println("Du hast ein ungültiges Datum eingegeben.");
        }

    }
}