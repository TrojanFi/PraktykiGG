package projekty.salon;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // lista samochodów - edytowane
        ArrayList<String> cars = new ArrayList<>(50);

        // lista która nie może być edytowana - opcje menu
        List<String> options = List.of("Dodaj auto","Dodaj auto po indeksie","Podmień auto po indeksie","Usuń auto po indeksie", "Usuń auto po nazwie", "Sprawdzenie czy dane auto jest","Posortowanie aut","Wyciądnięcie auta po indeksie i wyświetlenie nazwy","Wyświetlenie liczby aut","Usunięcie wszystkich aut","Wyświetl wszystkie auta", "Wyjście");

        // deklaracja scannera do pobrania danych od użytkownika
        Scanner scanner = new Scanner(System.in);

        // stan wyjścia z pętli  do while
        boolean exit = true;

        do{
            try {
                System.out.println("Wybierz jedna z opcji :");
                for (int i = 0; i < options.size(); i++) {
                    System.out.println("[" + i + "] " + options.get(i));
                }
                // pobranie danych od użytk
                int userInput = scanner.nextInt();


                switch (userInput) {
                    case 0:
                        System.out.println("Podaj nazwe auta które chcesz dodać");
                        String newCar = scanner.next();
                        cars.add(newCar);
                        break;
                    case 7:
                        System.out.println("Lista aut\n" + cars);
                        System.out.println("Wybierz auto podająć index (0-...):");
                        // tu będzie wyjątek ponieważ int
                        int carIndex = scanner.nextInt();
                        System.out.println("Wybrane auto to : " + cars.get(carIndex));
                        break;
                    case 9:
                        System.out.println("Czy napewno chcesz usunac wszystkie auta? tak [y], nie [n]:");
                        String answer = scanner.next();
                        if (answer.equals("tak")) {
                            cars.clear();
                            System.out.println("Usunięto wszystkie auto z salonu");
                        } else {
                            System.out.println("Nie usunięto aut");
                        }
                        break;
                    case 10:
                        System.out.println("Wszystkie auta w salonie\n" + cars);
                        break;
                    case 11:
                        System.out.println("Wyjście z salonu");
                        exit = false;
                        break;
                    default:
                        System.out.println("Brak takiej opcji");
                }
            }catch (InputMismatchException inputMismatchException){
                System.out.println("Podane złe dane wejściowe");
                scanner.next();
            }
        }while (exit);
    }
}
