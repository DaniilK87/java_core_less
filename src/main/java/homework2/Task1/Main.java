package homework2.Task1;

/**
 * Написать метод, возвращающий количество чётных элементов массива.
 * countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0;
 */
public class Main {

    public static void main(String[] args) {
        int[]array = {1,2,4,6,8,3,5,7,11,10,12};
        int result = countEvens(array);
        System.out.println(result);
    }

    private static int countEvens (int[]array) {
        int countEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) countEvens++;
        }
        return countEvens;
    }
}
