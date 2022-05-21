// Q4
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
// The overall run time complexity should be O(log (m+n)).

public class Median2SortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr3 = new int[n1 + n2];
        mergeArrys(nums1, nums2, n1, n2, arr3);
        int mid = (n1 + n2) / 2; 
        if((n1 + n2) % 2 == 0){
            return (arr3[mid] + arr3[mid - 1]) / 2.0;
        }else{
            return arr3[mid];
        }
    }

    public static void mergeArrys(int[] nums1, int[] nums2, int n1, int n2, int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                arr3[k] = nums1[i];
                i++;
            } else {
                arr3[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr3[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr3[k] = nums2[j];
            j++;
            k++;
        }
    }
}