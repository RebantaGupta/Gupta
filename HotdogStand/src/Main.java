import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println("How many HotDogs? ");
        Scanner dogs = new Scanner(System.in);

        String hotDogs = dogs.nextLine();
        double costOfHotDogs = Integer.parseInt(hotDogs) * 5.50;

        System.out.println("How many Drinks? ");
        Scanner drinks = new Scanner(System.in);

        String drink = drinks.nextLine();
        double costOfDrinks = Integer.parseInt(drink) * 2;

        System.out.println("Cost of HotDogs = $" + costOfHotDogs);
        System.out.println("Cost of Drinks = $" + costOfDrinks);
    }
}