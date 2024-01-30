
/**
 * Recursive binary search
 *
 * @Cindy
 * @Jan 30
 */
public class BinarySearch
{
    
    public static void main(String[] args)
    {
        int[] arr={2, 3, 5, 10, 13, 14};
        System.out.println(binarySearch(arr, 0, 5, 10));
    }
    
    public static int binarySearch(int[] nums, int start, int end, int key)
    {
        if(start>end){
            return -1;
        }
        
        int mid=(end+start)/2;
        if(nums[mid]==key){
            return mid;
        }else if(nums[mid]>key){
            return binarySearch(nums, start, mid-1, key);
        }else{
            return binarySearch(nums, mid+1, end, key);
        }
    }
}
