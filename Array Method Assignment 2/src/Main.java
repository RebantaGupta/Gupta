import java.util.Scanner;

public class Main {
    public static int[] array(int[] array, int num, int loc) {
        int[] arr = new int[array.length + 1];
        int x = 0;

        for(int i = 0; i < arr.length; i++) {

            if(i < loc) {
                x = i;
                arr[i] = array[i];
                System.out.println("Array[" + x + "]: " + arr[i]);
            }
            else if(i == loc) {
                x = i;
                arr[i] = num;
                System.out.println("Array[" + x + "]: " + arr[i]);
            }
            else {
                arr[i] = array[i - 1];
                x = i;
                System.out.println("Array[" + x + "]: " + arr[i]);
            }
        }

        return array;
    }
    public static void main(String[] args) {
        System.out.println("Please ENTER the amount of values you want: ");
        Scanner index = new Scanner(System.in);
        int dex = Integer.parseInt(index.next());

        System.out.println("Please ENTER the value you want to insert in the array: ");
        Scanner number = new Scanner(System.in);
        int num = Integer.parseInt(number.next());

        System.out.println("Please ENTER the location you want to insert in the array: ");
        Scanner location = new Scanner(System.in);
        int loc = Integer.parseInt(number.next());

        int[] array = new int[dex];

        for(int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }

        array(array, num, loc);
    }
}