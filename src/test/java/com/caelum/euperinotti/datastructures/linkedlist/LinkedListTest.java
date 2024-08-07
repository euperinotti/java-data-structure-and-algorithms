package com.caelum.euperinotti.datastructures.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.caelum.euperinotti.models.Student;

public class LinkedListTest {

  private LinkedList<Student> sut;

  @BeforeEach
  void setUp() {
    this.sut = new LinkedList<Student>();
  }

  @Test
  void shouldGetCellAtSpecificPosition() {
    Student student1 = new Student("Isabella McKenzie");
    Student student2 = new Student("Essie Gonzalez");

    sut.add(student1);
    sut.add(student2);

    assertEquals(student2, sut.get(1));
  }

  @Test
  void shouldAddOnBeginningOfList() {
    Student student1 = new Student("Isabella McKenzie");

    sut.add(student1);

    assertEquals(student1, sut.get(0));
  }

  @Test
  void shouldAddOnEndOfList() {
    sut.add(new Student("Isabella McKenzie"));
    sut.add(new Student("Essie Gonzalez"));

    assertEquals(2, sut.size());
  }

  @Test
  void shouldAddOnSpecificPosition() {
    sut.add(new Student("Isabella McKenzie"));
    sut.add(0, new Student("Essie Gonzalez"));
    sut.add(1, new Student("Antonio Cook"));

    assertEquals("Essie Gonzalez", sut.get(0).getName());
  }
}
