package arrays.homeWork;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // przykład 4
        int[] numbers = {12,655,33,45,55,78,98,-45,12,444,655,-11,73,67,2,5,-45,55,655};
        //  Dla tej samej tablicy wypisz wszystkie liczby które się powtarzają
        int[] multi;
        multi = new int[100];
        int position = 0;
        for (int i = 0; i < 100; i++) multi[i] = 0;
        for (int b = 0; b < numbers.length; b++){
            // int licznik = 0;
            for (int s = b + 1; s < numbers.length; s++){
                if (numbers[b] == numbers[s]){
                    // licznik++;
                    boolean jestLiczba = false;
                    for (int check = 0; check < multi.length; check++){
                        if (numbers[b] == multi[check]){
                            jestLiczba = true;
                        }
                    }
                    if(jestLiczba == false) {
                        multi[position] = numbers[b];
                        position++;
                    }
                }
            }
        }
        for (int i = 0; i < 100; i++) if(multi[i] != 0)System.out.print("Liczba " + multi[i] + " powtarza się w tablicy \n");

        System.out.println();
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

        System.out.println();
        //przykład 6
        System.out.println("Odwrócenie tablicy");
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


        System.out.println("");
        //przykład 7
        double[] power = { 23.45,-2.22, 45.90, 67.45,-56,234.11,-34.8,90.4,-77};
        // Tworzenie obiektu random
        Random random = new Random();

        for(int i = 0; i < 10; i++) {
            int losuj = random.nextInt(5); // GENEROWANA JEDNA LICZBA OD 0 - 4
            System.out.print(losuj + "\t");
        }

        System.out.println();
        // Dla tej samej Tablicy wybierz 2 liczby losowo i je porównaj.
        int losujLiczbe1 = random.nextInt(power.length);
        int losujLiczbe2 = random.nextInt(power.length);
        if(power[losujLiczbe1] > power[losujLiczbe2]) System.out.println("Liczba " + power[losujLiczbe1] + " jest wieksza od liczby  " + power[losujLiczbe2]);
        else if(power[losujLiczbe1] < power[losujLiczbe2]) System.out.println("Liczba " + power[losujLiczbe2] + " jest wieksza od liczby " + power[losujLiczbe1]);
        else System.out.println("Liczby " + power[losujLiczbe1] + " i " + power[losujLiczbe2] + " sa równe");


        // przykład 8
        // Scanner do tablicy (Budowa postaci)
        System.out.println();
        String[] postac;
        postac = new String[4];
        int wybrane = 0;
        Scanner person = new Scanner(System.in);
        do{
            System.out.println("Wybierz Imie:");
            String option = person.nextLine();
            postac[0] = option;
            wybrane++;
            System.out.println("Wybierz Rasa:");
            option = person.nextLine();
            postac[1] = option;
            wybrane++;
            System.out.println("Wybierz Klasa:");
            option = person.nextLine();
            postac[2] = option;
            wybrane++;
            System.out.println("Wybierz Broń:");
            option = person.nextLine();
            postac[3] = option;
            wybrane++;


        }while (wybrane != 4);
        System.out.println("Twoja Postać to :");
        for(int i = 0;i < postac.length; i++ ) System.out.println(postac[i]);

    }
}
