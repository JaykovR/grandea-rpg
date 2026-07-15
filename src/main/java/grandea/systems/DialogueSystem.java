package grandea.systems;


import java.util.Scanner;
import grandea.Main;

public class DialogueSystem {


    private int getValidInput(Scanner scanner, int maxOption) {
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid Input. Choose only a number between 1 and " + maxOption + ".");
                scanner.next();
                continue;
            }

            int selected = scanner.nextInt();

            if (selected >= 1 && selected <= maxOption) {
                return selected - 1; // -1 because options display from 1 but in logic they are from 0
            }

            System.out.println("Invalid Input. Choose only a number between 1 and " + maxOption + ".");
        }
    }

    public int dialogueOptions(DialogueNode dialogue) {
        // uses main scanner
        Scanner scanner = Main.scanner;
        // selected stores the player selection
        int selected = 0;
        while (dialogue != null) {
            //
            System.out.println(dialogue.dialogue);
            // Displays the options available to go.
            for (int i = 0; i < dialogue.options.size(); i++) {
                System.out.println(dialogue.options.get(i).label);
            }

            selected = getValidInput(scanner, dialogue.options.size());

            dialogue = dialogue.options.get(selected).leadsTo;
        }

        return selected;

    }
}

