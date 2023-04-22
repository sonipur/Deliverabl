/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package dileverable.test;

/**
 *
 * @author Purvam
 */
import java.util.ArrayList;

public class Game {

    private static void launch(String[] args) {
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  private final Deck deck;
  public final ArrayList<Player> players;
  
  public Game(int numPlayers) {
    deck = new Deck();
    deck.shuffle();
    players = new ArrayList<>();
    for (int i = 1; i <= numPlayers; i++) {
      Player player = new Player("Player " + i);
      players.add(player);
    }
  }
  
  public void dealCards(int numCards) {
    for (int i = 0; i < numCards; i++) {
      for (Player player : players) {
        Card card = deck.deal();
        if (card != null) {
          player.addCard(card);
        }
      }
    }
  }
  
  public void removeCardFromPlayer(Player player, Card card) {
    player.removeCard(card);
  }
  
  public Player getPlayerWithCard(String rank) {
    for (Player player : players) {
      if (player.hasCard(rank)) {
        return player;
      }
    }
    return null;
  }
  
  public void play() {
    int numCards = 5;
    dealCards(numCards);
    System.out.println("Dealt " + numCards + " cards to each player.");
    System.out.println("Cards left in deck: " + deck.cardsLeft());
    for (Player player : players) {
      System.out.println(player.getName() + " has " + player.getHand().size() + " cards.");
    }
    String rank = "Ace";
    Player playerWithCard = getPlayerWithCard(rank);
    if (playerWithCard != null) {
      Card card = playerWithCard.getHand().get(0);
      removeCardFromPlayer(playerWithCard, card);
      System.out.println(playerWithCard.getName() + " played " + card.getRank() + " of " + card.getSuit() + ".");
    } else {
      System.out.println("No player has a " + rank + ".");
    }
    System.out.println("Cards left in deck: " + deck.cardsLeft());
    for (Player player : players) {
      System.out.println(player.getName() + " has " + player.getHand().size() + " cards.");
    }
  }
  public static void main(String[] args) {
launch (args);
}
}
    
