public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int random = 0;
        int avg = 0;

        for(int i = 0; i < array.length; i++) {
            random =(int)(Math.random() * 100) + 1;
            array[i] = random;
        }
        avg = (array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9]) / 10;
        System.out.println("The average is " + avg);
    }
}