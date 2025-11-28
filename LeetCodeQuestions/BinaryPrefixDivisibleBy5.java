package kunal;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy5 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int rem = 0;
        List<Boolean> ans = new ArrayList<>(nums.length);
        for (int i : nums){
            rem = ( rem * 2 + i ) % 5 ;
            ans.add(rem % 5==0 );
        }
        return ans;
    }
}
