public class NamePattern {
    public static void main(String[] args) {
        printM();
        System.out.println();
        printE();
        System.out.println();
        printE();
    }

    static void printM() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4 || (i == j && j <= 2) || (i + j == 4 && j >= 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void printE() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || i == 0 || i == 2 || i == 4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
