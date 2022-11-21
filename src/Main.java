import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter integers please ");
        System.out.println("(EOF or non-integer to terminate): ");

        while(scan.hasNextInt()){
            list.add(scan.nextInt());
        }

        Integer [] nums = list.toArray(new Integer[0]);
        for(int i = nums.length -1; i >= 0; i--){
            System.out.println(nums[i]);
        }
    }





}
