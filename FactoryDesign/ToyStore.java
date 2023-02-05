public abstract class ToyStore {

    /**
     * 
     * @param val is the input for the type of puzzle
     * @return returns the assemble statement for the puzzle
     */
    public String orderPuzzle(String val) {
        Puzzle puzzle = createPuzzle(val);
        
        puzzle.boxPuzzle();
        
        return puzzle.assemble();
    }

    /**
     * 
     * @param val is the input of the type of puzzle
     * @return the puzzle object with the variables/materials/list of pieces initialized
     */
    public abstract Puzzle createPuzzle(String val);
}