package hack.test;

import java.util.HashSet;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		int x [] = {2,2};
		if(x.length < 2){
			
			//return 0;	
			
			
		}
		int min = Integer.MAX_VALUE;
		 for (int i : x){
			 if(min > i){
				 min = i;
			 }
		 }
		 Set<Integer> set = new HashSet<Integer>();
		 for (int i : x){
			 if(i != min){
				 set.add(i);
			 }
		 }
		 int secondMin = Integer.MAX_VALUE;
		 for (int i : set){
			 if(secondMin > i){
				 secondMin = i;
			 }
		 }
		 
		 if(secondMin == Integer.MAX_VALUE ){
			 secondMin = 0;
		 }
		 System.out.println(secondMin); 
	}

}
