package com.bdg.java_collections;

import java.util.*;

public class CustomArrayList<E> extends AbstractList<E> implements List<E> {

    private int size = 0;
    private Node<E> head;
    private Node<E> tail;

    public CustomArrayList() {
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public boolean add(E e) {
        Node<E> currentTail = tail;
        Node<E> newNode = new Node<>();
        tail = newNode;
        if (currentTail == null) {
            head = newNode;
        } else {
            currentTail.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }
}
