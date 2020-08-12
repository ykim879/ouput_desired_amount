import java.util.LinkedList;

public class Shelf {
    private LinkedList<Bottle> bottles;
    private int lastResult;
    private boolean[] lastResultChart;// may need to change to integer LinkedList
    //put constructor includes int as parameter

    public void setLastResult(int lastResult) {
        this.lastResult = lastResult;
    }

    public void setLastResultChart(int index) {
        lastResultChart[index] = true;
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
