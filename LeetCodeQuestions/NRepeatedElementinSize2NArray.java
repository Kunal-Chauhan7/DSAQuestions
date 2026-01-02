package kunal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class NRepeatedElementinSize2NArray {

    public int repeatedNTimes(int[] nums) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int ansFrequency = nums.length/2;
//        for(int i : nums){
//            if
//                (!map.containsKey(i))map.put(i,1);
//            else
//                map.put(i,(map.get(i) + 1));
//            if(map.get(i) == ansFrequency)
//                return i;
//        }
//        return -1;
//        Arrays.sort(nums);
//        for(int i = 0 ; i < nums.length - 1 ; i++){
//            if(nums[i]==nums[i+1])return nums[i];
//        }
//        return -1;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)) return i;
            else set.add(i);
        }
        return 7;
    }

}