package ch.blj.java.grundlagen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;


/**
 * Dieses Programm zählt für einen bestimmten Text,
 * wie viele Vokale (a, e, i,o, u, ä, ö, ü, A, E, O, U, Ä, Ö, Ü) dieser enthält.
 * @author nuu
 *
 */
public class Aufgabe_16 {

	public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        Hashtable<String, Integer> vocalsCounter = new Hashtable<String, Integer>();
        vocalsCounter.put("a", 0);
        vocalsCounter.put("e", 0);
        vocalsCounter.put("i", 0);
        vocalsCounter.put("o", 0);
        vocalsCounter.put("u", 0);
        vocalsCounter.put("ä", 0);
        vocalsCounter.put("ö", 0);
        vocalsCounter.put("ü", 0);
        vocalsCounter.put("y", 0);

        System.out.println("Gib deinen Text ein: ");

        String input = in.readLine();
        int countOfAll = 0;

        if (input != "") {
            char[] chars = input.toLowerCase().toCharArray();

            for (int i = 0; i < chars.length; i++) {
                int pos = "aeiouäöüy".indexOf(chars[i]);
                if (pos > -1) {
                    countOfAll++;
                    int value = vocalsCounter.get(String.valueOf(chars[i]));
                    vocalsCounter.put(String.valueOf(chars[i]), ++value);
                }
            }

            System.out.println("Dein Text hat " + String.valueOf(countOfAll) + " Vokale.");

            Set<String> keys = vocalsCounter.keySet();

            for(String key : keys) {
                if (vocalsCounter.get(key) > 0)
                    System.out.println("Der Buchstabe " + key + " kommt " + vocalsCounter.get(key) + " mal vor.");

            }
        }
    }
}
