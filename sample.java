import java.util.*;
public class sample {
    public static void main(String[] args) {
        String s="ABCD";
        int ans=0;
        for(char c:s.toCharArray())
            ans+=(int)c;
        System.out.println(ans);

        int[] arr={5,3,2,3,1,2,2,1,1,1,4};
        int[] h=new int[100];
        for(int i:arr)
            h[i]++;
        int[][] res=new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            if(h[arr[i]]>0){
                res[i][0]=arr[i];
                res[i][1]=h[arr[i]];
            }
        }
        for(int[] it:res)
            System.out.print(Arrays.toString(it));
        System.out.println();
        Arrays.sort(res,(x,y)->x[0]-y[0]);
        Arrays.sort(res,(x,y)->y[1]-x[1]);
        for(int[] it:res)
            System.out.print(Arrays.toString(it));
            System.out.println();
        int[] b=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            b[i]=res[i][0];
        }
        System.out.println(Arrays.toString(b));
    }
}
