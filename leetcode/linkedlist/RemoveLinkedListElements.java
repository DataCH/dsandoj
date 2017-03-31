package leetcode.linkedlist;

public class RemoveLinkedListElements {

	public ListNode removeElements(ListNode head, int val) {
		if (null == head) {
			return head;
		}
		if (val == head.val) {
			head = removeElements(head.next, val);
		} else {
			head.next = removeElements(head.next, val);
		}
		return head;
	}
}
