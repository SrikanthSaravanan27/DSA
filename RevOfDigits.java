public class RevOfDigits {
    public static void main(String[] args) {
        System.out.println(rev(723));
    }
    static int ans = 0;
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int r = n % 10;
        ans =  ans*10 + r;
        sum(n/10);
        return ans;
    }

    public static int rev(int n){
        int digits = (int)(Math.log10(n)) + 1;
        System.out.println(digits);
        return helper(n,digits);
    }
    public static int helper(int n,int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10,digits-1) + helper(n/10, digits-1);
    }
}
