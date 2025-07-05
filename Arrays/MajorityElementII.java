// Problem: Majority Element II
// Platform: GeeksForGeeks
// Link: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/majority-vote
// Time Complexity: O(n)
// Space Complexity: O(1)

// Code below
import java.util.*;
class MajorityElementII {
    public ArrayList<Integer> findMajority(int[] arr) {
        int n = arr.length;
        int ele1=-1;
        int ele2=-1;
        int cnt1=0;
        int cnt2=0;
        for(int ele:arr){
            if(ele1==ele){
                cnt1++;
            }
            else if(ele2==ele){
                cnt2++;
            }
            else if(cnt1==0){
                ele1=ele;
                cnt1++;
            }
            else if(cnt2==0){
                ele2=ele;
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        int cnt11=0;
        int cnt22=0;
        for(int ele:arr){
            if(ele1==ele){
                cnt11++;
            }
            if(ele2==ele){
                cnt22++;
            }
        }
        if(cnt11>n/3){
            res.add(ele1);
        }
        if(cnt22>n/3){
            res.add(ele2);
        }
        if(res.size()==2 && res.get(0) > res.get(1)){
            int temp = res.get(0);
            res.set(0,res.get(1));
            res.set(1,temp);
        }
        return res;
    }
}