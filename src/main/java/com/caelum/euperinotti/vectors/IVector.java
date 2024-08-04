package com.caelum.euperinotti.vectors;

public interface IVector<T> {
  void add(T o);
  void add(int position, T o);
  T get(int position);
  void remove(int position);
  void remove(T o);
  boolean contains(T o);
  int size();
}
