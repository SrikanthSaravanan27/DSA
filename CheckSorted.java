public class CheckSorted {
    static boolean val = true;
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        
        check(arr, 0);
        System.out.println(simpleCheck(arr, 0));
        System.out.println(val);
    }
    public static void check(int [] arr,int i){
        if(i+1 <arr.length){
            if(arr[i]>arr[i+1]){
                val = !val;
            }
            check(arr, i+1);    
        }
        return;
    }
    public static boolean simpleCheck(int [] arr,int index){
        if(index == arr.length-1){
            return true;
        }
        return (arr[index]<arr[index+1]) && simpleCheck(arr, index+1);
    }
}
