package DataStructures;

// the basis is an array
public class ArrayStack<T>{
    private int maxSize;
    private Object[] array;
    private int topIndex = -1;

    public ArrayStack(int size){
        maxSize = size;
        array = new Object[size];

    }
    // by default the stack size will be 10
    public ArrayStack(){
        this(10);
    }

    public int getSize(){
        return maxSize;
    }
    //
    public boolean isEmpty(){
        return topIndex == -1;
    }
    // resize stack
    public void resize(int size){
        Object[] array2 = new Object[size];
        System.arraycopy(array, 0,array2, 0, array.length);
        maxSize = size;
        array = array2;

    }
    // put nem element on the top
    public void push(T element){
        if(!isFull()){
            array[++topIndex] = element;
        }else{
            resize(array.length*2);
            push(element);
        }
    }
    // return element from the top
    public T pop(){
        if(!isEmpty()){
            T topElement = (T)array[topIndex];
            array[topIndex--] = null;

            return topElement;
        }
        return null; // need to catch exception !!!
    }
    // onle read element from the top
    public T peek(){
        if(!isEmpty()){

            return (T)array[topIndex];
        }
        return null; // need to catch exception !!!
    }
    public boolean isFull(){
        return topIndex == array.length - 1;
    }

}
