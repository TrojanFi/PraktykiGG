package arrays;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {


        // deklaracji tablicy
        int[] array = {1,2}; // wielkość tablicy 2 -> pozycje: 0 , 1
        System.out.println("array[0] = " + array[0] + "\narray[1] = " + array[1]);
        System.out.println("Długość tablicy = " + array.length);


        System.out.println();
        int[] arrayInt = {1,2,3,4,5,6};

        for(int i = 0; i < arrayInt.length;i++){
            System.out.println("Array[" + i + "] = " + arrayInt[i]);
        }
        System.out.println();
        // String w tablicy
        String word = " Mam dużo kotów ";
        String[] symbol;
        // Ustalenie wielkości tablicy
        symbol = new String[word.length()];
        // wpisywanie symboli do tablicy
        symbol = word.split(" ");
//        System.out.println(symbol[8]);
        for(int i = 0; i < symbol.length;i++){
            System.out.println("Symbol[" + i + "] = " + symbol[i]);
        }

        // tablica Strngów gotowa
        String[] words = {"one","two","house","spider","flower"};

        for(String element : words){
            if(element.length() > 3){
                System.out.println("Word = " + element );
            }
        }

        //Tablica intów + modulo
        int[] numbers = {223,-123,456,765,345,55,-56};
        // liczby ujemne podzielne przez 3
        for(int value: numbers){
            if(value < 0 && value % 3 == 0){
                System.out.println(value);
            }
        }

        // Przykład 7
        Random random = new Random();
        int wylosowanaLiczba;
        for(int i = 0; i < 100; i++){
            wylosowanaLiczba = random.nextInt(3);// 0-2
            System.out.println("Wylosowano[" + i + "] = " + wylosowanaLiczba);
        }
        // Przykłąd 8
        Scanner scanner = new Scanner(System.in);
        String[] person = new String[4];// 0 - 3

        System.out.println("Podaj imie:");
        person[0] = scanner.next();
        System.out.println(person[0]);

        //przykład 5

        int max = 0;
        int min = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max) max = numbers[i];
            if(numbers[i] < min) min = numbers[i];
            System.out.println("El [" + i + "] = " + numbers[i]);
        }
        System.out.println("Zmiana miejsc");
        for (int j = 0;j < numbers.length; j++){
            if(numbers[j] == max){
                numbers[j] = min;
            }
            else if (numbers[j] == min) numbers[j] = max;
            System.out.println("El [" + j + "] = " + numbers[j]);
        }
        //przykład 6
        System.out.println("Odwrócenie tablicy\n");
        int numA;
        int numB;
        for(int i = 0; i < numbers.length/2;i++){
            numA = numbers[i]; // 0
            numB = numbers[numbers.length - 1 - i];/// 9 - 1 - 0 = 8
            numbers[i] = numB;
            numbers[numbers.length - 1 - i] = numA;
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println("El [" + i + "] = " + numbers[i]);
        }
        // przykład 4


    }
}
