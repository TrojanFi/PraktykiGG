package projekty.kasyno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Player playerOne = new Player("Steve",200.00,18,0);
        LuckyMachine luckyMachine = new LuckyMachine();
        Shop shop = new Shop();
        Rent rent = new Rent();
        shop.addRewards();

        int[][] array = new int[3][3];

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                array[i][j] = i+j;
                System.out.print(array[i][j] +"\t");
            }
            System.out.println();
        }



        Scanner scanner = new Scanner(System.in);
        boolean stan = true;
        do{
            if(playerOne.getMoney() <= 0 && playerOne.getAge() >= 18 && playerOne.getRent() < 3){
                System.out.println("Opcje:\nExit[0]\nPożyczka[1]\nshop[2]\ntwoje saldo = " + playerOne.getMoney() + "\nrewards = " + playerOne.getOurRewards());
                String choice = scanner.next();
                switch (choice) {
                    case "0" -> {
                        System.out.println("Exit");
                        stan = false;
                    }
                    case "1" -> {
                    rent.rentMoney(playerOne);
                    }
                    case "2" -> {
                       shop.buyReward(playerOne);
                    }
                    default -> System.out.println("Błąd");
                }
            }
            else if (playerOne.getAge() >= 18 && playerOne.getMoney() > 0){
                System.out.println("Opcje:\nExit[0]\nluckyMachine[1]\nshop[2]\ntwoje saldo = " + playerOne.getMoney() + "\nrewards = " + playerOne.getOurRewards());
                String choice = scanner.next();
                switch (choice) {
                    case "0" -> {
                        System.out.println("Exit");
                        stan = false;
                    }
                    case "1" -> {
                        luckyMachine.luckyMachineGame(playerOne);
                    }
                    case "2" -> {
                        shop.buyReward(playerOne);
                    }
                    default -> System.out.println("Błąd");
                }
            }
            else{
                System.out.println("jesteś niepełnoletni");
                stan = false;
            }

        }while (stan);


    }
}
