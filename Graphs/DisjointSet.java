import java.util.*;
class Disjoint{
    List<Integer> rank=new ArrayList<>();
    List<Integer> parent=new ArrayList<>();
    public Disjoint(int n){
        for(int i=0;i<=n;i++){
            rank.add(0);
            parent.add(i);
        }
    }
    public int findulp(int u){
        if(u==parent.get(u))
            return u;
        int ulp=findulp(parent.get(u));
        parent.set(u,ulp);
        return parent.get(u);
    }
    public void union(int u,int v){
        int ulp_u=findulp(u);
        int ulp_v=findulp(v);
        if(ulp_u==ulp_v)
            return;
        if(rank.get(ulp_u)<rank.get(ulp_v))
            parent.set(ulp_u,ulp_v);
        else if(rank.get(ulp_u)>rank.get(ulp_v))
            parent.set(ulp_v,ulp_u);
        else{
            parent.set(ulp_v,ulp_u);
            int r=rank.get(ulp_u);
            rank.set(ulp_u,r+1);
        }
    }
}
public class DisjointSet {
    public static void main(String[] args) {
        Disjoint d=new Disjoint(7);
        d.union(1,2);
        d.union(2,3);
        d.union(4,5);
        d.union(6,7);
        d.union(5,6);
        if(d.findulp(3)==d.findulp(7))
            System.out.println("Same");
        else
            System.out.println("Not Same");
        d.union(3,7);
        if(d.findulp(3)==d.findulp(7))
            System.out.println("Same");
        else
            System.out.println("Not Same");
        // System.out.println(d.parent);
    }
}
