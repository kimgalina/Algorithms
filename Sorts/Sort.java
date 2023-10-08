package Sorts;

// this class is for all Number types
public class Sort<T extends Comparable<T>>{

    public void bubbleSort(T[] array){
        int out,in;
        for(out = array.length - 1; out > 0; out--){
            for(in = 0; in < out; in++){
                if(array[in].compareTo(array[in + 1]) < 0){
                    T temp = array[in + 1];
                    array[in + 1] = array[in];
                    array[in] = temp;
                }
            }
        }
    }

    public void choiceSort(T[] arr){
        for(int i = 0; i < arr.length ; i++){
            // choose the biggest element
            int index = i;
            T max = arr[i];
            for(int j = i; j < arr.length; j++ ){
                if(arr[j].compareTo(max) > 0){
                    max = arr[j];
                    index = j;
                }
            }
            T temp = arr[i];
            arr[i] = max;
            arr[index] = temp;

        }

    }

    public void insertionSort(T[] arr){
        // inserting begins from 2nd element
        for(int i = 1; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j].compareTo(arr[j - 1]) > 0){
                    T temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

}
