package com.caelum.euperinotti.vectors;

public class Vector<T> implements IVector<T> {
  private T[] array;

  private Integer totalItems = 0;

  public Vector(int length) {
    try {
      this.array = (T[]) new Object[length];
    } catch (Exception e) {
      throw new RuntimeException("Error initializing array");
    }
  }

  @Override
  public void add(T o) {
    this.garanteeSpace();
    this.array[this.totalItems] = o;
    this.totalItems++;
  }

  @Override
  public void add(int position, T o) {
    this.garanteeSpace();
    if (!this.isValidPosition(position)) {
      throw new IllegalArgumentException("Invalid position");
    }

    for (int i = this.totalItems - 1; i >= position; i--) {
      this.array[i + 1] = this.array[i];
    }

    this.array[position] = o;
    this.totalItems++;
  }

  @Override
  public T get(int position) {
    if (!this.isPositionFilled(position)) {
      throw new IllegalStateException("Invalid position given");
    }

    return this.array[position];
  }

  @Override
  public void remove(int position) {
    if (!this.isPositionFilled(position)) {
      throw new IllegalStateException("Invalid position given");
    }

    for (int i = position; i < this.totalItems; i++) {
      this.array[i] = this.array[i + 1];
    }

    this.totalItems--;
  }

  @Override
  public boolean contains(T o) {
    for (int i = 0; i < this.totalItems; i++) {
      if (o.equals(this.array[i])) {
        return true;
      }
    }

    return false;
  }

  @Override
  public int size() {
    return this.totalItems;
  }

  private boolean isPositionFilled(int position) {
    return position >= 0 && position < this.totalItems;
  }

  private boolean isValidPosition(int position) {
    return position >= 0 && position <= this.totalItems;
  }

  @Override
  public String toString() {
    if (this.totalItems == 0) {
      return "[]";
    }

    StringBuilder builder = new StringBuilder();
    builder.append("[");
    for (int i = 0; i < this.totalItems; i++) {
      builder.append(this.array[i]);
      builder.append(", ");
      builder.append(this.array[this.totalItems - 1]);
      builder.append("]");
    }

    return builder.toString();
  }

  private void garanteeSpace() {
    if (this.totalItems == this.array.length) {
      T[] newArray = (T[]) new Object[this.array.length * 2];
      for (int i = 0; i < this.totalItems - 1; i++) {
        newArray[i] = this.array[i];
      }
      this.array = newArray;
    }
  }

  public int getLength() {
    return this.array.length;
  }
}
