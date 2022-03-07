package LinkedList;
public class LinkedList {

    /**
     * addNode - this method is created to add data to linkedList
     *
     * @param head - accepting head pointer of LinkedList to manipulate it
     * @param data - accepting data to create new node and add it in linkedList
     * @return head - it returns head of linkedList
     *
     */
    public Node addNode(Node head, int data) {
        /*
         * New node is created with the parameter data
         */
        Node newNode = new Node(data);

        /*
         * If the param head is null, new node will be head
         * else a separate pointer is created with head
         * and pointer will be moved to last node in the list with while loop
         * after reaching last node, it's next will be assigned to new node that was created earlier
         */
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

    /**
     * addNodeAsHead - Node will be added to head instead of tail
     * @param head - accepting head pointer of LinkedList to manipulate it
     * @param data - accepting data to create new node and add it in linkedList
     * @return head - it returns head of linkedList
     */
    public Node addNodeAsHead(Node head, int data ){
        /*
         * New node is created with the parameter data
         */
        Node newNode = new Node(data);
        /*
        * If the list already have a head, new node's next will point to head.
        * And head of the linkedList will be changed to new node.
        */
        if (head != null) {
            newNode.next = head;
        }

        head = newNode;
        return head;
    }

}