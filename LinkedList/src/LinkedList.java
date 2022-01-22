public class LinkedList {

    // Nested Node class
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }// End of Node class

    // Data members of LinkedList
    private Node head, tail;


    // @Desc: addLast method
    // @Access: Public
    public void addLast(int item){
        Node node  = new Node(item);
        if(headIsNull())
            head = tail = node;
        else{
            tail.next = node;
            tail = node;
        }
    }

    // @Desc: addFirst method
    // @Access: Public
    public void addFirst(int item){
        Node node = new Node(item);
        if(headIsNull())
            head = tail = node;
        else{
            Node tempHead = head;
            head = node;
            head.next = tempHead;
        }

    }

    private boolean headIsNull(){
        boolean  isNull = false;
        if(head == null) {
              isNull =  true;
        }
        return isNull;
    }

} // End of LinkedList class
