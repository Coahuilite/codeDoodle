public class exercises_1_multi_dimensional_array {
    public static void main(String[] args){
        // 用二维数组表示的学生成绩:
        int[][] scores = {
                { 82, 90, 91 }, // 学生甲的语数英成绩
                { 68, 72, 64 }, // 学生乙的语数英成绩
                { 95, 91, 89 }, // ...
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        // TODO:
        double average;
        double sum = 0;
        int count = 0;
        for (int[] score : scores) {
            for (int i : score) {
                sum += i;
                count++;
            }
        }
        average = sum / count;
        System.out.println("sum is "+sum);
        System.out.println("average is "+average);
        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
