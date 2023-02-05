public class MelissaAndDougStore extends ToyStore {
    /**
     * @param puzzle type is input as parameter
     * @return a Wood color puzzle if the parameter is color
     * @return a Wood Animal Puzzle if the parameter is animal
     * @return null otherwise
     */
    public Puzzle createPuzzle(String val) {
        if(val.equals("color")) {
            return new WoodColorPuzzle();
        } else if(val.equals("animal")) {
            return new WoodAnimalPuzzle();
        } else {
            return null;
        }
    }    
}
