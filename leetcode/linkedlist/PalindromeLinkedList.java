package leetcode.linkedlist;

public class PalindromeLinkedList {

	public boolean isPalindrome(ListNode head) {
		boolean res = false;
		if (null == head) {
			return true;
		}
		ListNode tail = head;
		while (null != tail.next) {
			tail = tail.next;
		}
		return res;
	}

}
