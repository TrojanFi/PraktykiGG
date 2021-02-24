package loop.hw;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadania domowe 1 i 2:\n");

        //Task 1
        System.out.println("Zadanie 1");
        char letter = 'A';
        System.out.println();
        while (letter <= 'Z') {
            System.out.print(letter + "\t");
            letter+=2;
        }
        System.out.println("\n");
        //Task 2
        System.out.println("Zadanie 2\n");
        int fibA,fibB,fibC;
        fibA = fibB = fibC = 1;
        int numberOfDigits = 8;
        System.out.print( fibA + " " + fibB + " ");
        for (int i = 0; i < numberOfDigits; i++){
            fibC = fibA + fibB;
            fibA = fibB;
            fibB = fibC;
            System.out.print( fibC + " "  );
        }
    }
}
