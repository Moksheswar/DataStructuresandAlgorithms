import java.util.*;
public class Topological_Sort {
    public static void dfs(int ind,List<List<Integer>> adj,boolean[] vis,Stack<Integer> s){
        vis[ind]=true;
        for(Integer it:adj.get(ind)){
            if(!vis[it])
                dfs(it,adj,vis,s);
        }
        s.push(ind);
    }
    public static void main(String[] args) {
        int v=6;
        List<List<Integer>> adj=Arrays.asList(
            Arrays.asList(),
            Arrays.asList(),
            Arrays.asList(3),
            Arrays.asList(1),
            Arrays.asList(0,1),
            Arrays.asList(0,2)
        );
        boolean[] vis=new boolean[v];
        Arrays.fill(vis,false);
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<v;i++){
            if(!vis[i])
                dfs(i,adj,vis,s);
        }
        while(!s.isEmpty())
            System.out.print(s.pop()+" ");
    }
}