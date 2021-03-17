package pomoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // usuwanie elementu z tablicy
        Scanner scanner = new Scanner(System.in);

        double[] array = new double[10];
        for(int i = 0; i < 10; i++){
            array[i] = i;
            System.out.println(array[i]);
        }
        int stanKoszyka = array.length;
        System.out.println("Usuń produkt:");
        int choice = scanner.nextInt();

        for(int j = choice; j < stanKoszyka - 1 ; j++){
            array[j] = array[j+1];
            System.out.println(array[j]);
        }

        stanKoszyka -= 1;
        System.out.println("Po usunięciu:");
        for(int i = 0; i < stanKoszyka; i++){
            System.out.println(array[i]);
        }



    }
}
