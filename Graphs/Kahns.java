import java.util.*;
public class Kahns {
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
        int[] indegree=new int[v];
        for(int i=0;i<v;i++){
            for(Integer it:adj.get(i))
                indegree[it]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<v;i++){
            if(indegree[i]==0)
                q.add(i);
        }
        List<Integer> kahn=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            kahn.add(node);
            for(Integer it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
        System.out.println(kahn);
    }
}
