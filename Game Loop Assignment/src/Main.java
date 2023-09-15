import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int wins = 0;
        int losses = 0;

        System.out.println("Choose rock paper or scissors.  'r' for rock, 'p' for paper and 's' for scissors. To exit choose 'x'");
        System.out.println("**********************************************");

        System.out.println("Wins: " + wins + " Losses: " + losses);
        System.out.println("Players Choice: ");

        Scanner letter = new Scanner(System.in);
        String x = letter.next();

        String toExit = "x";
        String computersChoice = "p";

        while(!x.contains(toExit)) {

            if(!x.contains(computersChoice) && x.contains("s")) {
                System.out.println("You Win!");
                System.out.println("Computer Choice: paper  Player Choice: scissors");
                System.out.println("**********************************************");

                wins++;

                System.out.println("Wins: " + wins + " Losses: " + losses);
                System.out.println("Players Choice: ");

                x = letter.next();
            }
            else if(!x.contains(computersChoice) && x.contains("r")){
                System.out.println("You Lose!");
                System.out.println("Computer Choice: paper  Player Choice: rock");
                System.out.println("**********************************************");

                losses++;

                System.out.println("Wins: " + wins + " Losses: " + losses);
                System.out.println("Players Choice: ");

                x = letter.next();
            }
            else {
                System.out.println("Draw!");
                System.out.println("Computer Choice: paper  Player Choice: paper");
                System.out.println("**********************************************");
                System.out.println("Wins: " + wins + " Losses: " + losses);
                System.out.println("Players Choice: ");

                x = letter.next();
            }
        }

        System.out.println("BYE");

    }
}