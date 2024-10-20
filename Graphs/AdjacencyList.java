import java.util.*;
class AdjacencyList{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,m;
        n=s.nextInt();
        m=s.nextInt();
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<=n;i++)
            l.add(new ArrayList<>());
        for(int i=0;i<m;i++){
            int u,v;
            u=s.nextInt();
            v=s.nextInt();
            l.get(u).add(v);
            l.get(v).add(u);
        }
        System.out.println(l);
        s.close();
    }
}