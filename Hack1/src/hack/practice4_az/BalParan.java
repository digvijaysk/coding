package hack.amazon;

public class BalParan {

  	public static int balance(String st){
  		
  		if (st.equals("")) {
  			return 0;
  		}
		int counter =0;
		int numBalancedSets=0;
		int len= st.length();
		for (int i = 0; i < len; i++) {
			if (counter < 0) {
				return -1;
			}

			if (st.charAt(i) == '(') {
				counter++;
			}
			if (st.charAt(i) == ')') {
				counter--;
				numBalancedSets++;
			}
		}
  		
		if(counter==0){
			return numBalancedSets;
		}
		else{
			return -1;
		}
  		
  		
  		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "()()(";
		int bal= balance(st);
		System.out.println(bal);
		
		
	}

}
