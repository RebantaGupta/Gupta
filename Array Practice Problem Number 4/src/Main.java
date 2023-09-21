public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int random = 0;
        int x = 0;

        for(int i = 0; i < array.length; i++) {
            random = (int)(Math.random() * 100) + 1;
            array[i] = random;
            x = i;
            System.out.println("Array[" + x + "]: " + array[i]);
        }
        array[9] = array[0];
        array[8] = array[1];
        array[7] = array[2];
        array[6] = array[3];
        array[5] = array[4];

        for(int y = 0; y < array.length; y++) {
            System.out.println("Swapped Array[" + y + "]: " + array[y]);
        }
    }
}