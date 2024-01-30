public class Pivot {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6,7};
        int target = 1;
        System.out.println(binarySearch(arr,target,0,arr.length)
    }

public static boolean binarySearch(int [] nums,int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return true;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
}
