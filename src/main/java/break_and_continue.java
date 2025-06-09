public class break_and_continue {
    public static void main(String[] args){
        for(int i = 0;i <10 ;i ++){
            System.out.println("Now number is "+ i);
            if(i == 5){
                break;
            }
        }
        int nums = 0;
        for(int j =10;j!=0;j--){
            System.out.println("Now number start with "+ j);
            if(j%2==0){
                continue;
            }
            nums += j;
            System.out.println("Sum of odd numbers is "+ nums);
        }
        System.out.println("End of program, nums is "+nums);
    }
}
