import java.util.*;
public class Array{
    public static void main(String[] args) {
        int [] numbers=new int[5];
        Scanner in=new Scanner (System.in);
        for(int i=0;i<numbers.length;i++){
            numbers[i]=in.nextInt();
            for (i=0;i<numbers.length;i++){
                System.out.println(numbers[i]+" ");

            }
        }
    }

}