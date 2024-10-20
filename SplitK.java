public class SplitK {
    public static int find(int k){
        if(k<=2) return 1;
        int maxi=0;
        for(int i=1;i<k;i++){
            int a=i;
            int b=k-i;
            maxi=Math.max(maxi,a*Math.max(b,find(b)));
        }
        return maxi;
    }
    public static void main(String[] args){
        int k=10;
        System.out.println(find(k));
    }
}
