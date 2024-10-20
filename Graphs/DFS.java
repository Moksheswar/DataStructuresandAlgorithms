import java.util.*;
public class DFS {
    public static void dfs(int start,boolean[] vis,List<List<Integer>> l,List<Integer> res){
        vis[start]=true;
        res.add(start);
        for(Integer i:l.get(start)){
            if(vis[i]==false){
                dfs(i,vis,l,res);
            }
        }
    }
    public static void main(String args[]){
        int n=5; //m=6
        List<List<Integer>> l=Arrays.asList(
            Arrays.asList(),
            Arrays.asList(2,3),
            Arrays.asList(1,4,5),
            Arrays.asList(1,4),
            Arrays.asList(2,3,5),
            Arrays.asList(2,4)
        );
        int start=1;
        List<Integer> res=new ArrayList<>();
        boolean[] vis=new boolean[n+1];
        vis[start]=true;
        dfs(start,vis,l,res);
        System.out.println(res);
    }
}