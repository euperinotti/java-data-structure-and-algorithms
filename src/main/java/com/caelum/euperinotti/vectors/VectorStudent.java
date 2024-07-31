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
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
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
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'size'");
  }

}
