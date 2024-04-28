public class CharacterPattern {
    public static void main(String[] args) {
        System.out.println("This is a character pattern program in Java.");
        int n = 4;
        char ch ='A';
        for  (int line =1 ; line<= n;line++){
            for( int character=1; character<=line;character++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
} 

