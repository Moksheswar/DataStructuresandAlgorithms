import java.util.*;
public class Union {
    public static void main(String args[]){
        int[] a={1,1,3,3,5,8};
        int[] b={1,3,3,5,6};
        List<Integer> l=new ArrayList<>();
        int l1=a.length;
        int l2=b.length;
        int i=0,j=0;
        while(i<l1 && j<l2){
            if(a[i]<=b[j]){
                if(l.size()==0 || l.get(l.size()-1)!=a[i]){
                    l.add(a[i]);
                }
                i++;
            }
            else{
                if(l.size()==0 || l.get(l.size()-1)!=b[j]){
                    l.add(b[j]);
                }
                j++;
            }
        }
        while(i<l1){
            if(l.size()==0 || l.get(l.size()-1)!=a[i]){
                l.add(a[i]);
            }
            i++;
        }
        while(j<l2){
            if(l.size()==0 || l.get(l.size()-1)!=b[j]){
                l.add(b[j]);
            }
            j++;
        }
        System.out.println(l);
    }
}
