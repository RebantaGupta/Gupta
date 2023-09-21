public class Main {
    public static int[] array(int[] array, int num) {
        int[] arr = new int[array.length + 1];
        int x = 0;

        for(int i = 0; i < array.length; i++) {
            arr[i] = array[i];
            x = i;
            System.out.println("Array[" + x + "]: " + arr[i]);
        }
        arr[array.length] = num;
        System.out.println("Array[" + array.length + "]: " + arr[array.length]);
        return array;
    }
    public static void main(String[] args) {
        int[] array = new int[10];

        for(int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
        array(array, 4);
    }
}