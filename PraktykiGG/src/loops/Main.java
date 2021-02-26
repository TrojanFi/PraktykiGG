package loops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 5; i++){

            for(int j = 1; j < 5; ++j){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }

        System.out.println();
        //while
        int a = 10;
        int b = 0;

        while (a != b){
            b++;
            System.out.print(b + "\t");
        }

        System.out.println();
        //while Ascii
        char letter = 'A';
        while(letter <= 'D'){
            System.out.print(letter + "\t");
            letter++;
        }
        int liczba = letter;
        System.out.println("\n" + letter + " = " + liczba);


        int number = 0;
        boolean stan = true;
        do{
            System.out.println(number);
            if(number == 10){
               stan = true;
            }
            else if(number == 9){
                stan = false;
            }
            else if(number == 8){
                System.out.println("to jest if z 8");
            }
            else {
                System.out.println("brak rezultatu");
            }
            number++;
        }while (stan);




        /// zad 2 pętle
        int f,g,h;
        f = g = 1;
        int numberOfCalculations = 10;
        System.out.print(f + "\t" + g + "\t" );
        for (int i = 0; i < numberOfCalculations;i++){
            // f = 1 g = 2  h = 3
            h = f + g;
            f = g;
            g = h;
            System.out.print(h + "\t");

        }
        System.out.println();
        int choice = 1;

        switch (choice){
            case 1 -> System.out.println("1");
            case 6 -> System.out.println("6");
            default -> System.out.println("error");
        }

        switch (choice){
            case 1:
                System.out.println("1");
                System.out.println("dodatkowa informacja + 1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("error 2");
        }

        switch (choice){
            case 1 -> {
                System.out.println("1");
                System.out.println("dodatkowa informacja");
            }
            case 6 -> System.out.println("6");
            default -> System.out.println("error");
        }
        String haslo = "h";



        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe całkowitą dodatnią (1,6,7):");
        int option = scanner.nextInt();

        System.out.println("Podaj hasło :");
        String password = scanner.next();



        if(option == 1){
            System.out.println("1");
            if(password.equals("h")){
                System.out.println("hasło jest poprawne");
            }
            else {
                System.out.println("hasło nie jest poprawne");
            }
        }
        else if(option == 6){
            System.out.println("6");
        }
        else if(option == 7){
            System.out.println("7");
        }
        else {
            System.out.println("zła liczba");
        }

        // Zad 4 pętle

        // nested for
        // wiersze
        for(int i = 1; i < 10;i++){
            // kolumny
            for (int j = 1; j < 10;j++){
                if( (j*i) % 6 == 0 ){
                    System.out.print(j*i + "\t");
                }
                else {
                    System.out.print("X\t");
                }

            }
            System.out.println();
        }





    }
}
