import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("factorial is " + fact);
    }
    public static int factorial(int n){
        int fact = 1;
        for (int i=1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
}
