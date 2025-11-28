package kunal;

public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null)return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = head;
        ListNode prev = dummy;

        while(curr != null && curr.next != null){
            ListNode temp = curr.next;

            curr.next = temp.next;
            temp.next = curr;

            prev.next = temp;

            prev = curr;
            curr = curr.next;
        }
        return dummy.next;
    }
}
