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
    return this.stack.remove(this.stack.size() - 1);
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
  }

  @Override
  public T peek() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'peek'");
  }

}
