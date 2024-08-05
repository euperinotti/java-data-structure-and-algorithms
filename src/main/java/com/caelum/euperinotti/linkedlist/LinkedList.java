package com.caelum.euperinotti.linkedlist;

public class LinkedList<T> implements ILinkedList<T>{
  private Cell<T> first;
  private Cell<T> last;
  private int totalItems = 0;

  @Override
  public void add(T o) {
    if (this.totalItems == 0) {
      this.addOnBeginning(o);
      return;
    }
    Cell<T> newCell = new Cell<T>(o);
    this.last.setNext(newCell);
    this.last = newCell;
    this.totalItems++;
  }

  @Override
  public void add(int position, T o) {
    if (position == 0) {
      this.addOnBeginning(o);
      return;
    }

    if (position == totalItems) {
      this.add(o);
      return;
    }

    // Get the reference of the cell behind the current position
    Cell<T> previous = this.getCell(position - 1);

    // Create a new cell and update the reference of the next cell in the list
    Cell<T> newCell = new Cell<T>(previous.getNext(), o);

    // Change the reference 'next' of the previous cell to point to 'newCell'
    previous.setNext(newCell);
    this.totalItems++;

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

  private boolean isPositionFilled(int position) {
    return position >= 0 && position < this.totalItems;
  }

  private Cell<T> getCell(int position) {
    if (!this.isPositionFilled(position)) {
      throw new IllegalStateException("Invalid position given");
    }

    Cell<T> current = this.first;

    for (int i = 0; i < position; i++) {
      current = current.getNext();
    }

    return current;
  }

  @Override
  public String toString() {
    if (this.totalItems == 0) {
      return "[]";
    }

    StringBuilder builder = new StringBuilder();
    builder.append("[");
    Cell<T> current = this.first;

    for (int i = 0; i < totalItems - 1; i ++) {
      builder.append(current.getElement());
      builder.append(",");
      current = current.getNext();
    }

    builder.append(current.getElement());
    builder.append("]");

    return builder.toString();
  }
}
