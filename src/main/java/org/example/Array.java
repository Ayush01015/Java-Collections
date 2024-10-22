package org.example;
public class Array {
    private int capacity;
    private int lastIndex;
    private int[] arr;

    public Array() {
        this.capacity = 0;
        this.lastIndex = -1;
        this.arr = new int[this.capacity];
    }

    public Array(int cap) {
        this.capacity = cap;
        this.lastIndex = -1;
        this.arr = new int[this.capacity];
    }

    public boolean isArrayEmpty() {
        if (this.lastIndex == -1)
            return true;
        return false;
    }

    public boolean isArrayFull() {
        if (this.lastIndex == this.capacity - 1)
            return true;
        return false;
    }

    public boolean isIndexInValid(int index) {
        if (index < 0 && index >= capacity)
            return true;
        return false;
    }

    public void insert(int index, int value) {
        if (isArrayFull()) {
            System.out.println("Array is Full");
        } else if (isIndexInValid(index)) {
            System.out.println("Index is Invalid");
        } else if (index <= lastIndex) {
            this.arr[index] = value;
        } else {
            lastIndex++;
            this.arr[this.lastIndex] = value;
        }
    }

    public void push(int value) {
        if (isArrayFull()) {
            System.out.println("Array is Full");
        } else {
            this.lastIndex++;
            this.arr[this.lastIndex] = value;
        }
    }

    public void delete(int value) {
        if (isArrayEmpty()) {
            System.out.println("Array is Empty");
        }else {
            int index = indexOf(value);
            for (int i = index+1; i <=lastIndex ; i++) {
                arr[i-1]= arr[i];
            }
            lastIndex--;
        }
    }

    public int pop() {
        if (isArrayEmpty()) {
            System.out.println("Array is Empty");
            return -1;
        } else {
            int deletedValue = this.arr[lastIndex];
            lastIndex--;
            return deletedValue;
        }
    }

    public void displayList() {
        if(isArrayEmpty()){
            System.out.println("Array is Empty");
        }else {
            for (int i = 0; i <= lastIndex; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\n");
    }

    public int valueAtIndex(int index) {
        if (isArrayEmpty()) {
            System.out.println("Array is Empty");
        } else if (isIndexInValid(index)) {
            System.out.println("Index is Invalid");
        } else {
            return arr[index];
        }
        return -1;
    }

    public int indexOf(int value) {
        if (isArrayEmpty()) {
            System.out.println("Array is Empty");
        } else {
            //searching
            for (int i = 0; i <= lastIndex; i++) {
                if(arr[i]==value)
                    return i;
            }
        }
        return-1;
    }

}


