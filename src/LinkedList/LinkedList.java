public class LinkedList {

    /**
     * addNode - this method is created to add data to linedList
     *
     * @param head - accepting head pointer of LinkedList to manipulate it
     * @param data - accepting data to put it in linkedList
     * @return head - it returns head of linkedList
     *
     */
    public Node addNode(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node pointer = head;

            while (pointer.next != null) {
                pointer = pointer.next;
            }

            pointer.next = newNode;
        }

        return head;
    }

    public void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("LinkedList is empty");
        } else {
            Node pointer = head;
            while (pointer != null) {
                System.out.print(pointer.data + " ");
                pointer = pointer.next;
            }
        }
    }

    public Node deleteNodeFromStart(Node head) {
        System.out.println("Deleted node from start : " + head.data);
        head = head.next;
        return head;
    }

    public void deleteNodeFromEnd(Node head) {
        Node pointer = head;
        Node prev = null;

        while (pointer.next != null) {
            prev = pointer;
            pointer = pointer.next;
        }
        System.out.println("Deleted node from end : " + pointer.data);
        prev.next = null;
    }

    public void deleteFromSpecificLocation(Node head, int positionOfNodeToBeDeleted) {

    }
}