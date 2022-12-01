package ch.blj.java.grundlagen;

import java.io.IOException;

/**
 *  Kleines 1x1.
 * @author nuu
 */
public class Aufgabe_04 {

    public static void main(String[] args) throws IOException {

        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= 10; k++) {
                System.out.print(k * i + "\t");
            }

            System.out.println();
        }
    }
}
