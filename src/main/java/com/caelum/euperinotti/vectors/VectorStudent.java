package com.caelum.euperinotti.vectors;

public class VectorStudent implements IVector<Student> {

  private Student[] students = new Student[100];

  private Integer totalItems = 0;

  @Override
  public void add(Student o) {
    this.students[this.totalItems] = o;
    this.totalItems++;
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
  public boolean contains(Student student) {
    for (int i = 0; i < this.totalItems; i++) {
      if (student.equals(this.students[i])) {
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

  @Override
  public String toString() {
    if (this.totalItems == 0) {
      return "[]";
    }

    StringBuilder builder = new StringBuilder();
    builder.append("[");
    for (int i = 0; i < this.totalItems; i++) {
      builder.append(this.students[i]);
      builder.append(", ");
      builder.append(this.students[this.totalItems - 1]);
      builder.append("]");
    }

    return builder.toString();
  }

}
