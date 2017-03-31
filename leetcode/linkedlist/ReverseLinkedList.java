package leetcode.linkedlist;

public class ReverseLinkedList {

	/*
	 * public ListNode reverseList(ListNode head) { ListNode resList = null; if
	 * (head == null) { return resList; } ListNode prePointer = null; ListNode
	 * nextPointer = head; while (null != nextPointer.next) { prePointer =
	 * nextPointer; nextPointer = nextPointer.next; } if (null == prePointer) {
	 * return head; } resList = new ListNode(nextPointer.val); prePointer.next =
	 * null; resList.next = reverseList(head); return resList; }
	 */
	/*
	 * public ListNode reverseList(ListNode head) { ListNode resList = null; if
	 * (head == null) { return resList; } ListNode after = head; while (null !=
	 * after) { ListNode temp = after.next; after.next = resList; resList =
	 * after; after = temp; } return resList; }
	 */
	public ListNode reverseList(ListNode head) {
		ListNode resList = null;
		if (head == null) {
			return resList;
		}
		ListNode anchor = head;
		while (null != anchor) {
			ListNode temp = anchor.next;
			anchor.next = resList;
			resList = anchor;
			anchor = temp;
		}
		return resList;
	}

}
