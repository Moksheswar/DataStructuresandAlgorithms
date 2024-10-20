class SelectionSort{
    static void selection(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            int t=arr[min];
            arr[min]=arr[i];
            arr[i]=t;
        }
		for(int i:arr)
            System.out.print(i+" ");
    }
    public static void main(String args[]){
        int arr[]={6,2,3,1,5,4};
        selection(arr,arr.length);
    }
}