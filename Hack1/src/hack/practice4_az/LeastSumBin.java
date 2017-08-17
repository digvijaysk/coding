package hack.amazon;

import java.util.*;
import java.io.*;

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

class LeastSumBin {

	public static int getLeast(Node root) {
		int leftSum = Integer.MAX_VALUE;
		int rightSum = Integer.MAX_VALUE;

		if (root.left != null) {
			leftSum = getLeast(root.left);
		}

		if (root.right != null) {
			rightSum = getLeast(root.right);
		}

		if (root.right == null && root.left == null) {
			return root.data;
		}

		return Math.min(leftSum, rightSum) + root.data;
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		for (int i = T; i > 0; i--) {

			int data = sc.nextInt();
			root = insert(root, data);

		}
		int sum = getLeast(root);
		System.out.println(sum);
	}
}
