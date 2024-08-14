package com.caelum.euperinotti.datastructures.stack;

import org.junit.jupiter.api.BeforeEach;

import com.caelum.euperinotti.models.Piece;

public class StackTest {

  private Stack<Piece> sut;

  @BeforeEach
  void setUp() {
    this.sut = new Stack<Piece>();
  }
}
