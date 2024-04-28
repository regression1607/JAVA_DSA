public class Reverse {
        public static void main (String args[]){
            int numbers[]={1,2,3,4,5,6,7,8,9};
            resverse(numbers);
            for(int i =0 ; i<numbers.length;i++){
                System.out.print(numbers[i]+",");
            }
        }
        public  static void resverse(int numbers[]){
            int first =0;
            int last = numbers.length-1;
            for (int i =first;i<last ; i++){
                int temp = numbers[first];
                numbers[first] = numbers[last];
                numbers[last] = temp;
                first ++;
                last --;
            }
        }
}
