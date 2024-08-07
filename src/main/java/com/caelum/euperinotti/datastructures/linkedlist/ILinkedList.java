package com.caelum.euperinotti.datastructures.linkedlist;

public interface ILinkedList<T> {
  void add(T o);
  void add(int position, T o);
  void addOnBeginning(T o);
  T get(int position);
  void remove(int position);
  void removeFromBeginning();
  void removeFromEnd();
  boolean contains(T o);
  int size();
}
