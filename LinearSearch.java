public class LinearSearch {
    static boolean ls(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n)
                return true;
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={6,2,3,1,5,4};
        int n=6;
        if(ls(arr,n))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
