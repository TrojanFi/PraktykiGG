package loops.homeWork;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadania domowe 1 i 2:\n");

        // ZADANIE 1
        System.out.println("Zadanie 1");
        char letter = 'A';
        System.out.println();
        while (letter <= 'Z') {
            System.out.print(letter + "\t");
            letter+=2;
        }
        System.out.println("\n");
        // ZADANIE 2
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

        // ZADANIE 4
        System.out.println("\n\nZADANIE 4");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if ( (j * i) % 3 == 0 && (j * i) % 2 == 0){
                    System.out.print(j * i + "\t");
                }
                else {
                    System.out.print("X" + "\t");
                }
            }
            System.out.println();
        }

        System.out.println("5 modulo 1 : " + 5%1);
        System.out.println("5 modulo 2 : " + 5%2);
        System.out.println("5 modulo 3 : " + 5%3);
        System.out.println("5 modulo 4 : " + 5%4);
        System.out.println("5 modulo 5 : " + 5%5);
        System.out.println("\n\n\n");

        //ZADANIE 5
        int p = 1;
        int k = 30; // wielkość trójkąta
        boolean leftSide = false;
        do {

            if( leftSide == false){
                for (int i = 0; i < p; i++) {
                    System.out.print("X");
                }
                System.out.println();
                p++;
                if( p == k) leftSide = true;
            }
            if( leftSide == true){

                for (int i = p; i > 0; i--) {
                    System.out.print("X");
                }
                System.out.println();
                p--;
                if( p == 0) p = k;
            }


        }while (p != k);


    }
}
