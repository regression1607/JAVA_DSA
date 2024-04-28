import java.util.Scanner;

public class LinearSearch {
    public static void main (String args[]){
        int numbers[] = {331,32,673,254,245,76,247,28,89,410};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        int Key = sc.nextInt();
        int index = LinearSearch(numbers, Key);
        if (index == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index " + index);
        }

    }
    public static int LinearSearch(int arr[], int key){
        for (int i=0; i<=arr.length;i++){
            if (arr[i]==key) {
                return i;
            }
        }
        return -1;

    }
}
