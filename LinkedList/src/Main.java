
public class Main {

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addLast(12);
        list.addLast(22);

        list.addFirst(13);
        list.addLast(16);
        list.addLast(10);
        list.addFirst(1);

        System.out.println(list.indexOf(100));
        System.out.println(list.contains(100));
//        list.deleteHead();
//        list.deleteHead();
        list.deleteTail();

        System.out.println("Finished");

    }// End of main methods
} // End of Main class
