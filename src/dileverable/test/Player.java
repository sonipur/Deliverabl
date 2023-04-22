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

public class Player {
  private String name;
  private ArrayList<Card> hand;

  public Player(String name) {
    this.name = name;
    hand = new ArrayList<Card>();
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public ArrayList<Card> getHand() {
    return hand;
  }
  
  public void addCard(Card card) {
    hand.add(card);
  }
  
  public void removeCard(Card card) {
    hand.remove(card);
  }
  
  public boolean hasCard(String rank) {
    for (Card card : hand) {
      if (card.getRank().equals(rank)) {
        return true;
      }
    }
    return false;
  }
}

