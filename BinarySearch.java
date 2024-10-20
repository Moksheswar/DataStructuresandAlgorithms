import java.util.*;
public class BinarySearch {
    static boolean bs(int[] arr,int n){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==n)
                return true;
            else if(arr[mid]>n)
                high=mid;
            else
                low=mid+1;
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={6,2,3,1,5,4};
        Arrays.sort(arr);
        int n=6;
        if(bs(arr,n))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}