package hack.amazon;

public class LinkedListSecondHalf {
	
	public static class LNode {
		
		public int data;
		public LNode next;
		
		public LNode (int x) {
			this.data = x;
		}
	}
	
	public static LNode reverse(LNode head) {
		
		if (head == null) {
			return null;
		}
		
		if (head.next == null) {
			return head;
		}
		LNode fast = head;
		LNode slow = head;
		LNode pre = null;
		
		while (fast != null && fast.next != null) {
			pre = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		pre.next = reverseLinkedList(slow);
		return head;
	}
	
	public static LNode reverseLinkedList (LNode head) {
		LNode pre = null;
		LNode curr = head;
		LNode next = null;
		
		while (curr != null) {
			next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}
		
		return pre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LNode node1 = new LNode(2);
		LNode node2 = new LNode(1);
		LNode node3 = new LNode(3);
		LNode node4 = new LNode(4);
		LNode node5 = new LNode(5);
		LNode node6 = new LNode(6);
		LNode node7 = new LNode(7);
		LNode node8 = new LNode(8);
		LNode node9 = new LNode(9);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		display(node1);
		System.out.println();
		reverse(node1);
		display(node1);
		System.out.println();
	}

	public static void display(LNode head) {
		LNode start = head;

		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

}