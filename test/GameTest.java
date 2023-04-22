/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import dileverable.test.Game;
import dileverable.test.Player;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author hrithik
 */
public class GameTest {
  
  private Game game;
  private Player player1;
  private Player player2;
  
  @Before
  public void setUp() {
    game = new Game(2);
    player1 = game.players.get(0);
    player2 = game.players.get(1);
  }

  @Test
  public void testGameConstructor() {
    assertNotNull(game.deck);
    assertEquals(52, game.deck.cardsLeft());
    assertEquals(2, game.players.size());
  }
  
  @Test
  public void testDealCards() {
    game.dealCards(2);
    assertEquals(48, game.deck.cardsLeft());
    assertEquals(2, player1.getHand().size());
    assertEquals(2, player2.getHand().size());
  }
  
  @Test
  public void testRemoveCardFromPlayer() {
    Card card = new Card("Ace", "Spades");
    player1.addCard(card);
    assertEquals(1, player1.getHand().size());
    game.removeCardFromPlayer(player1, card);
    assertEquals(0, player1.getHand().size());
  }
  
  @Test
  public void testGetPlayerWithCard() {
    Card card = new Card("Ace", "Spades");
    player1.addCard(card);
    assertEquals(player1, game.getPlayerWithCard("Ace"));
    assertNull(game.getPlayerWithCard("King"));
  }
  
  @Test
  public void testPlay() {
    game.play();
    assertEquals(42, game.deck.cardsLeft());
    assertEquals(4, player1.getHand().size());
    assertEquals(4, player2.getHand().size());
  }
}
