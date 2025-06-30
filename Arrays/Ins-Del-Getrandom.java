// Problem: Insert Delete GetRandom O(1)
// Platform: Leetcode
// Link: https://leetcode.com/problems/insert-delete-getrandom-o1/description/?envType=study-plan-v2&envId=top-interview-150
// Time Complexity: O(1)
// Space Complexity: O(n)

// Code below
import java.util.*;
class RandomizedSet {
    private ArrayList<Integer> list;
    private HashMap<Integer,Integer> map;
    private Random rand;

    public RandomizedSet() {
        list = new ArrayList<Integer>();
        map = new HashMap<Integer,Integer>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        map.put(val,list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int idx = map.get(val);
        int lastelement = list.get(list.size()-1);
        list.set(idx,lastelement);
        map.put(lastelement,idx);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        int randidx = rand.nextInt(list.size());
        return list.get(randidx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */