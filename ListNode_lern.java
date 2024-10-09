package selbst_lernen_beispiel;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class ListNode_lern {
  public static void printlist(ListNode head){
    ListNode current = head;

    while(current != null){
        System.out.println(current.val);
        if(current.next != null){
            System.out.println("->");
        }
        current = current.next;
    }
  }

  public static void main(String[] args) {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    
    printlist(node1);

  }
}
    

