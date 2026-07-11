package grandea;


import java.util.ArrayList;
import java.util.Scanner;
import grandea.systems.DialogueSystem;
import grandea.systems.DialogueNode;
import grandea.entities.Player;


public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Grandea RPG.");
        System.out.println("First of all, I would like to know your name.");

        Player player = new Player();


        player.playerName = scanner.nextLine();
        System.out.println("I see. So you are " + player.playerName + " you know where you are? Or why are you here?");
        System.out.println("Probably not.. Right?.. You see " + player.playerName + " you died." +
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
        DialogueSystem dialogueSystem = new DialogueSystem();
        // puts user input into decision
        dialogueSystem.dialogueOptions(firstQuestion);

        System.out.println("*He reads carefully a note that appeared on his hand. Then by a swing of his hand, the note" +
                " suddenly vanishes* It appears that I have been ordered to provide you with a GIFT. " +
                "This gift it's a... unique skill that you will have. Gifts are only provided to the chosen ones. " +
                "Meaning you have been chosen by the Lord and he trusts you with his gift.");

        System.out.println("*Four cards appear in front of you.*\n" +
                            "----------------------------------\n" +
                            "Which one you grab?:\n" +
                            "1. A card with an eye, golden coloured.\n" +
                            "2. A silver card\n" +
                            "3. A black card with a hand absorbing something.\n" +
                            "4. A card with various letter types, blue coloured.");

        DialogueNode uniqueSkillChoice = new DialogueNode();
        uniqueSkillChoice.options = new ArrayList<>();
        // 1.
        uniqueSkillChoice.options.add("That card represents the power of the Akashic eye. \"Akashic Sight\"  is it's name" +
                ". With the Akashic Sight you will learn the basic version of any magic spell you are a witness of." +
                " You will learn even more if they are used against you. This won't provide you with instant mastery," +
                " but it will give you a headstart in the arts of aetherial manipulation, giving you endless" +
                " potential for eventual mastery." );
        // 2.
        uniqueSkillChoice.options.add("That silver card represents the unique skill \"Divine Cognition\"." +
                " With it, you accelerate your thoughts, and even your body. Though that would require some training" +
                " on your end. But it will help you reach incredible amount of speed more quickly, as well as more" +
                " time for thinking.");
        // 3.
        uniqueSkillChoice.options.add("That one... that's \"Soul Confluence\"... I-.. I don't recommend that one." +
                " I don't even know why is around this other choices. I am sure that I did not summon that..." +
                " Did the Lord do it?... Anyways. Soul Confluence let's you absorb the soul of the recently dead if" +
                " their soul consent to it. After absorbing you will acquire all the knowledge and skills that the" +
                " soul had. Just be careful on absorbing someone potentially stronger than you, they could take over." +
                " If you chose to use this, thread carefully. You might end up losing yourself, your identity.");
        // 4.
        uniqueSkillChoice.options.add("Oh. \"Omnilingualism\". This unique skill let's you understand and speak" +
                " any language existing... Keep in mind this won't allow you to communicate with species that do" +
                " not have a concept of language. But you could talk even to us in our normal language. And to" +
                " everyone in Grandea... Keep in mind, we will provide you with the language of the continent you" +
                " are going to appear even if you don't chose this card. But this could be very useful.");

        uniqueSkillChoice.confirm= "Do you want to take this one?\n" +
                                   "1. Yes\n" +
                                   "2. No";

        uniqueSkillChoice.mainDialogue2 = "----------------------------------\n" +
                "Which one you grab now?:\n" +
                "1. A card with an eye, golden coloured.\n" +
                "2. A silver card\n" +
                "3. A black card with a hand absorbing something.\n" +
                "4. A card with various letter types, blue coloured.";


        int uniqueSkill = (dialogueSystem.dialogueOptions(uniqueSkillChoice));

        System.out.println("[DEBUG] YOU CHOSE:" + uniqueSkill);

        switch (uniqueSkill) {
            case 1:
                System.out.println("So the Akashic Sight huh.");
                player.uniqueSkill = "Akashic Sight";
                break;
            case 2:
                System.out.println("So the Divine Cognition huh.");
                player.uniqueSkill = "Divine Cogition";
                break;
            case 3:
                System.out.println("So the Soul Confluence huh.");
                player.uniqueSkill = "Soul Confluence";
                break;
            case 4:
                System.out.println("So the Omnilingualism huh.");
                player.uniqueSkill = "Omnilingualism";
                break;



        }



        System.out.println("END SUCCESSFUL");
    }
}
