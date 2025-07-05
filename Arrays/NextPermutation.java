// Problem: Next Permutation
// Platform: GeeksForGeeks
// Link: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/next-permutation5226
// Time Complexity: O(n)
// Space Complexity: O(1)

// Code below
class Solution {
    @SuppressWarnings("unused")
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivot = -1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot==-1){
            reverse(arr,0,n-1);
            return;
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]>arr[pivot]){
                swap(arr,i,pivot);
                break;
            }
        }
        reverse(arr,pivot+1,n-1);
    }
    void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void reverse(int arr[],int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}