package leetcode.linkedlist;

public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {
		boolean res = false;
		if (null == head || null == head.next) {
			return res;
		}
		ListNode anchorA = head;
		ListNode anchorB = head;
		while (null != anchorA && null != anchorB) {
			anchorA = anchorA.next;
			anchorB = anchorB.next;
			if (null != anchorB) {
				anchorB = anchorB.next;
			} else {
				break;
			}
			if (anchorA == anchorB) {
				res = true;
				break;
			}
		}
		return res;
	}

}
