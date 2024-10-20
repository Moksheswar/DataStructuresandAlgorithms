import java.util.*;
// class Sort implements Comparator<Integer>{
//     @Override
//     public int compare(Integer a,Integer b){
//         if(a%10 > b%10)
//             return 1;
//         else
//             return -1;
//     }
// }
class CustomSort{
    public static void main(String[] args) {
        Comparator<Integer> cmp=new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                if(a%10 > b%10)
                    return 1;
                else
                    return -1;
            }
        };
        List<Integer> l=Arrays.asList(25,92,14,38,41);
        Collections.sort(l,cmp);
        // Collections.sort(l,new Sort());
        System.out.println(l);
    }
}