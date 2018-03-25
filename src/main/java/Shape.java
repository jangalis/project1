import java.util.HashMap;
import java.util.Map;

public class Shape {
    private String id;
    private String dimensions;
    private String[] dimenstionsArray;

    private static int shapesCount = 0;
    private static int triangle = 0;
    private static int square = 0;
    private static int pentagon = 0;
    private static int hexagon = 0;
    private static int heptagon = 0;
    private static int octagon = 0;
    private static int nonagon = 0;
    private static int decagon = 0;

    public Shape() {
    }

    Shape(String id, String dimensions) {
        this.id = id;
        this.dimensions = dimensions;
        shapesCount++;
    }

    public static void totalNumberOfShapes() {
        System.out.println("\nTotal number of shapes is: " + shapesCount);
    }

    private int countOfCorners() {
        dimenstionsArray = dimensions.split(";");
        return dimenstionsArray.length + 2;
    }

    public int countOfShapes() {

        switch (countOfCorners()) {
            case (3):
                return triangle;
            case (4):
                return square;
            case (5):
                return pentagon;
            case (6):
                return hexagon;
            case (7):
                return heptagon;
            case (8):
                return octagon;
            case (9):
                return nonagon;
            case (10):
                return decagon;
            default:
                return 0;
        }
    }

    public String shapeName() {
        Map<Integer, String> shapeMap = new HashMap<>();
        shapeMap.put(3, "Triangle");
        shapeMap.put(4, "Square");
        shapeMap.put(5, "Pentagon");
        shapeMap.put(6, "Hexagon");
        shapeMap.put(7, "Heptagon");
        shapeMap.put(8, "Octagon");
        shapeMap.put(9, "Nonagon");
        shapeMap.put(10, "Decagon");

        switch (countOfCorners()) {
            case (3):
                triangle++;
                break;
            case (4):
                square++;
                break;
            case (5):
                pentagon++;
                break;
            case (6):
                hexagon++;
                break;
            case (7):
                heptagon++;
                break;
            case (8):
                octagon++;
                break;
            case (9):
                nonagon++;
                break;
            case (10):
                decagon++;
                break;
        }
        return shapeMap.get(countOfCorners());
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
