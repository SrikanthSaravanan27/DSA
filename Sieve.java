public class Sieve {
    public static void main(String[] args) {
        boolean [] arr = new boolean[40];
        SoE(arr,40);
        for(int i=2;i< arr.length;i++){
            if(!arr[i]){
                System.out.println(i);
            }
        }
    }
    public static void SoE(boolean [] arr,int n){
        int c = 2;
        while(c*c < n){
            if(!arr[c]){
            for(int i=c*2;i<n;i+=c){
                arr[i] = true;
            }}
            c++;
        }
    }
}
