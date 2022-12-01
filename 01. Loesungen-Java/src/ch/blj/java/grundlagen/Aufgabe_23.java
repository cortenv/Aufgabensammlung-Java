package ch.blj.java.grundlagen;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Memory.
 * @author nuu
 *
 */
public class Aufgabe_23 {

    static final String Space = "  ";

    static char[][] memory;
    static char[][] gameState;
    static char[] symbols = { '☺', '#', '♦', '♠', '♥', '♣', '♫', '☼', '©', '☻', '▲', '►', '▼', '◄', '&', '§', '$', '£'};
    static int memorySize = 4; // gültige Werte: 2,4,6 (begrenzt durch Anzahl Symbole -> 18 Symbole reichen für ein 6x6 Memory)
    static char[] input;
    static int countOfAttempts = 0;

    public static void main(String[] args) throws Exception {

        System.out.println("MEMORY -> Hinter den '?' verstecken sich Symbole, die paarweise vorkommen. Finden Sie diese!" );
        System.out.println("Zum Aufdecken wählen Sie zwei Positionen in der Form: Zeile1Spalte1Zeile2Spalte2.");
        System.out.println("Z.Bsp.: 2142 deckt das Symbol in Zeile 2 u. Spalte 1 auf sowie das Symbol in Zeile 4 u. Spalte 2.");

        initializeMemory();
        initializeGameState();
        displayGameState();

        while(!isGameOver()) {
            char[] input = getInputFromUser();
            checkSuccess(input);
        }

       System.out.println ("\nSie haben alle Karten aufgedeckt. Gratulation! Anzahl Versuche: " + countOfAttempts);

    }

    static void initializeMemory()
    {
        memory = new char[memorySize][memorySize];

        int[] helper = new int[(memorySize * memorySize) / 2]; // Grösse des Arrays entspricht der Anzahl benötigten Symbole
        Random random = new Random();

        for (int i = 0; i < memorySize; i++) {
            for (int k = 0; k < memorySize; k++) {
                int r = random.nextInt(0 + helper.length) + 0;
                helper[r]++;

                if (helper[r] < 3) {
                    memory[i][k] = symbols[r];
                } else {
                    k--;
                }
            }
        }
    }

    static void initializeGameState() {
        gameState = new char[memorySize][memorySize];

        for (int i = 0; i < gameState.length; i++) {
            for (int k = 0; k < gameState.length; k++) {
                gameState[i][k] = '?';
            }
        }
    }

    static void displayGameState() {
        System.out.println();

        // Abstand für Spaltenüberschriften schaffen
        System.out.print(Space + " ");

        // Spaltenüberschriften ausgeben
        for (int j = 0; j < gameState.length; j++) {
            System.out.print((j + 1) + Space);
        }

        // Zeilenbeschriftungen und Daten ausgeben
        for (int i = 0; i < gameState.length; i++) {
            System.out.println();
            System.out.print((i + 1) + Space);
            for (int j = 0; j < gameState.length; j++) {
               System.out.print(gameState[i][j] + Space);
            }
        }
    }

    static char[] getInputFromUser() throws IOException {
        System.out.println();

        char memSizeAsChar = String.valueOf(memorySize).charAt(0);

        while (true) {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            char[] input = in.readLine().toCharArray();

            if (input.length > 4 || input.length < 4) {
                // Die Eingabe muss genau 4 Zeichen lang sein
                System.out.println("Ungültige Eingabe! Zu wenige/viele Zahlen. Es werden genau 4 Zahlen erwartet!");
            } else if ((input[0] == input[2]) && (input[1] == input[3])) {
                // Es müssen zwei unterschiedliche Positionen eingegeben werden
                System.out.println("Ungültige Eingabe! 2x gleiche Position.");

            } else if (input[0] > memSizeAsChar || input[0] < "1".charAt(0) || input[1] > memSizeAsChar || input[1] < "1".charAt(0)
                    || input[2] > memSizeAsChar || input[2] < "1".charAt(0) || input[3] > memSizeAsChar || input[3] < "1".charAt(0)) {
                // Die Eingabe muss zwischen 1 und der Board-Grösse liegen

               System.out.println("Ungültige Eingabe! Zahlen müssen zwischen 1 und " + memorySize + " liegen.");
            } else {
                // Eingabe OK, wir sind fertig.
                return input;
            }
        }
    }

    static void checkSuccess(char[] userInput) {
        int x1 = Integer.parseInt(String.valueOf(userInput[0])) - 1;
        int y1 = Integer.parseInt(String.valueOf(userInput[1])) - 1;
        int x2 = Integer.parseInt(String.valueOf(userInput[2])) - 1;
        int y2 = Integer.parseInt(String.valueOf(userInput[3])) - 1;

        if (gameState[x1][y1] == ' ' || gameState[x2][y2] == ' ') {
            // one or both symbols have successfully been uncovered before -> no success
            System.out.println(" > Ungültiger Versuch. Mindestens eines der Symbole wurde bereits aufgedeckt.");
            displayGameState();

            return;
        }

        char c1 = memory[x1][y1];
        char c2 = memory[x2][y2];

        gameState[x1][y1] = c1;
        gameState[x2][y2] = c2;

        displayGameState();

        System.out.println();

        if (c1 != c2) {
            // different symbols -> no success
            System.out.println(" > Leider kein Treffer.");

            // zudecken
            gameState[x1][y1] = '?';
            gameState[x2][y2] = '?';
        } else {
            // success
            System.out.println(" > Treffer!");

            // zudecken
            gameState[x1][y1] = ' ';
            gameState[x2][y2] = ' ';
        }

        displayGameState();
        countOfAttempts++;
    }

    static boolean isGameOver() {
        for (int i = 0; i < memorySize; i++) {
            for (int j= 0; j < memorySize; j++) {
                if (gameState[i][j] != ' ')
                return false;
            }
        }

        return true;
    }
}
