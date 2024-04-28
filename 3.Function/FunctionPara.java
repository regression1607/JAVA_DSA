import java.util.*;

public class FunctionPara {
    public static int sumnumber(int a , int b){  //parameters or formal parameters
        System.out.println("sumnumber function is called");
        int sum = a + b;
return sum;
   }
    public static void main(String args[]){
        System.out.println("main function is called");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumnumber(a, b);  //arguments or actual parameters
        System.out.println("sum is " + sum);
    }
}