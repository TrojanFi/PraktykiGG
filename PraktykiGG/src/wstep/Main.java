package wstep;

public class Main {
    public static void sum(int a, int b, int c){
        int sum = a + b + c;
        System.out.println("Suma = " + sum);
        System.out.println("Hello World" + " :)");
        System.out.print("Hello World" + " :)");
        System.out.print("Hello World" + " :)\n");
    }
    // tutaj stworzymy sobie metode main (czyli metode główną)
    public static void main(String[] args) {

        // liczby całkowite  np. 78, -109, 234, ...
        int myIntA = 1;
        int myIntB = -32;
        int myIntC = 77;

        // Dodawanie zmiennych
        int sum = myIntA + myIntB + myIntC;
        System.out.println("Dodawanie : " + sum);

        // Odejmowanie zmiennych (NADPISANIE zmiennej sum)
        sum = myIntA - myIntB - myIntC;
        System.out.println("Odejmowanie : " + sum);

        // Mnożenie zmiennych (NADPISANIE ZNOWU zmiennej sum )
        sum = myIntA * myIntB * myIntC;
        System.out.println("Mnożenie : " + sum);

        // Dzielenie zmiennych (NADPISANIE ZNOWU zmiennej sum )
        sum = myIntA/2;
        System.out.println( "Dzielenie " + myIntA + " przez 2 : " + sum);
        sum = myIntB/2;
        System.out.println( "Dzielenie " + myIntB + " przez 2 : " + sum);
        sum = myIntC/2;
        System.out.println( "Dzielenie " + myIntC + " przez 2 : " + sum);

        System.out.println("UŻYCIE METODY sum()");
        sum(myIntA,myIntB,myIntC);

        // liczby zmiennoprzecinkowe (double > float)
        double myDoubleA = 2.34;
        double myDoubleB = 7;
        double myDoubleC = 0.66;

        double sumDouble = myDoubleA + myDoubleB + myDoubleC;
        System.out.println("Dodawanie Double : " + sumDouble);

        sumDouble = myDoubleA * myDoubleB * myDoubleC;
        System.out.println("Mnożenie Double : " + sumDouble);

        sumDouble = myDoubleA / myDoubleB / myDoubleC;
        System.out.println("Dzielenie Double : " + sumDouble);


        // znaki
        char myCharA = 'F';
        char myCharB = 'T';
        char myCharC = '$';

        System.out.println("Moje inicjały to : " + myCharA + myCharB);
        System.out.println("Mój ulubiony znak : " + myCharC);

        // Każdy znak ma przypisaną liczbe w tabeli ASCII (DODATKOWE/CIEKAWOSTKA)
        int sumChar = myCharA + myCharB + myCharC;
        System.out.println("Dodawanie w kodzie ASCII : " + sumChar);


        // ciągi znaków
        String myStringA = "Rafał";
        String myStringB = " ma ";
        String myStringC = "2";
        String myStringD = " duże psy.";

        String sumString = myStringA + myStringB + myStringC + myStringD;
        // "\n" przejście do następnej lini (ENTER)
        System.out.println(sumString + "\nChyba.");

        // boolean
        boolean myBoolean;
        myBoolean = false;
        System.out.println(myBoolean);
        System.out.println(!myBoolean);

    }
}
