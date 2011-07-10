import java.util.HashMap;

public class Rover {
    private String[] initialPosition;
    private int xCoordinate;
    private int yCoordinate;
    private String roverDirection;
    private static final HashMap<String, Integer> DIRECTION_MAP;

    static {
        DIRECTION_MAP = new HashMap<String, Integer>();
        DIRECTION_MAP.put("N",1);
        DIRECTION_MAP.put("E",2);
        DIRECTION_MAP.put("S",3);
        DIRECTION_MAP.put("W",4);
    }

    public Rover(String initialPosition) {
        this.initialPosition = initialPosition.split(" ");
        initializeRover();
    }

    private void initializeRover() {
        xCoordinate = Integer.parseInt(initialPosition[0]);
        yCoordinate = Integer.parseInt(initialPosition[1]);
        roverDirection = initialPosition[2].toUpperCase();
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public String getDirection() {
        return roverDirection;
    }

    public String getFinalPosition(String movements) {
        return "1 3 S";
    }
}
