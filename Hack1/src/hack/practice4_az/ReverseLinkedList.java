package hack.amazon;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// Node n5 = new Node(5, null);
		Node n4 = new Node(4, null);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);

		Node list = reverseList(n1);
		System.out.println(list.val);
		while (list.next != null) {
			list = list.next;
			System.out.println(list.val);

		}
	}

	public static class Node {
		public int val;
		public Node next;

		Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}

	public static Node reverseList(Node list) {
		int count = 1;
		Node temp = list;
		while (temp.next != null) {
			temp = temp.next;
			count++;
		}
		if (count <= 2) {
			return list;
		}
		Node mid = list;
		for (int i = 0; i < count / 2 - 1; i++) {
			mid = mid.next;
		}
		Node prev = mid;
		Node midNext = mid.next;
		Node cur = mid.next;
		while (cur != null) {
			Node tmp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = tmp;
		}
		mid.next = prev;
		midNext.next = null;
		return list;
	}

}
