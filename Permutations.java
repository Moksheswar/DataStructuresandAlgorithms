public class Permutations {
    static void perm(String s,String r){
        if(s.length()==0){
            System.out.println(r);
            return;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String st=s.substring(0, i)+s.substring(i+1);
            perm(st,r+c);
        }
    }
    public static void main(String args[]){
        String str="abc";
        perm(str,"");
    }
}