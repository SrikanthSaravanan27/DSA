public class Gcd {
    public static void main(String [] args){
        int a = 8;
        int b = 12;
        int gcd = gcd(b,a);
        System.out.println(gcd);
        int lcm = (a*b)/gcd;
        System.out.println(lcm);
    }
    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}
