package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestGroceryCounter {

  GroceryCounter counter;

  @BeforeEach
  void setUp() {
    counter = new GroceryCounter();
  }

  // Put your tests here!

  @Test
  void itWorks() {
    assertEquals(true, true);
  }

  @Test
  void testNothing() {
    assertEquals("$0.00",counter.total());
  }

  @Test
  void testHundreths() {
    counter.hundreths();
    assertEquals("$0.01",counter.total());
  }

  @Test
  void testTenths() {
    counter.tenths();
    assertEquals("$0.10",counter.total());
  }

  @Test
  void testOnes() {
    counter.ones();
    assertEquals("$1.00",counter.total());
  }

  @Test
  void testTens() {
    counter.tens();
    assertEquals("$10.00",counter.total());
  }

  @Test
  void testAll() {
    counter.tens();
    counter.ones();
    counter.tenths();
    counter.hundreths();
    assertEquals("$11.11",counter.total());
  }

  @Test
  void testHundrethsOverflow() {
    for (int i = 0; i < 10; i++)
    {
      counter.hundreths();
    }
    assertEquals("$0.10",counter.total());
  }
  
  @Test
  void testTenthsOverflow() {
    for (int i = 0; i < 10; i++)
    {
      counter.tenths();
    }
    assertEquals("$1.00",counter.total());
  }

  @Test
  void testOnesOverflow() {
    for (int i = 0; i < 10; i++)
    {
      counter.ones();
    }
    assertEquals("$10.00",counter.total());
  }

  @Test
  void testTensOverflow() {
    for (int i = 0; i < 10; i++)
    {
      counter.tens();
    }
    assertEquals("$0.00",counter.total());
    assertEquals(1,counter.number_of_overflows());
  }
}
