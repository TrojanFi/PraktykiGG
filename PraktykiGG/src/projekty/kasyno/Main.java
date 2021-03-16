package projekty.kasyno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Player playerOne = new Player("Steve",200.00,18);
        LuckyMachine luckyMachine = new LuckyMachine();


        Scanner scanner = new Scanner(System.in);
        boolean stan = true;
        do{
            System.out.println("Opcje:\nExit[0]\nluckyMachine[1]\ntwoje saldo = " + playerOne.getMoney());
            String choice = scanner.next();
            switch (choice) {
                case "0" -> {
                    System.out.println("Exit");
                    stan = false;
                }
                case "1" -> {
                    luckyMachine.luckyMachineGame(playerOne);
                }
                default -> System.out.println("Błąd");
            }

        }while (stan);


    }
}
