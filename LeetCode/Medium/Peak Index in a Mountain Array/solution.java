class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1; // Peak right 
            } 
            else {
                right = mid; // Peak = left side 
            }
        }
        //left = right on peak ele 
        return left;
    }
}