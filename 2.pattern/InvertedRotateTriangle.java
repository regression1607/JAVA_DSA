public class InvertedRotateTriangle{
    public static void main(String[]args){
        System.out.println("This is an inverted rotate triangle pattern program in Java.");
        int n = 5;
        for(int i = 1; i <=n ; i++){
            for (int j = n-i+1; j>=1; j--){
                System.out.print(" ");
            }
            for (int z =i ; z>=1; z--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
