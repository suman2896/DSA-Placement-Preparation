// Problem: Second Largest
// Platform: GeeksForGeeks
// Link: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735
// Time Complexity: O(n)
// Space Complexity: O(1)

// Code below
class SecondLargest {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int largest=-1;
        int secondlargest=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }
}