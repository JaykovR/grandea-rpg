package grandea;


import java.util.ArrayList;
import java.util.Scanner;
import systems.DialogueSystem;
import systems.DialogueNode;


public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Grandea RPG.");
        System.out.println("First of all, I would like to know your name.");

        String playerName;
        playerName = scanner.nextLine();
        System.out.println("I see. So you are " + playerName + " you know where you are? Or why are you here?");
        System.out.println("Probably not.. Right?.. You see " + playerName + " you died." +
                "\n I am no more than a mere messanger from a place a mortal like you wouldn't understand." +
                "\n But I have been tasked to giving you the chance to re allocating you to a new world." +
                "\n I don't know why my Lord has interest in you. But it seems that you have potential.");

        DialogueNode firstQuestion = new DialogueNode();
        firstQuestion.mainDialogue = "------------------------------ \n" +
                "Select your dialogue option: \n" +
                "1. Who exactly are you? \n " +
                "2. Can't I go back to my old life? \n" +
                "3. What kind of world I am going to? \n" +
                "------------------------------";
        firstQuestion.options = new ArrayList<>();
        firstQuestion.options.add("As I said. I am no more than a mere messanger from my Lord.\n" +
                "Hmm.. In terms you would understand. I am the equivalent of an angel.\n" +
                "My name is Laak. I can't provide you with more information other than that.");
        firstQuestion.options.add("No. Your body is.. no more. And besides, don't allow mortals\n" +
                "To go back after death. That is forbidden.");
        firstQuestion.options.add("You would call it a Fantasy world.\n" +
                "In this world, people are able to alter materia using their mind.\n" +
                "Similar to this. *He raises one finger and a small purple flame appears on the tip\n" +
                "of his finger*.");
        firstQuestion.options.add("I see. Well then.");
        firstQuestion.Return = "Any other questions?";
        firstQuestion.mainDialogue2 = "------------------------------ \n" +
                "Select your dialogue option:\n" +
                "1. Who exactly are you?\n " +
                "2. Can't I go back to my old life?\n" +
                "3. What kind of world I am going to?\n" +
                "4. I don't have any other questions\n" +
                "------------------------------";


        System.out.println(firstQuestion.mainDialogue);
        // to call dialogue system
        DialogueSystem choice = new DialogueSystem();
        // puts user input into decision
        choice.dialogueOptions(firstQuestion);

        System.out.println("*He reads carefully a note that appread on his hand. Then by a swing of his hand, the note" +
                " suddenly vanishes* It appers that I have been ordered to provide you with a GIFT. " +
                "This gift it's a... unique skill that you will have. Gifts are only provided to the chosen ones. " +
                "Meaning you have been chosen by the Lord and he trusts you with his gift.");

        System.out.println("*Four cards appear in front of you.*\n" +
                            "----------------------------------\n" +
                            "Which one you grab?:\n" +
                            "1. A card with an eye, golden coloured.\n" + // learn basic ver of a skill by seeing it
                            "2. A silver card\n" + // acceleration
                            "3. A black card with a hand absorbing something.\n" + // absorb dead invididuals if they are willing to be so. Dangerous
                // their consciousness gets eventually mixed with yours. You could lose yourself, becoming a new being. Born from the combinations of souls.
                            "4. A card with various letter types, blue coloured."); // Understand every language and speak it



        System.out.println("END SUCCESSFUL");
    }
}
