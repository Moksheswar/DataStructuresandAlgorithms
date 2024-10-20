import java.util.*;
class Pair{
    int node;
    int dis;
    public Pair(int node,int dis){
        this.node=node;
        this.dis=dis;
    }
}
public class Prims {
    public static void main(String[] args) {
        int v=5;
        List<List<List<Integer>>> adj=Arrays.asList(
            Arrays.asList(Arrays.asList(1,5),Arrays.asList(2,4)),
            Arrays.asList(Arrays.asList(0,5),Arrays.asList(2,6)),
            Arrays.asList(Arrays.asList(0,4),Arrays.asList(1,6),Arrays.asList(3,2),Arrays.asList(4,2)),
            Arrays.asList(Arrays.asList(2,2),Arrays.asList(4,1)),
            Arrays.asList(Arrays.asList(2,2),Arrays.asList(3,1))
        );
        // System.out.println(adj);
        PriorityQueue<Pair> q=new PriorityQueue<Pair>((x,y) -> x.dis - y.dis);
        q.add(new Pair(0,0));
        int[] vis=new int[v];
        int sum=0;
        while(!q.isEmpty()){
            int wt=q.peek().dis;
            int node=q.peek().node;
            q.poll();
            if(vis[node]==1)
                continue;
            vis[node]=1;
            sum+=wt;
            for(List<Integer> it:adj.get(node)){
                int edw=it.get(1);
                int adjnode=it.get(0);
                if(vis[adjnode]==0)
                    q.add(new Pair(adjnode,edw));
            }
        }
        System.out.println(sum);
    }
}
