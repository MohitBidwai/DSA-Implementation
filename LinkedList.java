public class LinkedList {

    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node head;
    Node tail;
    int size;

    public LinkedList() {

        this.head = null;
        this.tail = null;
        this.size = 0;

    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);

        if (head == null || tail == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            newNode.next = head;
            head = newNode;
        }

        size++;

    }

    public void insertAtTail(int data) {

        Node newNode = new Node(data);

        if (head == null || tail == null) {
            head = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }

        size++;
    }

    public void insertAtPostion(int postion, int data) {
        if (postion < 1 || postion > size + 1) {

            System.out.println("Insertion not possible at this position");
        }

        if (postion == 1) {
            insertAtHead(data);
            return;
        }

        if (postion == size + 1) {
            insertAtHead(data);
            return;
        }
        // if want to isnert in the middle
        Node prevNode = head;
        // Step first traversse to reach postion -1 ;
        // Starting position = 1
        // Number of movements = 1
        // Final position = 2
        // 1 + (3 - 2)
        // = 1 + 1
        // = 2
        for (int i = 1; i <= postion - 2; i++) {
            prevNode = prevNode.next;

        }

        Node newNode = new Node(data);

        // 10->20->30->40->50

        // prev = prev.next

        newNode.next = prevNode.next;
        prevNode.next = newNode;
        size++;

    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean searchInList(int target)
    {
        Node temp = head;
        while(temp!=null)
        {
            if(temp.data == target)
            {
              return  true;
            }
             temp = temp.next;   
        }


        return false;
    }

    public int findPosition(int target)
    {
        int index = 1;

        Node temp = head;
        while(temp!=null)
        {
            if(temp.data ==target)
            {
                return index;
            }
            
            temp = temp.next;
            index++;
        }

        return -1;

    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        if (list.isEmpty()) {
            System.out.println("Linked list is empty");
        }

        list.insertAtHead(10);
        list.printList();
        list.insertAtHead(20);
        list.printList();
        list.insertAtHead(30);
        list.printList();

        list.insertAtHead(100);
        list.printList();
        list.insertAtHead(110);
        list.printList();
        list.insertAtHead(120);
        list.printList();

        list.insertAtPostion(4, 300);
        list.printList();

        System.out.println("Found or not: " + list.searchInList(300));
        System.out.print("Target found at postion " + list.findPosition(300));
    }

}