import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class FileReader {
    private Scanner scanner;
    private Ratio ratio;
    private Shelf shelf;

    public FileReader(String fileName) {
        try {
            scanner = new Scanner(new File(fileName));
            int line = 0;
            while (scanner.hasNextLine()) {
                line++;
                int totalCommand = -1;
                String nextLine = scanner.nextLine();
                if(line == 1) {
                    String[] values = nextLine.split(" ");
                    if(values.length == 3) {
                        ratio = new Ratio(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]));
                        System.out.println(ratio);
                    } else {
                        throw new UnvalidFileException("First line has to be with three integer values divided in space.");
                    }
                } else if (line == 2) {
                    totalCommand = Integer.parseInt(nextLine);
                    shelf = new Shelf(totalCommand);
                } else {
                    String[] values = nextLine.split(" ");
                    if (line > totalCommand + 2) { break;}
                    if (values[0].equals("A")) {
                        if (values.length == 4) {
                            Bottle newBottle = new Bottle(Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]), line - 2);
                            shelf.addBottle(newBottle);
                            ratio.checkOutput(shelf);
                        } else {
                            throw new UnvalidFileException("The line starting with A has to have three following integers");
                        }
                    } else if (values[0].equals("R")) {
                        if(!shelf.removeBottle(values[1])) {
                            System.out.println("Invalid Remove statement has occured. The program will ignore the statement");
                        }
                    }
                    //method for check bottle --> in ratio check ouput = String
                    //solution
                }
            }
        } catch (FileNotFoundException | UnvalidFileException e) {
            e.printStackTrace();
        }
    }

}
