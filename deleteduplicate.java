import java.util.*;

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class deleteduplicate {

    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {

        // empty list case
        if(head == null)
            return null;

        SinglyLinkedListNode temp = head;

        while(temp != null && temp.next != null) {

            if(temp.data == temp.next.data) {
                temp.next = temp.next.next;   // remove duplicate
            }
            else {
                temp = temp.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();  // number of test cases

        while(t-- > 0) {

            int n = scanner.nextInt();

            SinglyLinkedListNode head = null;
            SinglyLinkedListNode current = null;

            // create linked list
            for(int i = 0; i < n; i++) {

                int value = scanner.nextInt();

                if(head == null) {
                    head = new SinglyLinkedListNode(value);
                    current = head;
                }
                else {
                    current.next = new SinglyLinkedListNode(value);
                    current = current.next;
                }
            }

            // remove duplicates
            head = removeDuplicates(head);

            // print list
            current = head;

            while(current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }

            System.out.println();
        }

        scanner.close();
    }
}