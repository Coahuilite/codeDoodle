import java.util.Arrays;

public class array_test {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        char a22[] = {'a', 'b', 'c', 'd', 'e'};
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            System.out.println(a22[i]);
        }
        for(int i : arr){
            System.out.println(i);
        }
        int[][][] arr3d = {
                { {1, 2, 3}, {4, 5, 6} },
                { {7, 8, 9}, {10, 11, 12} }
        };
        for(int[][] arr2d : arr3d){
            for(int[] arr1d : arr2d){
                for(int i : arr1d){
                    System.out.println(i);
                }
            }
        }
        int[] operatethis = new int[10];
        for(int nums : operatethis){
            System.out.println(nums);
        }
        Arrays.fill(operatethis,114);
        for(int nums : operatethis) {
            System.out.println(nums);
        }
        System.out.println(operatethis[0] = 514);
        for(int i=1;i<operatethis.length;i++){
            operatethis[i]++;
            System.out.println(operatethis[i]);
        }
        int[] operatethat = operatethis;
        System.out.println(operatethat[0]);
        System.out.println(arr3d.length);
        System.out.println(operatethat.length);
    }
}
