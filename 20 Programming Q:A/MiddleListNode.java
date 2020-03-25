//Cole Constantino | Given a non-empty, singly linked list with head node, return middle node of linked list.
//If there are two middle nodes, return the second.
public class MiddleListNode{
  public static ListNode middleNode(ListNode head) {
        int count = 0, done = 0;
        ListNode dummy = head; 
        while(dummy != null){
            dummy = dummy.next;
            done++;
        }
        done = done/2;
        while(count < done){
            head = head.next;
            count++;
        }
        return head;
    }
  
  public static void main(String[] args){
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(3);
    ListNode n4 = new ListNode(4);
    ListNode n5 = new ListNode(5);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    System.out.println(middleNode(n1).val);
  }
}

/*
 *   input: 1 -> 2 -> 3 -> 4 -> 5
 *  output: node(3) AKA 3 -> 4 -> 5
 */

class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}