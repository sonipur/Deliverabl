/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hrithik
 */

public class CardTest {

  // Good tests for constructor and getters
  @Test
  public void testConstructorAndGetters() {
    Card card = new Card("Ace", "Spades");
    assertEquals("Ace", card.getRank());
    assertEquals("Spades", card.getSuit());
  }
  
  // Good and boundary tests for setters
  @Test
  public void testSetters() {
    Card card = new Card("Ace", "Spades");
    card.setRank("King");
    card.setSuit("Hearts");
    assertEquals("King", card.getRank());
    assertEquals("Hearts", card.getSuit());
    
    // Test edge case: rank and suit set to empty string
    card.setRank("");
    card.setSuit("");
    assertEquals("", card.getRank());
    assertEquals("", card.getSuit());
  }
  
  // Bad tests for constructor and setters
  @Test(expected = NullPointerException.class)
  public void testConstructorWithNullRank() {
    Card card = new Card(null, "Spades");
  }
  
  @Test(expected = NullPointerException.class)
  public void testConstructorWithNullSuit() {
    Card card = new Card("Ace", null);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testSetRankWithInvalidRank() {
    Card card = new Card("Ace", "Spades");
    card.setRank("invalid rank");
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testSetSuitWithInvalidSuit() {
    Card card = new Card("Ace", "Spades");
    card.setSuit("invalid suit");
  }
}