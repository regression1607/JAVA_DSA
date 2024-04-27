public class RightTriangle {
    public static void main (String[] args){
        System.out.println("This is a right triangle pattern program in Java.");
        for (int line =1 ; line<=5 ; line++){
            for (int star =1; star<=line;star++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
