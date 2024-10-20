import java.util.*;
class StringPerm{
    public static void find(int[] arr,List<List<Integer>> ans,List<Integer> l,boolean[] vis){
        if(l.size()==arr.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!vis[i]){
                vis[i]=true;
                l.add(arr[i]);
                find(arr,ans,l,vis);
                l.remove(l.size()-1);
                vis[i]=false;
            }
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        boolean[] vis=new boolean[arr.length];
        find(arr,ans,l,vis);
        System.out.println(ans);
    }
}