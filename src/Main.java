import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the cli turn based game i made!");
        System.out.println("Please enter your name below this message.");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();

        Player p = new Player(playerName, 100, 10, 10, false, false);
        p.printStatus();

        }
    }
