package loops;

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


    }
}
