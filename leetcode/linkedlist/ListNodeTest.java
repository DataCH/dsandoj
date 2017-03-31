package leetcode.linkedlist;

public class ListNodeTest {

	public static void showList(ListNode head) {
		if (head != null) {
			StringBuilder sb = new StringBuilder();
			while (head != null) {
				sb.append(head.val).append("->");
				head = head.next;
			}
			sb.append("end");
			System.out.println(sb.toString());
		} else {
			System.out.println("list is null");
		}
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		ListNode head = node1;
		showList(head);

		/*
		 * RemoveDuplicatesFromSortedList solution = new
		 * RemoveDuplicatesFromSortedList(); ListNode resList =
		 * solution.deleteDuplicates(head); showList(resList);
		 */

		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		ListNode resList = reverseLinkedList.reverseList(head);
		showList(resList);

		/*
		 * RemoveLinkedListElements removeLinkedListElements = new
		 * RemoveLinkedListElements(); ListNode resList =
		 * removeLinkedListElements.removeElements(head, 3); showList(resList);
		 */

		/*
		 * LinkedListCycle test = new LinkedListCycle();
		 * System.out.println(test.hasCycle(head));
		 */

	}

}
