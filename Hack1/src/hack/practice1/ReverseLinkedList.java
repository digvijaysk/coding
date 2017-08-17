package hack.dhiraj;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {

	
	public static LNode reverseLinkedList(LNode list){
		LNode temp = list;
		int listSize = 0;
		
		while (temp != null){
			listSize++;
			temp = temp.next;
		}
		
		List<LNode> halfList = new ArrayList<LNode>();
		
		for(int i=0; i<listSize/2; i++){
			
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
