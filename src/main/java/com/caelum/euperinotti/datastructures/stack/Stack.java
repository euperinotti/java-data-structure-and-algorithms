package com.caelum.euperinotti.datastructures.stack;

import java.util.LinkedList;

public class Stack<T> implements IStack<T> {

  private LinkedList<T> stack = new LinkedList<T>();

  @Override
  public void push(T o) {
    this.stack.add(o);
  }

  @Override
  public T pop() {
    if (this.stack.size() == 0) return null;
    return this.stack.remove(this.stack.size() - 1);
  }

  @Override
  public boolean isEmpty() {
    return this.stack.isEmpty();
  }

  @Override
  public T peek() {
    if (this.stack.size() == 0) return null;
    return this.stack.get(this.stack.size() - 1);
  }

}
