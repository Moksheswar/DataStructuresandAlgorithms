class BubbleSort{
    static void selection(int[] arr,int n){
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
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