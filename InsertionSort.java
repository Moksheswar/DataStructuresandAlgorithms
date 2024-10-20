class InsertionSort{
    static void selection(int[] arr,int n){
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int t=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=t;
                j--;
            }
        }
		for(int i:arr)
            System.out.print(i+" ");
    }
    public static void main(String args[]){
        int arr[]={6,2,3,1,5,4};
        selection(arr,arr.length);
    }
}