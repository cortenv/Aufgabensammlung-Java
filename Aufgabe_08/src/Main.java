public class Main {
    public static void main(String[] args) {

        System.out.println("Zahlen zwischen 1 und 30, die durch 5 und/oder 3 teilbar sind ohne Rest: ");

        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i);

                if (i < 30) {
                    System.out.print(", ");
                }
            }
        }
    }
}