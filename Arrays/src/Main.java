/*
* Implementation of a dynamic array in Java
* Operations include
*   insert()
*   display()
*   deleteAt()
*   contains()
* */
public class Main {
    // Data members
    private int[] items;
    int count;


    // Constructor
    public Main(int arraySize){
        items = new int[arraySize];
    }

    // Main method
    public static void main(String[] args){

        Main arrayExample  = new Main(4);
        arrayExample.insert(5);
        arrayExample.insert(17);
        arrayExample.insert(9);
        arrayExample.insert(150);
        arrayExample.insert(6);

        arrayExample.display();
        arrayExample.deleteAt(0);
        System.out.println();
        System.out.println(arrayExample.contains(5));


    } // End of main method

    // @desc Display method
    // @access: Public
    public void display(){
        for(int i = 0; i < count; i++)
            System.out.print(items[i] + " ");
    }

    // @desc Insert method
    // @access: Public
    public void insert(int item){
        // We create a new array, copy old array content into new array
        // if the old gets filled up.
        if(items.length == count){
            int[] newArray = new int[count*2];
            for(int i = 0; i < count; i++){
                newArray[i] = items[i];
            }
            items = newArray;
         }
    // Put value at the end of the array and update the count value
        items[count] = item;
        count++;
    }

    // @desc Delete method
    // @access: Public
    public void deleteAt(int itemIndex){
        // If index exists or is valid,
        // loop through array and locate the item at index provided
        // Shift items from right to left to fill all available space.
        if(itemIndex < 0 || itemIndex >= count){
            throw  new IllegalArgumentException();
        }

        for(int i = itemIndex; i < count; i++){
            items[i] = items[i + 1];
        }
        count--;
    }

    // @desc Contains method
    // @access: Public
    public boolean contains(int item){
        for(int i = 0; i < count; i++){
            if(items[i] == item)
                return true;
        }
        return false;
    }




} // End of class Main
