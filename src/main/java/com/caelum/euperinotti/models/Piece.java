package com.caelum.euperinotti.models;

public class Piece {
  private String name;

  public Piece(String name) {
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
    Piece p = (Piece) o;
    return this.name.equals(p.name);
  }
}
