package leetcode.linkedlist;

public class IntersectionOfTwoLinkedLists {

	public int lenOfList(ListNode head) {
		int len = 0;
		while (null != head) {
			len++;
			head = head.next;
		}
		return len;
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode res = null;
		int lenA = lenOfList(headA);
		int lenB = lenOfList(headB);
		ListNode anchorA = headA;
		ListNode anchorB = headB;
		if (lenA < lenB) {
			while (lenA < lenB) {
				anchorB = anchorB.next;
				lenA++;
			}
		} else if (lenA > lenB) {
			while (lenA > lenB) {
				anchorA = anchorA.next;
				lenB++;
			}
		}
		while (null != anchorA && null != anchorB) {
			if (anchorA.val == anchorB.val) {
				res = anchorA;
				break;
			}
			anchorA = anchorA.next;
			anchorB = anchorB.next;
		}
		return res;
	}
}
