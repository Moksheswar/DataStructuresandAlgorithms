public class MergeSort {
    static void merge(int[] arr,int low,int mid,int high){
        int[] temp=new int[low+high+1];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=arr[i];
            k++;
            i++;
        }
        while(j<=high){
            temp[k]=arr[j];
            k++;
            j++;
        }
        for(i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
    }
    static void mergesort(int[] arr,int low,int high){
        if(low==high)   //if(low>=high)
            return;
        int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args){
        int[] arr={6,2,3,1,5,4};
        mergesort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
