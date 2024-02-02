public class CountNumberOfOccurencee {
    public static void main(String[] args) {
        System.out.println(count(123222,0));
    }
    public static int count(int n,int c){
        if(n == 0){
            return c;
        }
        if(n%10 == 5){
            return count(n/10,c+1);
        }
        return count(n/10,c);
    }
}
