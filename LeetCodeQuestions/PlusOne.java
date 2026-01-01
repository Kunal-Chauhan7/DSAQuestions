package kunal;

public class PlusOne {
    public  int[] plusOne(int[] digits) {
        int length = digits.length;
        int[] ans = null;
        for (int i = length - 1 ; i >= 0 ; i--){
            if(digits[i] ==  9){
                digits[i] = 0;
            }
            else{
                digits[i]++;
                ans = digits;
                break;
            }
            if(i==0){
                ans = new int[length+1];
                ans[0] = 1;
                System.arraycopy(digits, 1, ans, 1, length - 1);
            }
        }
        return ans;
    }
}
