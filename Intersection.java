import java.util.*;
public class Intersection {
    public static void main(String args[]){
        int[] a={1,1,3,3,5,8};
        int[] b={1,3,3,5,6,7,8};
        List<Integer> l=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j])
                i++;
            else if(a[i]>b[j])
                j++;
            else{
                l.add(a[i]);
                i++;
                j++;
            }
        }
        System.out.println(l);
    }
}