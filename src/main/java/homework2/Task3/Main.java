package homework2.Task3;

/**
 * Написать функцию, возвращающую истину,
 * если в переданном массиве есть два соседних элемента, с нулевым значением.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,0,0,5,2,2,12,45};
        System.out.println(zeroElements(array));
    }

    private static boolean zeroElements(int[] array) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 & array[i] == array[i++]) result = true;
        }
        return result;
    }
}
