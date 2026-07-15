package grandea;

import grandea.systems.DialogueNode;
import grandea.systems.DialogueOption;

import java.util.ArrayList;
import java.util.Scanner;

public class Testing2 {

     public static void main (String[] args) {
         Scanner scanner = new Scanner(System.in);

         DialogueNode Hello = new DialogueNode();
         Hello.dialogue = "Welcome to this world!";
         Hello.options = new ArrayList<>();

         DialogueNode Cagada = new DialogueNode();
         Cagada.dialogue = "You can't see anything";
         Cagada.options = new ArrayList<>();

         DialogueNode monster = new DialogueNode();
         monster.dialogue = "A monster comes at you";
         monster.options = new ArrayList<>();

         DialogueOption lookAround = new DialogueOption();
         lookAround.label = "1. Look Around";
         lookAround.leadsTo = Cagada;
         Hello.options.add(lookAround);

         DialogueOption shout = new DialogueOption();
         shout.label = "2. Shout your lunges out";
         shout.leadsTo = monster;
         Hello.options.add(shout);

         DialogueOption nothing = new DialogueOption();
         nothing.label = "There is nothing there.";
         nothing.leadsTo = null;
         Cagada.options.add(nothing);

         DialogueNode current = Hello;
         while(current != null){
             //
             System.out.println(current.dialogue);
             // Displays the options available to go.
             for (int i = 0; i < current.options.size(); i++){
                 System.out.println(current.options.get(i).label);
             }

             int choice = scanner.nextInt();

             current = current.options.get(choice - 1).leadsTo;
         }
         System.out.println("Fuera del loop");

     }

}
