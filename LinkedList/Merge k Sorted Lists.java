class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> p=new PriorityQueue<>((a,b)->a.val-b.val);
      for(int i=0;i<lists.length;i++)
    {  
        ListNode x=lists[i];
        while(x!=null){
            p.add(x);
            x=x.next;
        }
    }

        ListNode ans=p.poll();
        ListNode temp=ans;
        while(p.size()>0){
            temp.next=p.poll();
            temp=temp.next;
        }
        if(temp!=null)
        temp.next=null;
        return ans;
    }
}
