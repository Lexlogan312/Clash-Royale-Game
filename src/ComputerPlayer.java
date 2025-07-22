public class ComputerPlayer extends Player {
    // Constructor
    public ComputerPlayer(String name) {
        super(name);
    }

    // Method to decide whether to attack or defend
    public int decidePlay(Player player) {
        // If the player is defending, the computer will always attack
        if (player.isDefending) {
            return 1;
        }
        // If the player is attacking, the computer will randomly decide to attack or defend
        else {
            return (int)(Math.random() * 2) + 1;
        }
    }

    // Method to decide which card to play
    public int decideCard() {
        // Randomly select a card from the hand
        return (int)(Math.random() * hand.size());
    }

    // Method to create a deck of 8 cards
    public void createDeck() {
        System.out.println("");
        for (int i = 0; i < 8; i++) {
            int cardIndex = (int) (Math.random() * availableCards.size());
            // Add the selected card to the deck
            deck.add(availableCards.get(cardIndex));
            // Display the selected card
            System.out.println(name + " selected " + availableCards.get(cardIndex).name);
            // Remove the selected card from the list of available cards
            availableCards.remove(cardIndex);
        }
    }
}