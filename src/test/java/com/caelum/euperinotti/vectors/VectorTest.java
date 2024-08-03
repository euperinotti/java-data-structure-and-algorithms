package com.caelum.euperinotti.vectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VectorTest {

  private Vector<Student> sut;

  private Student[] students = new Student[] {
    new Student("Jonathan Hogan"),
    new Student("Jay Franklin"),
    new Student("Joe Stanley")
  };

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
    this.sut.add(this.students[0]);
    this.sut.add(this.students[1]);

    assertEquals(this.students[0], this.sut.get(0));
    assertEquals(this.students[1], this.sut.get(1));
  }

  @Test
  public void shouldAddStudentAtSpecificPosition() {
    this.sut.add(this.students[0]);
    this.sut.add(0, this.students[1]);
    this.sut.add(1, this.students[2]);

    assertEquals(this.students[1], this.sut.get(0));
    assertEquals(this.students[2], this.sut.get(1));
    assertEquals(this.students[0], this.sut.get(2));
  }

  @Test
  public void shouldGetStudentAtSpecificPosition() {
    this.sut.add(this.students[0]);
    this.sut.add(this.students[1]);
    this.sut.add(this.students[2]);

    Student studentOnArray = this.sut.get(1);

    assertEquals(this.students[1], studentOnArray);
  }


}
