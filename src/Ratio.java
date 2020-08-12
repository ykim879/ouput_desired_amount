public class Ratio {
    int salt;
    int pepper;
    int galric;

    public Ratio(int salt, int pepper, int galric) {
        this.salt = salt;
        this.pepper = pepper;
        this.galric = galric;
    }

    @Override
    public String toString() {
        return "Ratio{" +
                "salt=" + salt +
                ", pepper=" + pepper +
                ", galric=" + galric +
                '}';
    }
    public int checkOutput(Shelf shelf) {
        int result = 0;
        if(shelf.getTotal() == 1) {
            return oneCheckOut(shelf);
        } else {
            if (shelf.getLastResult() != 0) {
               return shelf.getLastResult();
            } else {
                return multipleCheckOut(shelf);
            }
        }
        return result;
    }
    private int oneCheckOut(Shelf shelf) {
        Bottle first = shelf.getBottles().peek();
        if(first.getSalt() == salt && first.getPepper() == pepper && first.getGalric() == galric) {
            shelf.setLastResult(1);
            shelf.setLastResultChart(first.getNumber());
            return 1;
        } else {
            return 0;
        }
    }
    private int multipleCheckOut(Shelf shelf) {

    }
    private int multipleCheckOut(Shelf shelf, int n) {

    }
}
