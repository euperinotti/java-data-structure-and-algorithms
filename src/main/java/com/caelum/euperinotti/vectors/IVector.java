package com.caelum.euperinotti.vectors;

public interface IVector<T> {
  void add(T o);
  void add(int position, T o);
  T get(int position);
  void remove(int position);
  boolean contains(T o);
  int size();
}
