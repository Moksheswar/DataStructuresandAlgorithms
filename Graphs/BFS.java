import java.util.*;
public class BFS {
    public static void main(String args[]){
        int n=5; //m=3
        List<List<Integer>> l=Arrays.asList(
            Arrays.asList(),
            Arrays.asList(2,3),
            Arrays.asList(1,4,5),
            Arrays.asList(1,4),
            Arrays.asList(2,3,5),
            Arrays.asList(2,4)
        );
        System.out.println(l);
        int start=1;
        Queue<Integer> q=new LinkedList<>();
        List<Integer> bfs=new ArrayList<>();
        boolean[] vis=new boolean[n+1];
        q.add(start);
        vis[start]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            bfs.add(node);
            for(Integer i:l.get(node)){
                if(vis[i]==false){
                    vis[i]=true;
                    q.add(i);
                }
            }
        }
        System.out.println(bfs);
    }
}