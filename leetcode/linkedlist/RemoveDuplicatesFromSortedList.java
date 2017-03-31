package leetcode.linkedlist;

public class RemoveDuplicatesFromSortedList {

	public ListNode deleteDuplicates(ListNode head) {
		if (null == head || null == head.next) {
			return head;
		}
		ListNode anchor = head;
		ListNode start = anchor.next;
		while (null != start) {
			if (anchor.val == start.val) {
				anchor.next = start.next;
			} else {
				anchor = start;
			}
			start = start.next;
		}
		return head;
	}

}
