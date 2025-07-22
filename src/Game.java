import java.util.Scanner;

// Game class
public class Game {
    public Player player1;
    public Player player2;
    public Scanner scanner;
    private int gameMode;
    private Card defendingCard;

    public Game() {
        this.scanner = new Scanner(System.in);

        // Prompt the user to enter the name for Player 1 and Player 2 and create the players
        System.out.println("Enter name for Player 1:");
        String player1Name = scanner.nextLine();
        this.player1 = new Player(player1Name);

        System.out.println("Enter name for Player 2:");
        String player2Name = scanner.nextLine();
        this.player2 = new Player(player2Name);

        // Prompt the user to select the game mode
        System.out.println("\nGame Mode: Normal Deck (1) or Custom Deck (2)");
        gameMode = scanner.nextInt();
        scanner.nextLine();
        // Check if the user enters a valid game mode
        while (gameMode != 1 && gameMode != 2) {
            System.out.println("Invalid input. Type 1 for Normal or 2 for Custom.");
            gameMode = scanner.nextInt();
        }
        // Display the selected game mode
        if (gameMode == 1) {
            System.out.println("Normal Mode Selected");
        }
        else if (gameMode == 2) {
            System.out.println("Custom Mode Selected");
        }

        // Ask the user if they want to change the default tower health settings
        System.out.println("\nChange default tower health (Default: Princess is 30 hp & King is 50 hp)? (Y/N)");
        String changeHealth = scanner.nextLine();
        // Check if the user enters a valid input
        while (!(changeHealth.toUpperCase().equals("Y")) && !(changeHealth.toUpperCase().equals("N"))) {
            System.out.println("Invalid input. Type Y or N.");
            changeHealth = scanner.nextLine();
        }
        // If the user chooses to change the default tower health
        if (changeHealth.toUpperCase().equals("Y")) {
            // Prompt the user to enter the starting health for the princess towers
            System.out.println("Enter starting health for princess towers:");
            // Check if the user enters an integer
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.nextLine();
            }
            int princessTowerHealth = scanner.nextInt();
            scanner.nextLine();
            // Set the starting health for princess towers for both players
            player1.leftPrincessTowerHealth = princessTowerHealth;
            player1.rightPrincessTowerHealth = princessTowerHealth;
            player2.leftPrincessTowerHealth = princessTowerHealth;
            player2.rightPrincessTowerHealth = princessTowerHealth;

            // Prompt the user to enter the starting health for the king tower
            System.out.println("Enter starting health for king tower:");
            // Check if the user enters an integer
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
            int kingTowerHealth = scanner.nextInt();
            scanner.nextLine();
            // Set the starting health for the king tower for both players
            player1.kingTowerHealth = kingTowerHealth;
            player2.kingTowerHealth = kingTowerHealth;
        }

        // Ask the user if they want to change the default elixir settings
        System.out.println("\nChange default elixir settings (Default: Start with 15 elixir & Replenish 5 elixir each turn)? (Y/N)");
        String changeElixir = scanner.nextLine();
        // Check if the user enters a valid input
        while (!(changeElixir.toUpperCase().equals("Y")) && !(changeElixir.toUpperCase().equals("N"))) {
            System.out.println("Invalid input. Type Y or N.");
            changeElixir = scanner.nextLine();
        }
        // If the user chooses to change the default elixir settings
        if (changeElixir.toUpperCase().equals("Y")) {
            // Prompt the user to enter the starting elixir for the players
            System.out.println("Enter starting elixir for players:");
            // Check if the user enters an integer
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
            int playerElixir = scanner.nextInt();
            scanner.nextLine();
            // Set the starting elixir for both players
            player1.elixir = playerElixir;
            player2.elixir = playerElixir;

            // Prompt the user to enter the elixir replenish rate for the players
            System.out.println("Enter elixir replenish rate for players:");
            // Check if the user enters an integer
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
            int playerElixirRate = scanner.nextInt();
            scanner.nextLine();
            // Set the elixir replenish rate for both players
            player1.elixirRate = playerElixirRate;
            player2.elixirRate = playerElixirRate;
        }

        // Initialize the cards for the players
        // Each Card object is created with a name, damage, heal, and elixir
        Card elixirCollector = new Card("Elixir Collector", 0, 0, 5);
        Card freeze = new Card("Freeze", 0, 0, 4);
        Card healSpirit = new Card("Heal Spirit", 2, 5, 3);
        Card battleHealer = new Card("Battle Healer", 2, 10, 5);
        Card goblins = new Card("Goblins", 4, 0, 2);
        Card skeletonArmy = new Card("Skeleton Army", 4, 0, 3);
        Card archers = new Card("Archers", 5, 0, 3);
        Card miniPekka = new Card("Mini Pekka", 6, 0, 4);
        Card knight = new Card("Knight", 6, 0, 3);
        Card wizard = new Card("Wizard", 6, 0, 5);
        Card barbarians = new Card("Barbarians", 7, 0, 5);
        Card minionHorde = new Card("Minion Horde", 7, 0, 5);
        Card fireball = new Card("Fireball", 7, 0, 4);
        Card hogRider = new Card("Hog Rider", 8, 0, 4);
        Card prince = new Card("Prince", 10, 0, 5);
        Card rocket = new Card("Rocket", 10, 0, 6);
        Card giant = new Card("Giant", 10, 0, 5);
        Card eliteBarbarians = new Card("Elite Barbarians", 12, 0, 8);
        Card sparky = new Card("Sparky", 17, 0, 10);
        Card megaKnight = new Card("Mega Knight", 17, 0, 10);
        Card golem = new Card("Golem", 18, 0, 10);
        Card pekka = new Card("Pekka", 20, 0, 12);

        // If the game mode is Normal
        if (gameMode == 1) {
            // Add all the cards to the deck array for both players
            player1.deck.add(elixirCollector);
            player1.deck.add(freeze);
            player1.deck.add(healSpirit);
            player1.deck.add(battleHealer);
            player1.deck.add(goblins);
            player1.deck.add(skeletonArmy);
            player1.deck.add(archers);
            player1.deck.add(miniPekka);
            player1.deck.add(knight);
            player1.deck.add(wizard);
            player1.deck.add(barbarians);
            player1.deck.add(minionHorde);
            player1.deck.add(fireball);
            player1.deck.add(hogRider);
            player1.deck.add(prince);
            player1.deck.add(rocket);
            player1.deck.add(giant);
            player1.deck.add(eliteBarbarians);
            player1.deck.add(sparky);
            player1.deck.add(megaKnight);
            player1.deck.add(golem);
            player1.deck.add(pekka);

            player2.deck.add(elixirCollector);
            player2.deck.add(freeze);
            player2.deck.add(healSpirit);
            player2.deck.add(battleHealer);
            player2.deck.add(goblins);
            player2.deck.add(skeletonArmy);
            player2.deck.add(archers);
            player2.deck.add(miniPekka);
            player2.deck.add(knight);
            player2.deck.add(wizard);
            player2.deck.add(barbarians);
            player2.deck.add(minionHorde);
            player2.deck.add(fireball);
            player2.deck.add(hogRider);
            player2.deck.add(prince);
            player2.deck.add(rocket);
            player2.deck.add(giant);
            player2.deck.add(eliteBarbarians);
            player2.deck.add(sparky);
            player2.deck.add(megaKnight);
            player2.deck.add(golem);
            player2.deck.add(pekka);
        }

        // If the game mode is Custom
        else if (gameMode == 2) {
            // Add all the cards to the array of available cards for both players
            player1.availableCards.add(elixirCollector);
            player1.availableCards.add(freeze);
            player1.availableCards.add(healSpirit);
            player1.availableCards.add(battleHealer);
            player1.availableCards.add(goblins);
            player1.availableCards.add(skeletonArmy);
            player1.availableCards.add(archers);
            player1.availableCards.add(miniPekka);
            player1.availableCards.add(knight);
            player1.availableCards.add(wizard);
            player1.availableCards.add(barbarians);
            player1.availableCards.add(minionHorde);
            player1.availableCards.add(fireball);
            player1.availableCards.add(hogRider);
            player1.availableCards.add(prince);
            player1.availableCards.add(rocket);
            player1.availableCards.add(giant);
            player1.availableCards.add(eliteBarbarians);
            player1.availableCards.add(sparky);
            player1.availableCards.add(megaKnight);
            player1.availableCards.add(golem);
            player1.availableCards.add(pekka);

            player2.availableCards.add(elixirCollector);
            player2.availableCards.add(freeze);
            player2.availableCards.add(healSpirit);
            player2.availableCards.add(battleHealer);
            player2.availableCards.add(goblins);
            player2.availableCards.add(skeletonArmy);
            player2.availableCards.add(archers);
            player2.availableCards.add(miniPekka);
            player2.availableCards.add(knight);
            player2.availableCards.add(wizard);
            player2.availableCards.add(barbarians);
            player2.availableCards.add(minionHorde);
            player2.availableCards.add(fireball);
            player2.availableCards.add(hogRider);
            player2.availableCards.add(prince);
            player2.availableCards.add(rocket);
            player2.availableCards.add(giant);
            player2.availableCards.add(eliteBarbarians);
            player2.availableCards.add(sparky);
            player2.availableCards.add(megaKnight);
            player2.availableCards.add(golem);
            player2.availableCards.add(pekka);

            // Players create their own decks
            player1.createDeck();
            player2.createDeck();
        }
    }

    // Method to start the game
    public void start() {
        // Initialize the game loop
        int x = 0;
        // Game loop
        while (x == 0) {
            // Display current tower health and player elixir
            System.out.println("\n" + player1.name + ": Left Tower: " + isTowerDestroyed(player1.leftPrincessTowerHealth) + ";     Right Tower: " + isTowerDestroyed(player1.rightPrincessTowerHealth) + ";     King Tower: " + isTowerDestroyed(player1.kingTowerHealth) + ";     Elixir: " + player1.elixir);
            System.out.println(player2.name + ": Left Tower: " + isTowerDestroyed(player2.leftPrincessTowerHealth) + ";     Right Tower: " + isTowerDestroyed(player2.rightPrincessTowerHealth) + ";     King Tower: " + isTowerDestroyed(player2.kingTowerHealth) + ";     Elixir: " + player2.elixir);

            // Player 1's turn
            takeTurn(player1, player2);

            // Check if king tower is unlocked
            if (player1.leftPrincessTowerHealth <= 0 && player1.rightPrincessTowerHealth <= 0) {
                player1.kingTowerUnlocked = true;
            }
            if (player2.leftPrincessTowerHealth <= 0 && player2.rightPrincessTowerHealth <= 0) {
                player2.kingTowerUnlocked = true;
            }

            // Check if king tower is destroyed and end the game
            if (player1.kingTowerHealth <= 0) {
                System.out.println("\n" + player2.name + " wins!");
                break;
            }
            if (player2.kingTowerHealth <= 0) {
                System.out.println("\n" + player1.name + " wins!");
                break;
            }

            // Player 2's turn
            takeTurn(player2, player1);
        }
    }

    // Method for a player to take a turn
    public void takeTurn(Player currentPlayer, Player opponent) {
        // Reset defending status at the start of each turn
        currentPlayer.isDefending = false;
        int tower = 0;

        // Ask the player to choose to attack or defend
        System.out.println("\n" + currentPlayer.name + ": Attack (1) or Defend (2)?");
        int play = scanner.nextInt();
        // check if input is 1 or 2
        while (play != 1 && play != 2) {
            System.out.println("Invalid input. Type 1 to Attack or 2 to Defend.");
            play = scanner.nextInt();
        }
        if (play == 1 && !opponent.kingTowerUnlocked) {
            // Check if a princess tower has been destroyed
            if (opponent.leftPrincessTowerHealth <= 0) {
                System.out.println(opponent.name + "'s Left Princess Tower has been destroyed. You can only attack the Right Princess Tower.");
                tower = 2;
            } else if (opponent.rightPrincessTowerHealth <= 0) {
                System.out.println(opponent.name + "'s Right Princess Tower has been destroyed. You can only attack the Left Princess Tower.");
                tower = 1;
            } else {
                // Ask the player to choose which princess tower to attack
                System.out.println("\n" + currentPlayer.name + ": Attack Left Princess Tower (1) or Right Princess Tower (2)?");
                tower = scanner.nextInt();
                // check if input is 1 or 2
                while (tower != 1 && tower != 2) {
                    System.out.println("Invalid input. Type 1 to Attack Left Princess Tower or 2 to Attack Right Princess Tower.");
                    tower = scanner.nextInt();
                }
            }
        }
        else if (play == 1 && opponent.kingTowerUnlocked) {
            System.out.println(opponent.name + "'s Left and Right Princess Towers have been destroyed. You can now attack the King Tower.");
            // Attack the king tower if both princess towers are destroyed
            tower = 3;
        }
        else if (play == 2) {
            // Set the player's status to defending
            currentPlayer.isDefending = true;
            System.out.println(currentPlayer.name + " is defending " + opponent.name + "'s next attack.");
            currentPlayer.hand.clear();
            // Draw 4 cards for the player to choose from
            while (currentPlayer.hand.size() < 4) {
                currentPlayer.drawCard();
            }
            // Display the cards in the player's hand
            for (int i = 0; i < 4; i++) {
                Card card = currentPlayer.hand.get(i);
                System.out.println(i + ": " + card.name + " (Damage: " + card.damage + " hp, Elixir: " + card.elixir + ")");
            }
            // Ask the player to choose a card to defend with
            int cardNum = -1;
            while (cardNum < 0 || cardNum >= 4) {
                System.out.println("\nEnter the number (0-3) of the card to defend with:");
                cardNum = scanner.nextInt();
                // Check if they enter a valid number
                if (cardNum < 0 || cardNum >= 4) {
                    System.out.println("Number out of range. Please enter a number 0-3.");
                }
            }
            // Set the defending card to the card chosen by the player
            defendingCard = currentPlayer.hand.get(cardNum);
            // Remove the card from the player's hand
            currentPlayer.hand.remove(cardNum);
            // Reduce the player's elixir by the elixir cost of the card
            currentPlayer.elixir -= defendingCard.elixir;
            // Player gains 5 elixir after each turn
            currentPlayer.elixir += currentPlayer.elixirRate;
            // End the player's turn
            return;
        }

        // Draw cards until the player has 4
        if (gameMode == 1) {
            currentPlayer.hand.clear();
            while (currentPlayer.hand.size() < 4) {
                currentPlayer.drawCard();
            }
        }
        else if (gameMode == 2) {
            while (currentPlayer.hand.size() < 4) {
                currentPlayer.drawCard();
            }
        }

        // Display the tower being attacked and the player's current elixir
        if (tower == 1){
            System.out.println(currentPlayer.name + " is attacking " + opponent.name + "'s Left Princess Tower.\n" + "\nCurrent Hand (" + currentPlayer.elixir + " Elixir):");
        }
        else if (tower == 2){
            System.out.println(currentPlayer.name + " is attacking " + opponent.name + "'s Right Princess Tower.\n" + "\nCurrent Hand (" + currentPlayer.elixir + " Elixir):");
        }
        else if (tower == 3){
            System.out.println(currentPlayer.name + " is attacking " + opponent.name + "'s King Tower.\n" + "\nCurrent Hand (" + currentPlayer.elixir + " Elixir):");
        }
        // Display the cards in the player's hand
        for (int i = 0; i < 4; i++) {
            Card card = currentPlayer.hand.get(i);
            System.out.println(i + ": " + card.name + " (Damage: " + card.damage + " hp, Heal: " + card.heal + " hp, Elixir: " + card.elixir + ")");
        }

        // Ask the player to choose a card to play
        int cardNum = -1;
        while (cardNum < 0 || cardNum >= 4) {
            System.out.println("\nEnter the number (0-3) of the card to play:");
            cardNum = scanner.nextInt();
            // Check if they enter a valid number
            if (cardNum < 0 || cardNum >= 4) {
                System.out.println("Number out of range. Please enter a number 0-3.");
            }
        }

        // Play the card
        Card card = currentPlayer.playCard(cardNum);
        if (gameMode == 2) {
            // Add the card back to the deck
            currentPlayer.deck.add(card);
        }

        // Check if the player has enough elixir to play the card
        if (currentPlayer.elixir < card.elixir) {
            System.out.println("Not enough elixir to play this card. Choose another card.");
            // Add the card back to the player's hand
            currentPlayer.hand.add(cardNum, card);
            // Restart the player's turn
            takeTurn(currentPlayer, opponent);
            return;
        }

        // If the card is a healing card, heal the player's tower
        if (tower == 1) {
            currentPlayer.leftPrincessTowerHealth += card.heal;
        }
        else if (tower == 2) {
            currentPlayer.rightPrincessTowerHealth += card.heal;
        }
        else if (tower == 3) {
            currentPlayer.kingTowerHealth += card.heal;
        }

        // Reduce the player's elixir by the elixir cost of the card
        currentPlayer.elixir -= card.elixir;
        int damage = card.damage;

        // Check if the opponent is defending
        if (opponent.isDefending) {
            // Calculate the difference in damage between the attacking card and the defending card
            int difInDamage = damage - defendingCard.damage;
            damage = difInDamage;
            System.out.println(currentPlayer.name + " plays a " + card.name + ". Damage: " + card.damage + " hp -> " + damage + " hp, Heal: " + card.heal + " hp");
            // If the difference in damage is greater than 0, deal damage to the opponent's tower
            if (damage > 0) {
                if (tower == 1) {
                    opponent.leftPrincessTowerHealth -= damage;
                } else if (tower == 2) {
                    opponent.rightPrincessTowerHealth -= damage;
                } else if (tower == 3) {
                    opponent.kingTowerHealth -= damage;
                }
            } else {
                // If the difference in damage is less 0, deal damage to the current player's tower
                if (tower == 1) {
                    currentPlayer.leftPrincessTowerHealth += damage;
                } else if (tower == 2) {
                    currentPlayer.rightPrincessTowerHealth += damage;
                } else if (tower == 3) {
                    currentPlayer.kingTowerHealth += damage;
                }
            }
            // Reset the opponent's defending status
            opponent.isDefending = false;
        } else {
            // Deal damage to the opponent's tower
            if (tower == 1) {
                opponent.leftPrincessTowerHealth -= damage;
            }
            else if (tower == 2) {
                opponent.rightPrincessTowerHealth -= damage;
            }
            else if (tower == 3) {
                opponent.kingTowerHealth -= damage;
            }
            // If the card is an Elixir Collector, add 10 elixir to the player's elixir
            if (card.name.equals("Elixir Collector")) {
                System.out.println(currentPlayer.name + " plays a " + card.name + ". Plus 10 elixir!");
                currentPlayer.elixir += 10;
            }
            // If the card is a Freeze card, skip the opponent's turn
            else if (card.name.equals("Freeze")) {
                System.out.println(currentPlayer.name + " plays a " + card.name + ". Skipping " + opponent.name + "'s turn!");
                takeTurn(currentPlayer, opponent);
            } else {
                // Display the card played and the damage dealt
                System.out.println(currentPlayer.name + " plays a " + card.name + ". Damage: " + damage + " hp, Heal: " + card.heal + " hp");
            }
        }
        // Player gains 5 elixir after each turn
        currentPlayer.elixir += currentPlayer.elixirRate;
    }

    // Method to check if a tower is destroyed
    public String isTowerDestroyed(int towerHealth) {
        if (towerHealth <= 0) {
            return "Destroyed";
        } else {
            return towerHealth + " hp";
        }
    }
}