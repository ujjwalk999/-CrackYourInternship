class Solution {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp =temp.next;
        }

         length = (length / 2) + 1;
        for (int i = 1; i < length; i++) {
            head = head.next;
        }
        return head;
         
    }
}
