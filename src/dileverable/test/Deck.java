/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dileverable.test;

/**
 *
 * @author Purvam
 */
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  private final ArrayList<Card> cards;

  public Deck() {
    cards = new ArrayList<>();
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    for (String suit : suits) {
      for (String rank : ranks) {
        Card card = new Card(rank, suit);
        cards.add(card);
      }
    }
  }
  
  public void shuffle() {
    Collections.shuffle(cards);
  }
  
  public Card deal() {
    if (!cards.isEmpty()) {
      Card card = cards.get(0);
      cards.remove(0);
      return card;
    } else {
      return null;
    }
  }
  
  public int cardsLeft() {
    return cards.size();
  }
}
