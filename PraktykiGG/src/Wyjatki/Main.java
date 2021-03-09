package Wyjatki;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        try {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Podaj integer A :");
//            int A = scanner.nextInt();
//            System.out.println("Podaj integer B :");
//            int B = scanner.nextInt();
//            System.out.println("Liczba A = " + A + "\tLiczba B = " + B + "\nKONIEC PROGRAMU");
//            scanner.close();
//        }
//        catch (InputMismatchException inputMismatchException){
//            System.out.println("Bad input");
//        }
//        finally {
//            System.out.println("Finish");
//        }


//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.println("Podaj integer A :");
//            int A = scanner.nextInt();
//            System.out.println("Podaj integer B :");
//            int B = scanner.nextInt();
//            System.out.println("Liczba A = " + A + "\tLiczba B = " + B);
//            isNatural(A,B); // odwołanie do metody
//
//            System.out.println(A/B);
//        } catch (ArithmeticException arithmeticException){
//            System.out.println("Nie dzielimy przez 0");
//        } catch (InputMismatchException exception){
//            System.out.println("Podano zły typ danych :(");
//        } catch (Exception exception){
//            System.out.println("To nie była liczba dodatnia");
//        }
//        finally {
//            System.out.println("\nKONIEC PROGRAMU");
//            scanner.close();
//        }



        int[] array = new int[10];
        Random random = new Random();
        int intRandom;
        try {
            for (int i = 0; i < 11; i++) {
                intRandom = random.nextInt(99);
                array[i] = intRandom;
                System.out.println(array[i]);
            }
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("tablica jest już pełna nie można wpisać więcej danych");
        }


    }

    public static void isNatural(int a, int b) throws Exception {
//zgłaszamy wyjątek Exception // throws ostrzega o wyjątku
        if(b<0 || a<0){
            throw new Exception();// Tworzymy obiekt i zgłaszamy wyjątek
        }
    }


}


