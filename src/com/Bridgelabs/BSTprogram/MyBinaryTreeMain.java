package com.Bridgelabs.BSTprogram;

public class MyBinaryTreeMain {
    public static void main(String[] args) {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        System.out.println("Binary tree -> ");
        myBinaryTree.print();

    }
}