package projekty.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Sklep gdzie musimy zrobić zakupy. Trzeba wybrac 5 produktów by wyjść ze sklepu. Jak weźmiemy produkt to ma on zniknąć z pocji

        // produkty w sklepie
        String[] shop = {"Bananas","Orange","Bread","Yogurt","CornFlakes","Chicken","Tomato","Chocolate","Rice","Pasta","Honey","Strawberry","Cheese","Lettuce"};
        // koszyk o pojemności 5
        String[] basket = new String[5];

        Scanner scanner = new Scanner(System.in);

        boolean fullBasket = false;
        int numberOfItemsInBasket = 0;

        do{
            try {
                System.out.println("\n Wybierz produkt ze sklepu : ");
                for (int i = 0; i < shop.length; i++) {
                    System.out.println("[" + i + "] = " + shop[i]);
                }
                int yourChoice = scanner.nextInt();


                if (yourChoice <= shop.length && yourChoice >= 0) {

                    if (!shop[yourChoice].equals("empty")) {
                        basket[numberOfItemsInBasket] = shop[yourChoice];
                        shop[yourChoice] = "empty";
                        numberOfItemsInBasket++;
                    } else {
                        System.out.println("NIe ma takiego produktu");
                    }

                } else {
                    System.out.println("Nie ma takiej opcji w sklepie");
                }

                if (numberOfItemsInBasket == 5) fullBasket = true;
                System.out.println("Twój koszyk:");
                for (int i = 0; i < numberOfItemsInBasket; i++) System.out.println("[" + i + "] = " + basket[i]);
            }catch (InputMismatchException inputMismatchException){
                System.out.println("zły typ danych");
                scanner.next();
            }
        }while (!fullBasket);
        System.out.println("Wyszedłeś ze sklepu");

    }
}
