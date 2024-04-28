public class HollowRectangle {
    public static void main(String[] args) {
        System.out.println("This is a hollow rectangle pattern program in Java.");
        int rows = 5;
        int columns = 5;
        for (int i = 1; i <= rows; i++) {
            for(int j=1;j<=columns;j++){
                if(i==1 || i==rows || j==1 || j==columns){
                System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
