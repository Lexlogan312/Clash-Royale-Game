import java.util.Scanner;

public class PvCGame {
    private Player player1;
    private ComputerPlayer computerPlayer;
    private Scanner scanner;
    private int gameMode;
    private Card defendingCard;

    public PvCGame() {
        this.scanner = new Scanner(System.in);

        // Initialize player1 as a normal player
        System.out.println("Enter name for Player 1:");
        String player1Name = scanner.nextLine();
        this.player1 = new Player(player1Name);

        // Initialize computerPlayer
        System.out.println("Enter name for Computer:");
        String computerName = scanner.nextLine();
        this.computerPlayer = new ComputerPlayer(computerName);

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

            computerPlayer.deck.add(elixirCollector);
            computerPlayer.deck.add(freeze);
            computerPlayer.deck.add(healSpirit);
            computerPlayer.deck.add(battleHealer);
            computerPlayer.deck.add(goblins);
            computerPlayer.deck.add(skeletonArmy);
            computerPlayer.deck.add(archers);
            computerPlayer.deck.add(miniPekka);
            computerPlayer.deck.add(knight);
            computerPlayer.deck.add(wizard);
            computerPlayer.deck.add(barbarians);
            computerPlayer.deck.add(minionHorde);
            computerPlayer.deck.add(fireball);
            computerPlayer.deck.add(hogRider);
            computerPlayer.deck.add(prince);
            computerPlayer.deck.add(rocket);
            computerPlayer.deck.add(giant);
            computerPlayer.deck.add(eliteBarbarians);
            computerPlayer.deck.add(sparky);
            computerPlayer.deck.add(megaKnight);
            computerPlayer.deck.add(golem);
            computerPlayer.deck.add(pekka);
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

            computerPlayer.availableCards.add(elixirCollector);
            computerPlayer.availableCards.add(freeze);
            computerPlayer.availableCards.add(healSpirit);
            computerPlayer.availableCards.add(battleHealer);
            computerPlayer.availableCards.add(goblins);
            computerPlayer.availableCards.add(skeletonArmy);
            computerPlayer.availableCards.add(archers);
            computerPlayer.availableCards.add(miniPekka);
            computerPlayer.availableCards.add(knight);
            computerPlayer.availableCards.add(wizard);
            computerPlayer.availableCards.add(barbarians);
            computerPlayer.availableCards.add(minionHorde);
            computerPlayer.availableCards.add(fireball);
            computerPlayer.availableCards.add(hogRider);
            computerPlayer.availableCards.add(prince);
            computerPlayer.availableCards.add(rocket);
            computerPlayer.availableCards.add(giant);
            computerPlayer.availableCards.add(eliteBarbarians);
            computerPlayer.availableCards.add(sparky);
            computerPlayer.availableCards.add(megaKnight);
            computerPlayer.availableCards.add(golem);
            computerPlayer.availableCards.add(pekka);

            // Players create their own decks
            player1.createDeck();
            computerPlayer.createDeck();
        }
    }

    public void start() {
        // Game loop
        while (true) {
            // Display current tower health and player elixir
            System.out.println("\n" + player1.name + ": Left Tower: " + isTowerDestroyed(player1.leftPrincessTowerHealth) + ";     Right Tower: " + isTowerDestroyed(player1.rightPrincessTowerHealth) + ";     King Tower: " + isTowerDestroyed(player1.kingTowerHealth) + ";     Elixir: " + player1.elixir);
            System.out.println(computerPlayer.name + ": Left Tower: " + isTowerDestroyed(computerPlayer.leftPrincessTowerHealth) + ";     Right Tower: " + isTowerDestroyed(computerPlayer.rightPrincessTowerHealth) + ";     King Tower: " + isTowerDestroyed(computerPlayer.kingTowerHealth) + ";     Elixir: " + computerPlayer.elixir);

            // Player 1's turn
            takeTurn(player1, computerPlayer);

            // Check if king tower is unlocked
            if (player1.leftPrincessTowerHealth <= 0 && player1.rightPrincessTowerHealth <= 0) {
                player1.kingTowerUnlocked = true;
            }
            if (computerPlayer.leftPrincessTowerHealth <= 0 && computerPlayer.rightPrincessTowerHealth <= 0) {
                computerPlayer.kingTowerUnlocked = true;
            }

            // Check if king tower is destroyed and end the game
            if (player1.kingTowerHealth <= 0) {
                System.out.println("\n" + computerPlayer.name + " wins!");
                break;
            }
            if (computerPlayer.kingTowerHealth <= 0) {
                System.out.println("\n" + player1.name + " wins!");
                break;
            }

            // Computer's turn
            takeTurn(computerPlayer, player1);
        }
    }

    public void takeTurn(Player currentPlayer, Player opponent) {
        // If the current player is a computer, let it decide the play
        if (currentPlayer.name.equals(computerPlayer.name)) {
            // Reset defending status at the start of each turn
            currentPlayer.isDefending = false;
            int tower = 0;
            int play = computerPlayer.decidePlay(opponent);
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
                    tower = (int)(Math.random() * 2) + 1;
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
                System.out.println("");
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
                int cardNum = computerPlayer.decideCard();
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
            int cardNum = computerPlayer.decideCard();

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
        } else {
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