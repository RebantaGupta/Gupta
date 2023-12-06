import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        int n = N.nextInt();

        while(n >= 0) {
            System.out.println(Fibonacci_Squence.fibsqu(n));
            n = N.nextInt();
        }
    }
}