/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

/**
 *
 * @author hrithik
 */
public class PlayerTest {

    // Good case for constructor
    @Test
    public void testPlayer() {
        Player player = new Player("John");
        assertEquals("John", player.getName());
        assertEquals(new ArrayList<Card>(), player.getHand());
    }

    // Good case for getName
    @Test
    public void testGetName() {
        Player player = new Player("John");
        assertEquals("John", player.getName());
    }

    // Good case for setName
    @Test
    public void testSetName() {
        Player player = new Player("John");
        player.setName("Jack");
        assertEquals("Jack", player.getName());
    }

    // Good case for getHand
    @Test
    public void testGetHand() {
        Player player = new Player("John");
        assertEquals(new ArrayList<Card>(), player.getHand());
    }

    // Good case for addCard
    @Test
    public void testAddCard() {
        Player player = new Player("John");
        Card card = new Card("Spades", "Ace");
        player.addCard(card);
        assertTrue(player.getHand().contains(card));
    }

    // Bad case for removeCard
    @Test(expected = NullPointerException.class)
    public void testRemoveCardNull() {
        Player player = new Player("John");
        player.removeCard(null);
    }

    // Good case for removeCard
    @Test
    public void testRemoveCard() {
        Player player = new Player("John");
        Card card = new Card("Spades", "Ace");
        player.addCard(card);
        player.removeCard(card);
        assertFalse(player.getHand().contains(card));
    }

    // Boundary case for hasCard
    @Test
    public void testHasCardEmptyHand() {
        Player player = new Player("John");
        assertFalse(player.hasCard("Ace"));
    }

    // Good case for hasCard
    @Test
    public void testHasCardTrue() {
        Player player = new Player("John");
        Card card = new Card("Spades", "Ace");
        player.addCard(card);
        assertTrue(player.hasCard("Ace"));
    }

// Good case for hasCard
@Test
public void testHasCardFalse() {
    Player player = new Player("John");
    Card card = new Card("Spades", "Ace");
    player.addCard(card);
    assertFalse(player.hasCard("King"));
}
}