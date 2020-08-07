import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class FileReader {
    private Scanner scanner;
    private Ratio ratio;

    public FileReader(String fileName) {
        try {
            scanner = new Scanner(new File(fileName));
            int line = 0;
            while (scanner.hasNextLine()) {
                line++;
                int totalCommand;
                String nextLine = scanner.nextLine();
                if(line == 1) {
                    String r[] = nextLine.split(" ");
                    if(r.length == 3) {
                        ratio = new Ratio(Integer.parseInt(r[0]), Integer.parseInt(r[1]), Integer.parseInt(r[2]));
                        System.out.println(ratio);
                    } else {
                        throw new UnvalidFileException("First line has to be with three integer values divided in space.");
                    }
                } else if (line == 2) {
                    totalCommand = Integer.parseInt(nextLine);
                } else {
                    //method for check bottle --> in ratio check ouput = String
                    //solution
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnvalidFileException e) {
            e.printStackTrace();
        }
    }
    private LinkedList<Bottle> ReadFile() {
        LinkedList<Bottle> result = new LinkedList<>();
        return result;
    }
}
