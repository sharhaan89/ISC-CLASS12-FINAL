package ComputerProjectClass12_2;

public class LinkedList {
    
    Node head;
    
    static class Node {
        int data;
        Node next;
        
        Node(int d) {
            data = d;
        }
    }
    
    public void printList() {
        Node n = head;
        while(n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public void push(int d) {
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
    }


    public static void main(String args[]) {
        
        LinkedList a = new LinkedList();
        a.head = new Node(10);
        a.push(9);
        a.push(3);
        a.push(2);
        a.printList();
    }
}

/*
OUTPUT
2 3 9 10

ALGORITHM
1. Start
2. Create the main class LinkedList with a subclass Node.
3. Create function printList() to print the full list, run n from head till null
4. Create function push(int data) to insert data in the linked list.

VARIABLE DESCRIPTION TABLE
+---------------+------+------------------------------+
| Variable Name | Type | Function                     |
+---------------+------+------------------------------+
| data          | int  | Store the data value in node |
+---------------+------+------------------------------+
| d             | int  | Argument of push function    |
+---------------+------+------------------------------+
*/