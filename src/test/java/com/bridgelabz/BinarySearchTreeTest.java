package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {
    @Test
    public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree()
    {
        BinarySearchTree binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(56);
        binarySearchTree.add(30);
        binarySearchTree.add(70);
        int sizeOfTree = binarySearchTree.getSize();
        System.out.println("Size of Binary Tree :"+sizeOfTree);
        Assert.assertEquals(3, sizeOfTree);
    }
}
