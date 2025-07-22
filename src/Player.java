import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Player class
public class Player {
    public String name;
    public int elixir;
    public int elixirRate;
    public boolean isDefending;
    public ArrayList<Card> deck;
    public ArrayList<Card> hand;
    public int leftPrincessTowerHealth;
    public int rightPrincessTowerHealth;
    public int kingTowerHealth;
    public boolean kingTowerUnlocked;
    public ArrayList<Card> availableCards;
    private Scanner scanner;
    public int crowns;
    public int towerLevel;

    public Player(String name) {
        this.name = name;
        this.elixir = 15;
        this.elixirRate = 5;
        this.isDefending = false;
        this.deck = new ArrayList<>();
        this.hand = new ArrayList<>();
        this.leftPrincessTowerHealth = 30;
        this.rightPrincessTowerHealth = 30;
        this.kingTowerHealth = 50;
        this.kingTowerUnlocked = false;
        this.availableCards = new ArrayList<>();
        this.crowns = 0;
        this.towerLevel = 1;
    }

    // Method to draw a card from the deck to the hand
    public void drawCard() {
        // Check if the deck is not empty
        if (deck.size() > 0) {
            // Add a random card from the deck to the hand and then remove it from the deck
            int randomCard = (int)(Math.random() * deck.size());
            hand.add(deck.get(randomCard));
            deck.remove(randomCard);
        }
    }

    // Method to play a card from the hand
    public Card playCard(int index) {
        // Remove the card at the given index from the hand and return it
        return hand.remove(index);
    }

    // Method to create a deck of 8 cards
    public void createDeck() {
        this.scanner = new Scanner(System.in);
        // Prompt the player to select 8 cards
        System.out.println("\n" + name + ", Select 8 cards to create your deck:");
        for (int i = 0; i < 8; i++) {
            // Prompt the player to select a card
            System.out.println("\nSelect card " + (i + 1) + ":");
            // List the available cards and display their stats
            for (int j = 0; j < availableCards.size(); j++) {
                System.out.println(j + ": " + availableCards.get(j).name + " (Damage: " + availableCards.get(j).damage + " hp, Heal: " + availableCards.get(j).heal + " hp, Elixir: " + availableCards.get(j).elixir + ")");
            }
            int cardIndex = scanner.nextInt();
            // Add the selected card to the deck
            deck.add(availableCards.get(cardIndex));
            // Display the selected card
            System.out.println(name + " selected " + availableCards.get(cardIndex).name);
            // Remove the selected card from the list of available cards
            availableCards.remove(cardIndex);
        }
    }
}