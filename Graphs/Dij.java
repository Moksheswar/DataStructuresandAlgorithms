import java.util.*;
public class Dij { // We can use PriorityQueue and Set but using QUeue makes worst possible way to implement
    static class Pair{ // It does not work when it contains negative weights or negative cycles(sum of path is less than 0)
        int distance;
        int node;
        public Pair(int distance,int node){
            this.distance=distance;
            this.node=node;
        }
    }
    public static void main(String[] args) {
        int v=6;
        int src=0;
        List<List<List<Integer>>> adj=Arrays.asList(
            Arrays.asList(Arrays.asList(1,4),Arrays.asList(2,4)),
            Arrays.asList(Arrays.asList(0,4),Arrays.asList(2,2)),
            Arrays.asList(Arrays.asList(0,4),Arrays.asList(1,2),Arrays.asList(3,3),Arrays.asList(4,1),Arrays.asList(5,6)),
            Arrays.asList(Arrays.asList(2,3),Arrays.asList(5,2)),
            Arrays.asList(Arrays.asList(2,1),Arrays.asList(5,3)),
            Arrays.asList(Arrays.asList(2,6),Arrays.asList(3,2),Arrays.asList(4,3))
        );
        // System.out.println(adj);
        PriorityQueue<Pair> q=new PriorityQueue<Pair>((x,y) -> x.distance - y.distance);
        int[] dis=new int[v];
        for(int i=0;i<v;i++)
            dis[i]=(int)(1e9);
        dis[src]=0;
        q.add(new Pair(0,src));
        while(!q.isEmpty()){
            int distance=q.peek().distance;
            int node=q.peek().node;
            q.poll();
            for(int i=0;i<adj.get(node).size();i++){
                int d=adj.get(node).get(i).get(1);
                int n=adj.get(node).get(i).get(0);
                if(distance+d<dis[n]){
                    dis[n]=distance+d;
                    q.add(new Pair(dis[n],n));
                }
            }
        }
        for(int i=0;i<v;i++){
            if(dis[i]==(int)(1e9))
                dis[i]=-1;
        }
        System.out.println(Arrays.toString(dis));
        for(int i=0;i<v;i++){
            System.out.println(src+" to "+i+" -> "+dis[i]);
        }
    }
}
