import java.util.*;
public class KthsamllAndlarge
{
	public static void main(String[] args) {
	    int k=3;
		PriorityQueue<Integer> q=new PriorityQueue<>((x,y)->x-y);
		int[] arr={3,1,8,2,9,10};
		for(int i:arr)
		    q.add(i);
        // System.out.println(q);
		int v=0;
		while(k>0){
		    v=q.poll();
		    k--;
		}
		System.out.println("Kth smallest : "+v);
        // System.out.println(q);
        q.clear();
        // System.out.println(q);
        q=new PriorityQueue<>((x,y)->y-x);
        for(int i:arr)
		    q.add(i);
        // System.out.println(q);
        k=3;
        v=0;
        while(k>0){
            v=q.poll();
            k--;
        }
        // System.out.println(q);
		System.out.println("Kth largest : "+v);
		//----------------------------------------------------OR------------------------------
		//For kth largest number use min-heap
		q.clear();
		q=new PriorityQueue<>((x,y)->x-y);
		k=3;
		for(int i:arr){
			if(q.size()<k)
				q.add(i);
			else{
				if(i>q.peek()){
					q.poll();
					q.add(i);
				}
			}
		}
		System.out.println(q);
		//For kth smallest number use max-heap
		q.clear();
		q=new PriorityQueue<>((x,y)->y-x);
		k=3;
		for(int i:arr){
			if(q.size()<k)
				q.add(i);
			else{
				if(i<q.peek()){
					q.poll();
					q.add(i);
				}
			}
		}
		System.out.println(q);
	}
}