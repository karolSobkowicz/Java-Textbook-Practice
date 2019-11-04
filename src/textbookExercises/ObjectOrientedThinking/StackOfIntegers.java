package textbookExercises.ObjectOrientedThinking;

public class StackOfIntegers {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    // Default capacity constructor
    public StackOfIntegers(){
         elements = new int[DEFAULT_CAPACITY];
    }

    // Custom capacity constructor
    public StackOfIntegers(int capacity){
        elements = new int[capacity];
    }

    // Push a new integer to the top of the stack //
    public void push(int value){
        if(size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    // Return and remove the top elements from the stack //
    public int pop(){
        return elements[--size];
    }

    // Return the top element from the stack //
    public int peek(){
        return elements[size - 1];
    }

    // Test whether the stack is empty //
    public boolean empty(){
        return size == 0;
    }

    // Return the number of elements in the stack //
    public int getSize(){
        return size;
    }

}
