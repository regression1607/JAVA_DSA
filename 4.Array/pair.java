
public class pair {
        public static void main(String args[]){
            int arr[]={2,4,6,8,10};
            printpair(arr);
        }
        public static void printpair(int numbers[]){
            int count = 0; // Initialize the variable count
            for (int i=0;i<numbers.length;i++){
                int curr = numbers[i];
               // Initialize the variable count
                for (int j=i+1;j<numbers.length;j++){
                    count = count +1; // Update the value of count
                    System.out.print("("+curr + "," + numbers[j] +" )");
                }
                System.out.println();
                System.out.println("Total number of pairs are " + count);
            }
        }
}
