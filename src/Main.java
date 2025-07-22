import java.util.Scanner;

// Main class
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to play against another person (1) or a computer (2)?");
        int choice = scanner.nextInt();

        while (choice != 1 && choice != 2) {
            System.out.println("Invalid choice. Please enter 1 to play against another person or 2 to play against a computer.");
            choice = scanner.nextInt();
        }

        if (choice == 1) {
            // Welcome screen
            System.out.println("\nWelcome to Java Royale!");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Instructions:");
            System.out.println("1. This is a two-player game where you will go head-to-head against another player.");
            System.out.println("2. You will enter names for each player and then select the game mode: Normal Deck (1) or Custom Deck (2).");
            System.out.println("3. If you choose Custom Deck, you will create your own deck by selecting 8 cards, otherwise cards will be randomly dealt each turn.");
            System.out.println("4. Each player starts with a certain amount of elixir, which is used to play cards.");
            System.out.println("5. Each card has a specific elixir cost, damage, and heal value.");
            System.out.println("6. Some cards have special abilities, like the Elixir Collector, which adds 10 elixir, or the Freeze card, which skips the opponent's turn.");
            System.out.println("7. You can choose to change the default tower health and elixir settings at the start of the game.");
            System.out.println("8. The game progresses in turns. Each turn you can choose to attack an opponent's tower or defend your own towers.");
            System.out.println("9. Then you will choose from a list of cards to attack or defend with.");
            System.out.println("10. The King Tower is not unlocked until both Princess Towers are destroyed.");
            System.out.println("11. The game ends when a player's king tower is destroyed. The player whose king tower is still standing is the winner.");
            System.out.println("Credits: Alex Randall");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Let's play! Click enter to begin!");
            // Wait for player input to start the game
            scanner.nextLine();
            String enterToBegin = scanner.nextLine();
            // Check if the player clicks enter
            while (!enterToBegin.equals("")) {
                System.out.println("Invalid input. Click enter to begin!");
                enterToBegin = scanner.nextLine();
            }
            // Start the game after player clicks enter
            if (enterToBegin.equals("")) {
                // Create a new game
                Game game = new Game();
                // Start game
                game.start();
            }
        } else {
            // Welcome screen
            System.out.println("\nWelcome to Java Royale!");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Instructions:");
            System.out.println("1. This is a single-player game where you will go head-to-head against a computer.");
            System.out.println("2. You will enter your name and then select the game mode: Normal Deck (1) or Custom Deck (2).");
            System.out.println("3. If you choose Custom Deck, you will create your own deck by selecting 8 cards, otherwise cards will be randomly dealt each turn.");
            System.out.println("4. Each player starts with a certain amount of elixir, which is used to play cards.");
            System.out.println("5. Each card has a specific elixir cost, damage, and heal value.");
            System.out.println("6. Some cards have special abilities, like the Elixir Collector, which adds 10 elixir, or the Freeze card, which skips the opponent's turn.");
            System.out.println("7. The game progresses in turns. Each turn you can choose to attack the computer's tower or defend your own towers.");
            System.out.println("8. Then you will choose from a list of cards to attack or defend with.");
            System.out.println("9. The King Tower is not unlocked until both Princess Towers are destroyed.");
            System.out.println("10. The game ends when a player's king tower is destroyed. The player whose king tower is still standing is the winner.");
            System.out.println("Credits: Alex Randall");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Let's play! Click enter to begin!");

            // Wait for player input to start the game
            scanner.nextLine();
            String enterToBegin = scanner.nextLine();
            // Check if the player clicks enter
            while (!enterToBegin.equals("")) {
                System.out.println("Invalid input. Click enter to begin!");
                enterToBegin = scanner.nextLine();
            }
            // Start the game after player clicks enter
            if (enterToBegin.equals("")) {
                // Create a new game
                PvCGame game = new PvCGame();
                // Start game
                game.start();
            }
        }
    }
}