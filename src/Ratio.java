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
        if(shelf.getTotal() == 1) {
            return oneCheckOut(shelf);
        } else {
            if (shelf.getLastResult() != 0) {
               return shelf.getLastResult();
            } else {
                return multipleCheckOut(shelf);
            }
        }
    }
    private int oneCheckOut(Shelf shelf) {
        Bottle first = shelf.getBottles().peek();
        if(first.getSalt() == salt && first.getPepper() == pepper && first.getGalric() == galric) {
            setResult(shelf, 1, first.getNumber());
            return 1;
        } else {
            return 0;
        }
    }
    private int multipleCheckOut(Shelf shelf) {
        //check first last checkOut
        Bottle last = shelf.getBottles().getLast();
        if (last.getPepper() == pepper && last.getSalt() == salt && last.getGalric() == galric) {
            setResult(shelf, 1, last.getNumber());
            return 1;
        } else {

        }
    }
    private int multipleCheckOut(Shelf shelf, int n) {

    }
    private void setResult(Shelf shelf, int total, int bottleNum) {
        shelf.setLastResult(1);
        shelf.setLastResultChart(bottleNum);
    }
}
