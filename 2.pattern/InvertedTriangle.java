public class InvertedTriangle {
        public static void main (String[] args){
            System.out.println("This is a right inverted triangle pattern program in Java.");
            for (int line =1 ; line<=4 ; line++){
                for (int star =1; star<=4-line+1;star++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    
}
