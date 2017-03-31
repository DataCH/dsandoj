package leetcode.linkedlist;

public class MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode res = null;
		if (null == l1) {
			return l2;
		}
		if (null == l2) {
			return l1;
		}
		if (l1.val <= l2.val) {
			res = l1;
			l1.next = mergeTwoLists(l1.next, l2);
		} else {
			res = l2;
			l2.next = mergeTwoLists(l1, l2.next);
		}
		return res;
	}

}
