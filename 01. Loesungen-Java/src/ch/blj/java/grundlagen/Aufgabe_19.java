package ch.blj.java.grundlagen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Map;

/**
 * Dieses Programm wandelt einen vom Benutzer eingegebenen Text in Morsecode um, und gibt diesen
 * in der Konsole aus.
 * @author nuu
 */
public class Aufgabe_19 {

    private static Hashtable<String, String> mapping = new Hashtable<String, String>();

    public static void main(String[] args) throws Exception {

        mapCodes();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Eingabe: ");
        String input = in.readLine();

        String code = getMorseCode(input);

        System.out.println("Morsecode für Eingabe: ");
        System.out.println(code);
    }

    private static String getMorseCode(String text)
    {
        // das Morsealphabet macht keine Unterscheidung zwischen Gross- und Kleinschreibung
        // darum: alles zu Grossbuchstaben konvertieren
        String textUpper = text.toUpperCase();
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < textUpper.length(); i++)
        {
            String character = textUpper.substring(i, i + 1);
            if (character == " ")
            {
                // Wortzwischenraum
                code.append("   ");
            }
            else if (mapping.containsKey(character))
            {
                code.append(mapping.get(character));

                // Buchstabenzwischenraum
                code.append(" ");
            }
        }

        return code.toString();
    }

    private static void mapCodes()
    {
        mapping.put("A", ".-");
        mapping.put("B", "-···");
        mapping.put("C", "-·-·");
        mapping.put("D", "-··");
        mapping.put("E", "·");
        mapping.put("F", "··-·");
        mapping.put("G", "--·");
        mapping.put("H", "····");
        mapping.put("I", "··");
        mapping.put("J", "·---");
        mapping.put("K", "-·-");
        mapping.put("L", "·-··");
        mapping.put("M", "--");
        mapping.put("N", "-·");
        mapping.put("O", "---");
        mapping.put("P", "·--·");
        mapping.put("Q", "--·-");
        mapping.put("R", "·-·");
        mapping.put("S", "···");
        mapping.put("T", "-");
        mapping.put("U", "··-");
        mapping.put("V", "···-");
        mapping.put("W", "·--");
        mapping.put("X", "-··-");
        mapping.put("Y", "-·--");
        mapping.put("Z", "--··");

        mapping.put("0", "-----");
        mapping.put("1", "·----");
        mapping.put("2", "··---");
        mapping.put("3", "···--");
        mapping.put("4", "····-");
        mapping.put("5", "·····");
        mapping.put("6", "-····");
        mapping.put("7", "--···");
        mapping.put("8", "---··");
        mapping.put("9", "----·");

        mapping.put("Ä", "·-·-");
        mapping.put("Ö", "---·");
        mapping.put("Ü", "··--");
        mapping.put("ß", "···--··");

        mapping.put(".", "·-·-·-");
        mapping.put(",", "--··--");
        mapping.put("?", "··--··");
        mapping.put("@", "·--·-·");
    }
}
