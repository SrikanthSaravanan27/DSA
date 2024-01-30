public class Biatonic {
    public static void main(String [] args){
        int [] arr = {0,1,2,5,6,4,3};
        System.out.println(Pivot(arr));
    }
    public static int Pivot(int [] arr){
        int start = 0;
        int end = arr.length;
        while(start<end){
            int mid = (start + end)/2;
            if(mid+1<arr.length && arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
    public static int PivotForRotatedArray(int [] arr){
        int start = 0;
        int end =arr.length;
        while(start<end){
            int mid = (start + end)/2;
            if(mid+1<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if (mid-1>start && arr[mid]<arr[mid-1]){
                return mid;
            }
            if(arr[start]<arr[mid]){
                start = mid;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
