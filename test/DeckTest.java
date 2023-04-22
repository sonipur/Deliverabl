/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author hrithik
 */

public class DeckTest {

    private Deck deck;
    
    @Before
    public void setUp() {
        deck = new Deck();
    }
    
    @Test
    public void testShuffle() {
        Deck originalDeck = new Deck();
        deck.shuffle();
        assertFalse(originalDeck.cards.equals(deck.cards));
    }
    
    @Test
    public void testDeal() {
        int initialSize = deck.cardsLeft();
        Card dealtCard = deck.deal();
        assertNotNull(dealtCard);
        assertEquals(initialSize - 1, deck.cardsLeft());
    }
    
    @Test
    public void testCardsLeft() {
        int initialSize = deck.cardsLeft();
        deck.deal();
        assertEquals(initialSize - 1, deck.cardsLeft());
    }
    
    @Test
    public void testDealtCardsUnique() {
        Set<Card> dealtCards = new HashSet<>();
        for (int i = 0; i < 52; i++) {
            Card dealtCard = deck.deal();
            assertFalse(dealtCards.contains(dealtCard));
            dealtCards.add(dealtCard);
        }
    }
    
}