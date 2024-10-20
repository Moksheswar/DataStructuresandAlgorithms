import java.util.*;
public class PriorityQ {
    public static void main(String[] args) {
        Queue<Integer> p=new PriorityQueue<>();
        int[] arr={5,1,9,2,0};
        for(int i=0;i<arr.length;i++)
            p.add(arr[i]);
        while(!p.isEmpty())
            System.out.print(p.poll()+" ");
    }
}
