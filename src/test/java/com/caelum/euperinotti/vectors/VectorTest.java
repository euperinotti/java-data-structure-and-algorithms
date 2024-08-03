package com.caelum.euperinotti.vectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VectorTest {

  private Vector<Student> sut;

  @BeforeEach
  public void setUp() {
    this.sut = new Vector<Student>(100);
  }

  @Test
  public void shouldInitializeWithCorrectLength() {
    int expectedLength = 100;
    assertEquals(expectedLength, sut.getLength());
  }

  @Test
  public void shouldAddStudentAtTheEnd() {
    Student student = new Student("Jonathan Hogan");
    Student student2 = new Student("Jay Franklin");

    this.sut.add(student);
    this.sut.add(student2);

    assertEquals(student, this.sut.get(0));
    assertEquals(student2, this.sut.get(1));
  }

  @Test
  public void shouldAddStudentAtSpecificPosition() {
    Student student = new Student("Jonathan Hogan");
    Student student2 = new Student("Jay Franklin");
    Student student3 = new Student("Joe Stanley");

    this.sut.add(student);
    this.sut.add(0, student2);
    this.sut.add(1, student3);

    assertEquals(student2, this.sut.get(0));
    assertEquals(student3, this.sut.get(1));
    assertEquals(student, this.sut.get(2));
  }


}
