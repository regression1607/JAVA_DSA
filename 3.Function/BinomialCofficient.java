
public class BinomialCofficient {
    public static void main(String args[]){
        int n = 5;
        int r = 2;
        int result = factorial(n) / (factorial(r) * factorial(n-r));
        System.out.println("Binomial Cofficient is " + result);
    }
    public static int factorial(int n){
        int fact =1;
        for (int i=1 ;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
}
