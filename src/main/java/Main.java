import com.opencsv.CSVReader;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        String FILE_DIR = "src/main/resources/shapes.db";
        String[] nextLine;
        Shape shape;
        Operations operations = new Operations();

        try (CSVReader reader = new CSVReader(new FileReader(FILE_DIR), '|')) {
            while ((nextLine = reader.readNext()) != null) {
                shape = new Shape(nextLine[0], nextLine[1]);
                System.out.println("Id: " + shape.getId() + "  ,Name of Shape : " + shape.shapeName() + " ,Count of shape: " + shape.countOfShapes());
            }

            Shape.totalNumberOfShapes();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}