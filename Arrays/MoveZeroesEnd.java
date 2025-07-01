// Problem: Move All Zeroes to End
// Platform: GeeksForGeeks
// Link: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751
// Time Complexity: O(n)
// Space Complexity: O(1)

// Code below
class MoveZeroesEnd {
    void pushZerosToEnd(int[] arr) {
        int count=0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
}