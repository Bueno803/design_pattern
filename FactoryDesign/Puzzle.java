import java.util.ArrayList;
/**
 * Puzzle variables
 * @author Abdullah Bueno
 */
public abstract class Puzzle {
    protected String name;
    protected String material;
    protected ArrayList<String> pieces = new ArrayList<String>();

    /**
     * @return concatenated statement with each variable Name of the puzzle, Material type & List of puzzle pieces
     */
    public String assemble() {
        String returnStatement = "";
        returnStatement = "putting together a " +
        name + "\nThis puzzle is made out of " +
        material + "\nAdding the following pieces:\n";

        for(String piece : pieces) {
            returnStatement += piece + "\n";
        }
        return returnStatement;
    }

    /**
     * @return return statement for the name of the puzzle to be put in a box
     */
    public String boxPuzzle() {
        return "putting the " + name + " in a box\n";
    }
}