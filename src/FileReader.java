import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class FileReader {
    private Scanner scanner;

    public FileReader(String fileName) {
        try {
            scanner = new Scanner(new File(fileName));
            int line = 0;
            while (scanner.hasNextLine()) {
                line++;
                if(line == 1) {
                    //Ratio
                } else if (line == 2) {
                    //result update
                } else {
                    //method for check bottle --> in ratio check ouput = String
                    //solution
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private LinkedList<Bottle> ReadFile() {
        LinkedList<Bottle> result = new LinkedList<>();
        return result;
    }
}
