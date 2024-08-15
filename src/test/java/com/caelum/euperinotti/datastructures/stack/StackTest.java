package com.caelum.euperinotti.datastructures.stack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.caelum.euperinotti.models.Piece;

public class StackTest {

  private Stack<Piece> sut;

  @BeforeEach
  void setUp() {
    this.sut = new Stack<Piece>();
  }

  @Test
  void push_shouldPushObjectToStack() {
    sut.push(new Piece("Sword"));

    assertFalse(sut.isEmpty());
  }

  @Test
  void pop_shouldRemoveObjectToStack() {
    Piece piece = new Piece("Sword");
    Piece piece2 = new Piece("Phone");

    sut.push(piece);
    sut.push(piece2);

    assertTrue(piece2.equals(sut.pop()));
  }

  @Test
  void peek_shouldReturnTopElementOfStack() {
    Piece piece = new Piece("Sword");
    Piece piece2 = new Piece("Phone");

    sut.push(piece);
    sut.push(piece2);

    assertTrue(piece2.equals(sut.peek()));
  }

  @Test
  void isEmpty_shouldReturnTrueIfStackIsEmpty() {
    assertTrue(sut.isEmpty());
  }
}
