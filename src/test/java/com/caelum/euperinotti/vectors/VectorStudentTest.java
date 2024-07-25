package com.caelum.euperinotti.vectors;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VectorStudentTest {

  @Test
  public void shouldAddStudentAtTheEnd() {
    Student student = new Student("Jonathan Hogan");
    Student student2 = new Student("Jay Franklin");
    VectorStudent vector = new VectorStudent();

    vector.add(student);
    vector.add(student2);

    assertEquals(student, vector.get(0));
    assertEquals(student2, vector.get(1));
  }

  @Test
  public void shouldAddStudentAtSpecificPosition() {
    Student student = new Student("Jonathan Hogan");
    Student student2 = new Student("Jay Franklin");
    Student student3 = new Student("Joe Stanley");

    VectorStudent vector = new VectorStudent();

    vector.add(student);
    vector.add(0, student2);
    vector.add(1, student3);

    assertEquals(student2, vector.get(0));
    assertEquals(student, vector.get(1));
  }
}
