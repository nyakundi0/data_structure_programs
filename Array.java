import java.util.*;
public class Array {

    public static void main(String[] args) {
        int [] numbers=new int[7];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<numbers.length;i++){
            System.out.println("please enetr 7 num bers below to store in ana array");
            numbers[i]=in.nextInt();
            System.out.println("the numbers in the array are:");
            for(i=0;i<numbers.length;i++){
                System.out.println(numbers[i]);
            }

        }
    }
}
