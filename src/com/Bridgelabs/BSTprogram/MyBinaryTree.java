package com.Bridgelabs.BSTprogram;

public class MyBinaryTree<K extends Comparable<K>> {

    private MyBinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key){
        if(current == null )
            return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) return current;
        if (compareResult < 0){
            current.left = addRecursively(current.left, key);
        }
        else
        {
            current.right = addRecursively(current.right, key);
        }
        return current;
}


    private int getSizeRecursively(MyBinaryNode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursively(current.left) + this.getSizeRecursively(current.right);
    }
    public void print() {
        printRec(root);
    }
    void printRec(MyBinaryNode root) {
        if(root != null) {
            printRec(root.left);
            System.out.println(root.key);
            printRec(root.right);
        }
    }
    @Override
    public String toString() {
        return "MyBinaryTree [root=" + root + "hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }



}


