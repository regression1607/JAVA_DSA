class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int nums1Size = nums1.length; int nums2Size = nums2.length;
    int nums3Size = nums1Size + nums2Size;
    int array[] = new int[nums3Size];
    int pos=0;
    for(int i =0 ; i<nums1Size;i++){
        array[i]=nums1[i];
        pos++;
    }
    for(int i =0 ; i<nums2Size;i++){
        array[pos]=nums2[i];
        pos++;
    }
    Arrays.sort(array);
    if(array.length%2 == 0){
        int mid = array.length/2; 
        return (array[mid-1]+array[mid])/2.0;
    }else{
       int mid = array.length/2;
       int Median = array[mid];
       return Median;
    }
    }
}