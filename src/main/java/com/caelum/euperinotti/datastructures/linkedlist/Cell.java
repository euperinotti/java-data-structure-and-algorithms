package com.caelum.euperinotti.datastructures.linkedlist;

public class Cell<T> {
  private Cell<T> next;
  private Cell<T> previous;
  private T element;

  public Cell(Cell<T> next, T element) {
    this.next = next;
    this.element = element;
  }

  public Cell(T element) {
    this.element = element;
    this.next = null;
  }

  public void setNext(Cell<T> next) {
    this.next = next;
  }

  public Cell<T> getNext() {
    return next;
  }

  public T getElement() {
    return element;
  }

  public void setPrevious(Cell<T> previous) {
    this.previous = previous;
  }

  public Cell<T> getPrevious() {
    return previous;
  }
}
