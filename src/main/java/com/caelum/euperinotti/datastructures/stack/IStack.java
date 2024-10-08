package com.caelum.euperinotti.datastructures.stack;

public interface IStack<T> {
  void push(T o);
  T pop();
  T peek();
  boolean isEmpty();
}
