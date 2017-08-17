package hack.leetcode;

public class Add2LinkedList {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int num1 = 0;
		int num2 = 0;
		int exp = 0;
		while (l1.next != null || l2.next != null) {
			int power = (int) Math.pow(10, exp);
			if (l1.next != null) {
				num1 = num1 + power * l1.val;
				l1 = l1.next;
			}
			if (l2.next != null) {
				num2 = num2 + power * l2.val;
				l2 = l2.next;
			}
			exp++;
		}
		int res = num1 + num2;

		int r = res % 10;
		res = res / 10;
		ListNode out = new ListNode(r);

		while (res > 0) {
			r = res % 10;
			res = res / 10;
			ListNode tmp = out;
			out = new ListNode(r);
			out.next = tmp;
		}

		return out;

	}

	public static void main(String[] args) {
		ListNode out = new ListNode();
		addTwoNumbers();

	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
