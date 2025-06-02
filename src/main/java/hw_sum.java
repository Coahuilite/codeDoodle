import java.util.Scanner;

public class hw_sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        short sum = 0;
        short nums = 0;
        do{
            System.out.print("Enter a number to add to the sum (0 to stop): ");
            nums = Short.parseShort(input.nextLine());
            sum += nums;
        }while(nums !=0);
        System.out.println("The sum of the numbers is: " + sum);
        input.close();
    }
}
