public class QuickSort {
    static int partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low,j=high;
        while(i<j){
            while(arr[i]<=pivot && i<high)
                i++;
            while(arr[j]>pivot && j>low)
                j--;
            if(i<j){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        int t1=arr[j];
        arr[j]=arr[low];
        arr[low]=t1;
        return j;
    }
    static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int p=partition(arr,low,high);
            quicksort(arr,low,p-1);
            quicksort(arr,p+1,high);
        }
    }
    public static void main(String[] args){
        int arr[]={6,2,3,1,5,4};
        quicksort(arr,0,arr.length-1);
        for(int i:arr)
            System.out.print(i+" ");
    }
}