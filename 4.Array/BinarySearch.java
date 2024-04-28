public class BinarySearch {
    public static void main(String args[]) {
        int numbers[] = { 4, 43, 242, 256, 122, 9860, 6909, 898, 00, 8689 };
        int target = 25;
        int result = binarysearch(numbers, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Elemnt found at the index of "+ result);
        }
    }

    public static int binarysearch(int numbers[], int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] == target) {
                return mid;
            }
            if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
