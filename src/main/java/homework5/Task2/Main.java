package homework5.Task2;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3], и представляют собой, например, состояния ячеек поля для игры в крестикинолики,
 * где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом, 3 – резервное значение.
 * Такое предположение позволит хранить в одном числе типа int всё поле 3х3. Записать в файл 9 значений так, чтобы они заняли три байта
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int[] ar2 = {0,1,2,3,0,1,2,3,0};

        FileOutputStream fos = new FileOutputStream("save1.out");
        for (int b = 0; b < 3; b++) {
            byte wr = 0;
            for (int v = 0; v < 3; v++) {
                wr += (byte) (ar2[3 * b + v] << (v * 2));
            }
            fos.write(wr);
        }
        fos.flush();
        fos.close();

        int[] ar20 = new int[9];

       FileInputStream fis = new FileInputStream("save1.out");
        int b;
        int i = 0;
        while ((b = fis.read()) != -1) {
            for (int v = 0; v < 3; ++v) { // 3 values of four possible
                ar20[i++] = b >> (v * 2) & 0x3;
            }
        }
        fis.close();
        System.out.println(Arrays.toString(ar20));
    }
}
