package com.caelum.euperinotti.vectors;

public class VectorStudent implements IVector<Student> {

  private Student[] students = new Student[100];

  private Integer totalOfItems = 0;

  @Override
  public void add(Student o) {
    this.students[this.totalOfItems] = o;
    this.totalOfItems++;
  }

  @Override
  public void add(int position, Student o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
  }

  @Override
  public Student get(int position) {
    if (!this.isPositionFilled(position)) {
      throw new IllegalStateException("Invalid position given");
    }

    return this.students[position];
  }

  @Override
  public void remove(int position) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public boolean contains(Student o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }

  @Override
  public int size() {
    return this.totalOfItems;
  }

  @Override
  public String toString() {
    if (this.totalOfItems == 0) {
      return "[]";
    }

    StringBuilder builder = new StringBuilder();
    builder.append("[");
    for (int i = 0; i < this.totalOfItems; i++) {
      builder.append(this.students[i]);
      builder.append(", ");
      builder.append(this.students[this.totalOfItems - 1]);
      builder.append("]");
    }

    return builder.toString();
  }

}
