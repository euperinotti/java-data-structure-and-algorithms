package com.caelum.euperinotti.datastructures.linkedlist;

public class LinkedList<T> implements ILinkedList<T> {
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
    newCell.setPrevious(this.last);
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

    Cell<T> element = this.getCell(position);
    Cell<T> previous = element.getPrevious();

    Cell<T> newCell = new Cell<T>(o);
    newCell.setPrevious(previous);
    newCell.setNext(element);

    previous.setNext(newCell);
    element.setPrevious(newCell);

    this.totalItems++;
  }

  @Override
  public T get(int position) {
    return this.getCell(position).getElement();
  }

  @Override
  public void remove(int position) {
    if (position == 0) {
      this.removeFromBeginning();
      return;
    }

    if (position == this.totalItems - 1) {
      this.removeFromEnd();
      return;
    }

    Cell<T> element = this.getCell(position);
    Cell<T> previous = element.getPrevious();
    Cell<T> next = element.getNext();

    previous.setNext(next);
    next.setPrevious(previous);

    this.totalItems--;
  }

  @Override
  public boolean contains(T o) {
    Cell<T> cell = this.first;

    while (cell != null) {
      if (cell.getElement().equals(o)) {
        return true;
      }

      cell = cell.getNext();
    }

    return false;
  }

  @Override
  public int size() {
    return this.totalItems;
  }

  @Override
  public void addOnBeginning(T o) {
    Cell<T> newCell = new Cell<T>(o);

    if (this.totalItems == 0) {
      this.first = newCell;
      this.last = this.first;
    } else {
      newCell.setNext(this.first);
      newCell.setPrevious(null);
      this.first.setPrevious(newCell);
      this.first = newCell;
    }

    this.totalItems++;
  }

  @Override
  public void removeFromBeginning() {
    this.first = this.first.getNext();

    if (this.first == null) {
      this.last = null;
    } else {
      this.first.setPrevious(null);
    }

    this.totalItems--;
  }

  @Override
  public void removeFromEnd() {
    if (!this.isPositionFilled(this.totalItems - 1)) {
      throw new IllegalArgumentException("Position does not exists");
    }

    if (this.size() == 1) {
      this.removeFromBeginning();
      return;
    }

    Cell<T> previous = this.last.getPrevious();
    previous.setNext(null);
    this.last = previous;
    this.totalItems--;
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

    for (int i = 0; i < totalItems - 1; i++) {
      builder.append(current.getElement());
      builder.append(",");
      current = current.getNext();
    }

    builder.append(current.getElement());
    builder.append("]");

    return builder.toString();
  }
}
