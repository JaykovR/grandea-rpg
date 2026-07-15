package grandea;

import grandea.entities.Player;
import grandea.systems.DialogueNode;
import grandea.systems.DialogueOption;
import grandea.systems.DialogueSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Testing3 {
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
        firstQuestion.dialogue = "------------------------------ \n" +
                "Select your dialogue option: \n";
        firstQuestion.options = new ArrayList<>();


        DialogueNode firstQuestion2 = new DialogueNode();
        firstQuestion2.dialogue = "------------------------------ \n" +
                "Select your dialogue option:\n";
        firstQuestion2.options = new ArrayList<>();

        DialogueOption whoAreYou = new DialogueOption();
        whoAreYou.label = "1. What exactly are you?";
        firstQuestion.options.add(whoAreYou);
        firstQuestion2.options.add(whoAreYou);

        DialogueNode whoAreYouAns = new DialogueNode();
        whoAreYouAns.dialogue = "As I said. I am no more than a mere messanger from my Lord.\n" +
               "Hmm.. In terms you would understand. I am the equivalent of an angel.\n" +
                "My name is Laak. I can't provide you with more information other than that.";
        whoAreYouAns.options = new ArrayList<>();
        whoAreYou.leadsTo = whoAreYouAns;


        DialogueOption oldLife = new DialogueOption();
        oldLife.label = "2. Can't I go back to my old life?";
        firstQuestion.options.add(oldLife);
        firstQuestion2.options.add(oldLife);

        DialogueNode oldLifeAns = new DialogueNode();
        oldLifeAns.dialogue = "No. Your body is.. no more. And besides, don't allow mortals\n" +
               "To go back after death. That is forbidden.";
        oldLifeAns.options = new ArrayList<>();
        oldLife.leadsTo = oldLifeAns;

        DialogueOption kindOfWorld = new DialogueOption();
        kindOfWorld.label = "3. What kind of world I am going to?";
        firstQuestion.options.add(kindOfWorld);
        firstQuestion2.options.add(kindOfWorld);

        DialogueNode kindOfWorldAns = new DialogueNode();
        kindOfWorldAns.dialogue = "You would call it a Fantasy world.\n" +
                "In this world, people are able to alter materia using their mind.\n" +
                "Similar to this. *He raises one finger and a small purple flame appears on the tip\n" +
                "of his finger*.";
        kindOfWorldAns.options = new ArrayList<>();
        kindOfWorld.leadsTo = kindOfWorldAns;

        DialogueOption moreQuestions = new DialogueOption();
        moreQuestions.label = "1. I have more questions";
        moreQuestions.leadsTo  = firstQuestion2;
        whoAreYouAns.options.add(moreQuestions);
        oldLifeAns.options.add(moreQuestions);
        kindOfWorldAns.options.add(moreQuestions);

        DialogueOption noMoreQuestions = new DialogueOption();
        noMoreQuestions.label = "2. I don't have any other questions";
        noMoreQuestions.leadsTo = null;
        whoAreYouAns.options.add(noMoreQuestions);
        oldLifeAns.options.add(noMoreQuestions);
        kindOfWorldAns.options.add(noMoreQuestions);

        DialogueOption noMoreQuestions2 = new DialogueOption();
        noMoreQuestions2.label = "4. I don't have any other questions";
        noMoreQuestions2.leadsTo = null;
        firstQuestion2.options.add(noMoreQuestions2);

        DialogueSystem dialogueSystem = new DialogueSystem();
        dialogueSystem.dialogueOptions(firstQuestion);

    }
}
