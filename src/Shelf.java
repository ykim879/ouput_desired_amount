import java.util.Iterator;
import java.util.LinkedList;

public class Shelf {
    private LinkedList<Bottle> bottles;
    private int lastResult;
    private boolean[] lastResultChart;// may need to change to integer LinkedList

    public Shelf(int total) {
        bottles = new LinkedList<>();
        lastResult = 0;
        lastResultChart = new boolean[total];
    }
//put constructor includes int as parameter

    public void setLastResult(int lastResult) {
        this.lastResult = lastResult;
    }

    public void setLastResultChart(int index) {
        lastResultChart[index] = true;
    }
    public void addBottle(Bottle bottle) {
        bottles.add(bottle);
    }
    public void removeBottle(int n) {
        //since bottle has unique name and removing is indicating the unique name, deal with iterator
        Iterator current = bottles.iterator();
    }
    public LinkedList<Bottle> getBottles() {
        return bottles;
    }

    public int getTotal() {
        return bottles.size();
    }

    public int getLastResult() {
        return lastResult;
    }

    public boolean[] getLastResultChart() {
        return lastResultChart;
    }
}
