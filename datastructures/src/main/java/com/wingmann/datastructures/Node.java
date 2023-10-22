package com.wingmann.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    private final T data;
    private final List<Node<T>> next;

    public Node(final T value) {
        this.data = value;
        this.next = new ArrayList<>();
    }

    public Node(final T value, final List<Node<T>> children) {
        this.data = value;
        this.next = children;
    }

    public T getData() {
        return data;
    }

    public List<Node<T>> getNext() {
        return next;
    }

    public void addChild(Node<T> child) {
        next.add(child);
    }
}
