import java.util.Comparator;
import java.util.Random;
import java.util.Arrays;
import java.util.Stack;

public class try_array_sort {
    public static void main(String[] args) {
        Random random = new Random();

        // 生成一个一维乱序数组
        int[] oneDimensionalArray = new int[10]; // 例如，一个包含10个元素的数组
        for (int i = 0; i < oneDimensionalArray.length; i++) {
            oneDimensionalArray[i] = random.nextInt(100); // 生成 0-99 的随机整数
        }

        // 生成一个二维乱序数组
        int[][] twoDimensionalArray = new int[4][5]; // 例如，一个 4x5 的二维数组
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                twoDimensionalArray[i][j] = random.nextInt(100); // 生成 0-99 的随机整数
            }
        }

        // 打印生成的数组以验证
        System.out.println("生成的一维乱序数组: " + Arrays.toString(oneDimensionalArray));

        System.out.println("生成的二维乱序数组:");
        for (int[] row : twoDimensionalArray) {
            System.out.println(Arrays.toString(row));
        }

        // 对一维数组进行排序
        Sorter.sortArray_bubbleSort(oneDimensionalArray);
        System.out.println("排序后的一维数组： "+ Arrays.toString(oneDimensionalArray));

        // 对二维数组排序
        for(int i =0;i<twoDimensionalArray.length-1;i++){
            Sorter.sortArray_bubbleSort(twoDimensionalArray[i]);
        }
        Arrays.sort(twoDimensionalArray, Comparator.comparingInt(row->row[0]));
        System.out.println("排序后的二维数组:");
        for (int[] row : twoDimensionalArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}
class Sorter {
    public static void sortArray_bubbleSort(int[] array) {
        int tmp;
        for(int i = 0;i<array.length-1;i++){
            for(int j = 0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
}