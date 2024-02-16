public class RepresentingNumber {
    public static void main(String[] args) {
        System.out.println(count("",38));
    }
    public static int count(String p,int target){
        if(target == 0){
            return 1;
        }
        int count = 0;
        for(int i=1;i<3 && i<=target;i++){
            count += count(p+i,target-i);
        }
        return count;
    }
}
