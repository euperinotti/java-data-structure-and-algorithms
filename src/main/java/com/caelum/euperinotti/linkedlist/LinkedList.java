package com.caelum.euperinotti.linkedlist;

public class LinkedList<T> implements ILinkedList<T>{
  private Cell<T> first;
  private Cell<T> last;
  private int totalItems = 0;

  @Override
  public void add(T o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
  }
  @Override
  public void add(int position, T o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
  }
  @Override
  public T get(int position) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }
  @Override
  public void remove(int position) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }
  @Override
  public boolean contains(T o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }
  @Override
  public int size() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'size'");
  }
  @Override
  public void addOnBeginning(T o) {
    Cell<T> newCell = new Cell<T>(this.first, o);
    this.first = newCell;

    if (this.totalItems == 0) {
      this.last = this.first;
    }

    this.totalItems++;
  }

  @Override
  public void removeFromBeginning() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'removeFromBeginning'");
  }
  @Override
  public void removeFromEnd() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'removeFromEnd'");
  }
}
