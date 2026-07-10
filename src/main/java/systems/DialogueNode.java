package systems;

import java.util.ArrayList;

public class DialogueNode {
    public String mainDialogue;
    public ArrayList<String> options;
    public String Return;

    /* mainDialogue2 - Option with return option visible. Including this means that
     * the system will detect as if it has a return dialogue and so.
     */
    public String mainDialogue2;
    boolean firstRun = true ;



}
