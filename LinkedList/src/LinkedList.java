import java.util.NoSuchElementException;

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
        Node newNode  = new Node(item);
        if(isNull())
            head = tail = newNode;
        else{
           tail.next = newNode;
           tail = newNode;
        }
    }

    // @Desc: addFirst method
    // @Access: Public
    public void addFirst(int item){
        Node newNode = new Node(item);
        if(isNull())
            head = tail = newNode;
        else{
            newNode.next = head;
            head = newNode;
        }

    }

    // @Desc: indexOf method
    // @Access: Public
    public int indexOf(int item){
        /*
        * While there are still more items in the list,
        * Iterate through the list until you find an index that has
        * the item as its value.
        * */
        Node current = head;
        int index = 0;
       while(current != null){
           if(current.value == item)
               return index;
           current = current.next;
           index++;
       }
       return -1;
    }

    // @Desc: contains method
    // @Access: Public
    public boolean contains(int item){
        /*
        * Iterate through the list
        * Return true if list contains item passed
        *
        * */
        Node current = head;
        int index = 0;
        while(current != null){
            if(current.value == item)
                return true;
            current = current.next;
            index++;
        }
        return false;
    }
    // @Desc: deleteHead method
    // @Access: Public
    public void deleteHead(){
        /*
        * Remove the head node from the list by setting
        * the head as the second node in the list
        * */
        if(isNull()){
            throw new NoSuchElementException();
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        var tempHead = head.next;
        head = null;
        head = tempHead;
    }

    // @Desc: deleteTail method
    // @Access: Public
    public void deleteTail(){
        if(isNull())
            throw new NoSuchElementException();
        if(head == tail){
            head = tail = null;
            return;
        }
        var current = head;
        Node prev = null;
        while(current != null){
            if(current.next == tail){
                 prev = current;
                break;
            }
            current = current.next;
        }
        
        tail = prev;
        prev.next = null;


    }


    private boolean isNull(){
       return head == null;
    }

} // End of LinkedList class
