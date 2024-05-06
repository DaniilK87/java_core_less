package homework2.Task2;


/**
 * Написать функцию, возвращающую разницу между самым большим и самым
 * маленьким элементами переданного не пустого массива.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1111,1112,34,2,78,21,17,13,14};
        System.out.println(diffElements(array));
    }

    private static int diffElements(int[] array) {
        if (array.length == 0) throw new RuntimeException("Пустой массив");
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];

            if (array[i] > max) max = array[i];
        }
        return max - min;
    }
}
