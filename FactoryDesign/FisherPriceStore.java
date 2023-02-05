public class FisherPriceStore extends ToyStore {

    /**
     * @param puzzle type is input as parameter
     * @return a Plastic color puzzle if the parameter is color
     * @return a Plastic Animal Puzzle if the parameter is animal
     * @return null otherwise
     */
    public Puzzle createPuzzle(String val) {
        if(val.equals("color")) {
            return new PlasticColorPuzzle();
        } else if (val.equals("animal")) {
            return new PlasticAnimalPuzzle();
        } else
            return null;
    }
}