import java.time.LocalTime;
import java.util.Scanner;

public class BirthdayHunt {
    public static void main(String[] args) {
        LocalTime unlockTime = LocalTime.of(20, 0); // vanaf 20u
        LocalTime now = LocalTime.now();
        String secretCommand = "unlock my treasure";

        if (now.isBefore(unlockTime)) {
            System.out.println("Access denied");
            System.out.println("Your present is hidden close to me... but it only unlocks tonight.");
            System.out.println("Clue: it's something you've been craving,");
            System.out.println("and it will keep you awake in more ways than one.");
            System.out.println("To claim it later, whisper the secret command: \"" + secretCommand + "\"");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter command: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase(secretCommand)) {
                System.out.println("Access granted");
                System.out.println("Start your search. The treasure is near,");
                System.out.println("but the real prize might not be what you expect...");
                System.out.println("Hint: follow the warmth, the silk, and the curves.");
            } else {
                System.out.println("Wrong command. Try again... maybe whisper it softer.");
            }
            scanner.close();
        }
    }
}