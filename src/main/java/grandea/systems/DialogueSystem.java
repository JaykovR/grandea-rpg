package grandea.systems;


import java.util.Scanner;
import grandea.Main;

public class DialogueSystem {

    public int dialogueOptions(DialogueNode dialogue){
        // uses main scanner
        Scanner scanner = Main.scanner;
        int num_options = dialogue.options.size();
        // selected stores the player selection
        int selected;

        // If its not the first run of this dialogue node, and there is a confirmation message
        // this means its a YES/NO message.
        if(!dialogue.firstRun && dialogue.confirm!= null){
            num_options = 2;
            while(true){
                // if the input is not a number or integer.
                if(!scanner.hasNextInt()){
                    System.out.println("Invalid Input. Choose only a number between 1 " + num_options + ".");
                    scanner.next();
                    continue;
                }
                selected = scanner.nextInt();

                // if the input is not within the range of options which ranges from 1 to the num of options
                if(selected < 1 || selected > num_options){
                    System.out.println("Invalid Input. Choose only a number between 1 " + num_options + ".");
                    continue;
                }
                else{
                    dialogue.firstRun = false;
                    break;
                }
            }

            // if the selected one is YES which is usually 1. Return the result.
            if (selected == 1){
                return selected;
            }
            else{
                // displays player selection
                displayChoice(dialogue, selected);
                // returns player selection
                return selected;
            }

        }

        /* IF it's the first time we have that dialogue, and it has a version where it doesn't show the
         * last option which is the option to exit the interaction then don't let them use the LAST OPTION
         * which is the one that ends the interaction. That until the second run.
         */
        if(dialogue.mainDialogue2 != null && dialogue.firstRun){
            int num_options_return = num_options - 1;
            while(true){
                // if the input is not a number or integer.
                if(!scanner.hasNextInt()){
                    System.out.println("Invalid Input. Choose only a number between 1 " + num_options_return + ".");
                    scanner.next();
                    continue;
                }
                selected = scanner.nextInt();

                // if the input is not within the range of options which ranges from 1 to the num of options
                if(selected < 1 || selected > num_options_return){
                    System.out.println("Invalid Input. Choose only a number between 1 " + num_options_return + ".");
                    continue;
                }
                else{
                    dialogue.firstRun = false;
                    break;
                }
            }
            // displays player selection
            displayChoice(dialogue, selected);
            // returns player selection
            return selected;

        }

        // normal logic
        while(true){
            // if the input is not a number or integer.
            if(!scanner.hasNextInt()){
                System.out.println("Invalid Input. Choose only a number between 1 " + num_options + ".");
                scanner.next();
                continue;
            }
            selected = scanner.nextInt();

            // if the input is not within the range of options which ranges from 1 to the num of options
            if(selected < 1 || selected > num_options){
                System.out.println("Invalid Input. Choose only a number between 1 " + num_options + ".");
                continue;
            }
            else{
                break;
            }
        }
        // displays player selection
        displayChoice(dialogue, selected);
        // returns player selection
        return selected;

    }

    public void displayChoice(DialogueNode dialogue, int choice){
        // since the option list is an array that is indexed starting with 0 then I subtract -1
        // to get the desired result.


        // IF Player selects the return option (which is always the last)
        if(choice == dialogue.options.size()){
            System.out.println(dialogue.options.get(choice-1));
            return;
        }

        // give choice
        System.out.println(dialogue.options.get(choice-1));


        // IF there is a main dialogue 2 then show the return message and the maindialogue 2
        // check for player input all again.
        if(dialogue.mainDialogue2 != null){
            // if it has a confirmation message like with options YES OR NO then show the confirmation message.
            if(dialogue.confirm != null){
                System.out.print(dialogue.confirm);
                dialogueOptions(dialogue);
            }
            else{
            System.out.println(dialogue.Return);
            System.out.println(dialogue.mainDialogue2); //display message now with return option visible
            dialogueOptions(dialogue);
            }
        }



    }

}
