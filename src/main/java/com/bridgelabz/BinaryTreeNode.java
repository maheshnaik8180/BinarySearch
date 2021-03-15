package com.bridgelabz;

public class BinaryTreeNode <K extends Comparable<K>> extends BinarySearchTree<K> {
    K key;
    BinaryTreeNode<K> left;
    BinaryTreeNode<K> right;

    public BinaryTreeNode(K key)
    {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
