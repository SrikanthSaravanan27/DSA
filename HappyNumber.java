class Solution {
    public boolean isHappy(int n) {
        int slow = value(n);
        int fast = value(value(n));
        while(fast != slow){
            slow = value(slow);
            fast = value(value(fast));
            if(slow == 1){
                return true;
            }
        }
        if(slow == 1){
                return true;
        }
        return false;
    }
    public int value(int n){
        int sum = 0;
        while(n != 0){
            int r = n%10;
            sum += r*r;
            n = n/10;
        }
        return sum;
    }
}
