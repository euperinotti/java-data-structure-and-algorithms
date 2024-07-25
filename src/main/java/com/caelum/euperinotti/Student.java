package com.caelum.euperinotti;

public class Student {

  private String name;

  public Student(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "{" +
        "name='" + name + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    Student s = (Student) o;
    return this.name.equals(s.name);
  }
}
