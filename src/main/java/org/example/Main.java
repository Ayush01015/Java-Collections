package org.example;

public class Main {
    public static void main(String[] args) {
        Array arr = new Array(10);
        arr.displayList();
        arr.push(10);
        arr.push(10);
        arr.push(10);
        arr.push(10);
        arr.push(10);
        arr.displayList();
        arr.insert(0,999);
        arr.displayList();
        arr.insert(3,939);
        arr.displayList();
        arr.insert(5,979);
        arr.insert(6,979);
        arr.insert(7,979);
        arr.insert(8,979);
        arr.insert(9,979);
        arr.displayList();
        arr.insert(10,979);
        arr.displayList();
        arr.pop();
        arr.displayList();
        arr.pop();
        arr.pop();
        arr.pop();
        arr.pop();
        arr.displayList();
        arr.pop();
        arr.pop();
        arr.pop();
        arr.pop();
        arr.displayList();
        arr.pop();
        arr.displayList();

    }
}
