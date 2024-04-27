public class HalfPramid {
    public static void main(String[] args) {
        System.out.println("This is a right half pyramid pattern program in Java.");
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.err.print(star);
            }
            System.out.println();
        }
    }
}
