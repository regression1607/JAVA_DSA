import java.util.Scanner;

public class Range {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter the start number");
         int first = sc.nextInt();
         System.out.println("Enter the end number");
         int end =sc.nextInt();
         for(int i = first; i<=end; i++){
             System.out.println(i);
             if (isprime(i) == true){
                 System.out.println(i + " is prime");
             }
             else{
                 System.out.println(i + " is not prime");
             }
         }
    } 
    public static boolean isprime(int n){
        if (n<=1){
            return false;
        }
        else{
            for (int i=2; i<=Math.sqrt(n); i++){
                if (n%i == 0){
                    return false;
                }
            }
            return true;
        }
    }   
}
