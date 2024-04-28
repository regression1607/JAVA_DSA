import java.util.*;

public class Largest {
    public static void main (String args[]){
        int numbers[]={13,435,534,00,12,35};
        int largest = getlargest(numbers);
        System.out.println("largest number is " + largest);
    }
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0 ; i<numbers.length;i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
            if(numbers[i]<smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is " + smallest);
        return largest;
    }
}
