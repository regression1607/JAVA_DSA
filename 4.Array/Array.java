
public class Array {
    public static void main (String args[]){
        int marks[] ={98,99,100};
        incrementarray(marks);
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
    public static void incrementarray(int marks[]){
        for (int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }
}
