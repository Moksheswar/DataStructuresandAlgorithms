public class Rotation {
    public static void main(String[] args){
        int[] arr={3,4,5,1,2};
        int[] res=new int[arr.length];
        int k=2;
        for(int i=0;i<arr.length;i++)
            res[(i+k)%arr.length]=arr[i];
        for(int i:res)
            System.out.print(i+" ");
    }
}
