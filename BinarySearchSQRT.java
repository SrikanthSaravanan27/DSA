public class BinarySearchSQRT {
    public static void main(String[] args) {
        System.out.println(Newton(36));
    }
    public static double sqrt(int n){
        int s=0;
        int e=n;
        double root = 0;
        while(s<e){
            int m = (s+e)/2;
            System.out.println(m);
            if(m*m == n){
                return m;
            }
            if(m*m > n){
                e=m-1;
            }
            else {
                s=m+1;
            }
        }
        int p =2;
        double inc = 0.1;
        for(int i=0;i<p;i++){
            while(root*root<n){
                root +=inc;
            }
            root -= inc;
            inc = inc/10;
        }
        return root;
    }
    static double Newton(int n){
        double root = 0;
        double x = n;
        while(true){
            root = 0.5*(x+n/x);
            if(Math.abs(root-x)<1){
                break;
            }
            x = root;
        }
        return root;
    }
}
